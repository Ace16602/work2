package javaµÚÈý¿Î;
import java.util.Scanner;

public class question319 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int side1 = scan.nextInt();
		int side2 = scan.nextInt();
		int side3 = scan.nextInt();
	if(side1+side2<=side3||side2+side3<=side1||side1+side3<=side2) {
		System.out.println("It's incorrect!");
	}
	else {
		System.out.println(side1+side2+side3);
	}
		
	}
}
