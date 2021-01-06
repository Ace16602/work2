package javaµÚÈý¿Î;
import java.util.Scanner;
public class question321 {
	public static void main(String[] args) {
		System.out.print("Enter year:");
		Scanner input= new Scanner(System.in);
		int year=input.nextInt();
		System.out.print("Enter month:");
		int month=input.nextInt();
		System.out.print("Enter the day of the month:1-31:");
		int day=input.nextInt();
		int h=(day+(26*(month+1))/10+year%100+(year%100)/4+year/400+year/20)%7;
		switch(h) {
		case 0:System.out.print("Saturday");
		case 1:System.out.print("Sunday");
		case 2:System.out.print("Monday");
		case 3:System.out.print("Tuesday");
		case 4:System.out.print("Wednesday");
		case 5:System.out.print("Forday");
		case 6:System.out.print("Friday");
		
		}
	}
}
