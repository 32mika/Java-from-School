package turtle_Graph;

import java.awt.Color;
import java.util.Scanner;

import ch.aplu.turtle.Turtle;

public class graph {
    Scanner scan = new Scanner(System.in);
    public static int lenght_x = 400;
    public static int arrow_d = 135;
    static Turtle tur_graph = new Turtle();
    
    public static void main(String[] args) {
    		graph.diagramm();


    }
    
    public static void diagramm() {
    	graph.xAchse();
      graph.yAchse();
      graph.xArrow();
      graph.yArrow();
      graph.xLabeling();
      graph.yLabeling();
    
    }
       
    public static void xAchse() {
        tur_graph.hideTurtle();
        tur_graph.right(90);
        
        
        for(int i = -1; i < 1; i++) {
        	tur_graph.setPos(-200, i);
          tur_graph.forward(lenght_x);
          
        }
    }
    
    public static void yAchse() {
    	tur_graph.home();
    	tur_graph.hideTurtle();
    	
    	for(int i = -1; i < 1; i++) {
    		tur_graph.setPos(i, -200);
    		tur_graph.forward(400);
    		
    	}

    }
    
    public static void xArrow(){
    	int x_cord = -201; 
    	tur_graph.hideTurtle();
      tur_graph.home();
    	
      for(int i = 0; i < 5; i++) {
      	tur_graph.setPos(x_cord, 0);
      	tur_graph.left(90);
      	tur_graph.left(arrow_d);
      	tur_graph.forward(10);
      	
      	tur_graph.setPos(x_cord, 0);
      	tur_graph.right(arrow_d);
      	tur_graph.right(arrow_d);
      	tur_graph.forward(10);
      	tur_graph.left(arrow_d);
      	tur_graph.left(270);
      	x_cord++;
      	
      }
      
      x_cord = 201;
      
      for(int i = 0; i < 5; i++) {
      	tur_graph.setPos(x_cord, 0);
      	tur_graph.left(90);
      	tur_graph.left(45);
      	tur_graph.forward(10);
      	
      	tur_graph.setPos(x_cord, 0);
      	tur_graph.right(45);
      	tur_graph.right(45);
      	tur_graph.forward(10);
      	tur_graph.left(45);
      	tur_graph.right(90);
      	x_cord--;
      
      }
    
    }

    public static void yArrow() {
    	int x_cord = -201;
    	tur_graph.home();
    	
    	for(int i = 0; i < 5; i++) {
      	tur_graph.setPos(-1, x_cord);
      	tur_graph.left(180);
      	tur_graph.left(arrow_d);
      	tur_graph.forward(10);
      	
      	tur_graph.setPos(0, x_cord);
      	tur_graph.right(arrow_d);
      	tur_graph.right(arrow_d);
      	tur_graph.forward(10);
      	tur_graph.left(arrow_d);
      	tur_graph.left(180);
      	x_cord++;
      	
      }
      
      x_cord = 201;
      
      for(int i = 0; i < 5; i++) {
      	tur_graph.setPos(-1, x_cord);
      	tur_graph.left(180);
      	tur_graph.left(45);
      	tur_graph.forward(10);
      	
      	tur_graph.setPos(0, x_cord);
      	tur_graph.right(45);
      	tur_graph.right(45);
      	tur_graph.forward(10);
      	tur_graph.left(45);
      	tur_graph.right(180);
      	x_cord--;
      
      }
    }
    
    public static void xLabeling() {
    	double x_cord;
    	int x_print;
    	String x_cordS;
    	
    	x_cord = -180;
    	x_cordS = "";
    	
    	tur_graph.hideTurtle();
    	tur_graph.home();
    	tur_graph.setFontSize(10);
    	
    	for(int i = 0; i < 19; i++) {
    		tur_graph.setPos(x_cord, -5);
    		tur_graph.forward(10);
    		x_cord = x_cord + 30;
    		
    		
    	}
    	
    	x_cord = -187;
    	x_print = -120;
    	
    	for(int i = 0; i < 19; i++) {
    		tur_graph.setPos(x_cord, -20);
    		x_cordS = Integer.toString(x_print);
    		tur_graph.label(x_cordS);
    		
    		x_print = x_print + 20;
    		x_cord = x_cord + 30;
    		
    		
    	}
    	
    }	

    public static void yLabeling(){
    	double y_cord;
    	double x_cord;
    	int y_print;
    	String y_cordS;
    	
    	y_cord = -180;
    	y_cordS = "";
    	
    	tur_graph.hideTurtle();
    	tur_graph.home();
    	tur_graph.right(90);
    	tur_graph.setFontSize(10);
    	
    	for(int i = 0; i < 19; i++) {
    		tur_graph.setPos(-5, y_cord);
    		tur_graph.forward(10);
    		y_cord = y_cord + 30;
    		
    	}
    	
    	y_cord = 26;
    	y_print = 20;
    	x_cord = -27;
    	
    	for(int i = 0; i < 10; i++) {
    		y_cordS = Integer.toString(y_print);
    		
    		if(y_cordS.equals("0")) {
    			y_cordS = "";
    			tur_graph.setPos(-27, y_cord);
    		
    		}else if(y_cordS.length() < 3) {
    			y_cordS = y_cordS + " ";
    			x_cord = -22;
    			tur_graph.setPos(x_cord, y_cord);
    			x_cord = -27;
    		
    		}else {
    			tur_graph.setPos(-27, y_cord);
    		}
    		
    		
    		tur_graph.label(y_cordS);
    		
    		y_print = y_print + 20;
    		y_cord = y_cord + 30;
    		
    		
    	}
    
    	y_cord = -34;
    	y_print = -20;
    	x_cord = -20;
    	
    	for(int i = 0; i < 10; i++) {
    		y_cordS = Integer.toString(y_print);
    		
    		if(y_cordS.equals("0")) {
    			y_cordS = "";
    			tur_graph.setPos(x_cord, y_cord);
    		
    		}else if(y_cordS.length() < 4) {
    			y_cordS = y_cordS + " ";
    			x_cord = -25;
    			tur_graph.setPos(x_cord, y_cord);
    			x_cord = -30;
    		
    		}else {
    			tur_graph.setPos(x_cord, y_cord);
    		}
    		
    		
    		tur_graph.label(y_cordS);
    		
    		y_print = y_print - 20;
    		y_cord = y_cord - 30;
    		
    		
    	}
    	
   }	  	
}
