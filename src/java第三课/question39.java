package javaµÚÈý¿Î;
import java.util.Scanner;
public class question39 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		String number=input.nextLine();
		int number2=Integer.parseInt(number);
		int sum=0;
		int i=9;
		while(i>0) {
			sum+=(number2%10)*i;
			i--;
			number2/=10;
		}
		int check=sum%11;
		String check1 = Integer.toString(check);
		if(check==10)
			check1="X";
		System.out.print(number+check1);
	}
}
