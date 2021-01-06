package javaµÚÈý¿Î;

import java.awt.print.Printable;

public class question324 {
	public static void main(String[] args) {
		int number=(int)(Math.random()*12)+1;
		int color=(int)(Math.random()*3)+1;
		switch(color) {
		case 1:System.out.println("Clubs");
			break;
		case 2:System.out.println("Diamonds");
			break;
		case 3:System.out.println("Hearts");
			break;
		case 4:System.out.println("Spades");
			break;
		}
		switch(number) {
		case 1:System.out.println("Ace");
			break;
		case 2:System.out.println("2");
			break;
		case 3:System.out.println("3");
			break;
		case 4:System.out.println("4");
			break;
		case 5:System.out.println("5");
			break;
		case 6:System.out.println("6");
			break;
		case 7:System.out.println("7");
			break;
		case 8:System.out.println("8");
			break;
		case 9:System.out.println("9");
			break;
		case 10:System.out.println("10");
			break;
		case 11:System.out.println("Jack");
			break;
		case 12:System.out.println("Queen");
			break;
		case 13:System.out.println("King");
			break;
		}
	}
}
