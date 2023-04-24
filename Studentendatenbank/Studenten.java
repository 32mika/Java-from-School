package Studentendatenbank;

import java.util.*;
import java.io.*;

public class Studenten {
	private String vorname;
	private String nachname;
	private String studiengang;
	private int martikel;
	private int alter;
	private int groeße;
	public Studenten datenBank[];
	public File liste;
	public Scanner scanU = new Scanner(System.in);
	public Random rand = new Random();
	public Scanner scanL;
	
	Studenten(String vorname, String nachname, String studiengang, int martikel, int alter){
		this.vorname = vorname; 
		this.nachname = nachname;
		this.studiengang = studiengang;
		this.martikel = martikel;
		this.alter = alter;
		
	}
	
	Studenten(int groeße){
		
		this.vorname = randVorname();
		this.nachname = randNachname();
		this.studiengang = randStudiengang();
		this.martikel = rand.nextInt(10000000);
		this.alter = rand.nextInt(100);
		this.groeße = groeße;
		this.datenBank = new Studenten[groeße];
		openDaten();
	
	}
	
	private Studenten(){
		this.vorname = randVorname();
		this.nachname = randNachname();
		this.studiengang = randStudiengang();
		this.martikel = rand.nextInt(10000000);
		this.alter = rand.nextInt(100);
		
	}
	
	public String datenPrint() {
		String ret;
		ret = "Vorname: " + vorname + " Nachname: " + nachname + " Studiengang: " + studiengang + " Martikel: " + martikel + " Alter: " + alter;
		
		return ret;
	}
	
	public String randVorname(){
		String [] namen = new String [100];
		int count = 0;
		liste = new File("C:/Users/Mika/OneDrive/Desktop/eclipse3/objekt_orientiert/src/Studentendatenbank/namensListe.txt");
		
		try {
			scanL = new Scanner(liste);
		} catch(FileNotFoundException e) {
			System.out.println("Fehler");
		}
		
		while(scanL.hasNext()) {
			namen[count] = scanL.nextLine();
			count++;
		}
		
		return namen[rand.nextInt(100)];
	}
	
	public String randNachname(){
		String [] namen = new String [100];
		int count = 0;
		liste = new File("C:/Users/Mika/OneDrive/Desktop/eclipse3/objekt_orientiert/src/Studentendatenbank/nachnameListe.txt");
		
		try {
			scanL = new Scanner(liste);
		} catch(FileNotFoundException e) {
			System.out.println("Fehler");
		}
		
		while(scanL.hasNext()) {
			namen[count] = scanL.nextLine();
			count++;
		}
		
		return namen[rand.nextInt(100)];
	}
	
	public String randStudiengang(){
		String [] gang = new String [10];
		int count = 0;
		liste = new File("C:/Users/Mika/OneDrive/Desktop/eclipse3/objekt_orientiert/src/Studentendatenbank/studiengang.txt");
		
		try {
			scanL = new Scanner(liste);
		} catch(FileNotFoundException e) {
			System.out.println("Fehler");
		}
		
		while(scanL.hasNext()) {
			gang[count] = scanL.nextLine();
			count++;
		}
		
		return gang[rand.nextInt(10)];
	}
	
	private void openDaten() {
		for(int i = 0; i < groeße; i++) {
			datenBank[i] = new Studenten();
			
					
			}
	}
	
	public void ausgabeDaten() {
		for(int i = 0, c = 1; i < groeße; i++, c++){
			System.out.println("Nummer " + c + " Vorname: " + datenBank[i].vorname + " Nachname: " + datenBank[i].nachname + " Studiengang: " + datenBank[i].studiengang + " Alter: " + datenBank[i].alter + " Martikel: " + datenBank[i].martikel);
		}
	}
	
	public void addStudent(String vorname, String nachname, String studiengang, int alter , int martikelnummer) {
		Studenten neuStudent = new Studenten(vorname, nachname, studiengang, martikelnummer, alter);
		Studenten neueDatenbank [] = new Studenten[datenBank.length +1];
		int count = 0;
		
		for(Studenten i : datenBank) {
			neueDatenbank[count] = i;
			count++;
		}
		
		neueDatenbank[datenBank.length] = neuStudent;
		datenBank = new Studenten[datenBank.length +1];
		datenBank = neueDatenbank;
		groeße++;
		
	}
	
	public void deleteStudent(int delmart) {
		Studenten neueDatenbank [] = new Studenten[datenBank.length -1];
		int countmart = 0;
		int count = 0;
		boolean skip = false;
		boolean pastskip = false;
		boolean foundDel = false;
		
		
		for(int i = 0; i < groeße; i++) {
			if(delmart == datenBank[i].martikel) {
				countmart = i;
				foundDel = true;
			}
		}
		
		if(foundDel == false) {
			System.out.println("Keine gueltige Martikel Nummer");
			System.exit(1);
		}
		
		for(Studenten d : datenBank){
			if(countmart == count & pastskip == false) {
				count++;
				skip = true;
			}
			
			if(count < groeße & skip == false) {
			neueDatenbank[count] = d;
			count++;
			
			}else if(count < groeße & skip == true) {
				count--;
				neueDatenbank[count] = d;
				skip = false;
				pastskip = true;
			}
		}
	
		datenBank = new Studenten[datenBank.length -1];
		datenBank = neueDatenbank;
		groeße--;
	
	}

	public int countStudents() {
		return groeße;
	}
	
	public String statsStudents() {
		double avgAge = 0;
		double avgMartikel = 0;
		String ret = "";
		
		for(int i = 0; i < groeße; i++) {
			avgAge = avgAge + datenBank[i].alter;
			avgMartikel = avgMartikel + datenBank[i].martikel;
		}
		
		avgAge = avgAge / groeße;
		avgMartikel = avgMartikel / groeße;
		ret = "Martikel Avg: " + Integer.toString(martikel);
		ret = ret + " Alter Avg: " + avgAge;
		
		return ret;
	}
}
