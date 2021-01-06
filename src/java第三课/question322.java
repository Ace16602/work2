package javaµÚÈý¿Î;
import java.util.Scanner;
public class question322 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String point = input.next();
		String[] nums = point.split(",");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		if((a*a+b*b)>100)
			System.out.print("No");
		else
			System.out.print("Yes");
	}
}
