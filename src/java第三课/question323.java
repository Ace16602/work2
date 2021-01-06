package javaµÚÈý¿Î;
import java.util.Scanner;
public class question323 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String point = input.next();
		String[] nums = point.split(",");
		int x = Integer.parseInt(nums[0]);
		int y = Integer.parseInt(nums[1]);
		if(x<=10&&x>=-10&&y<=5&&y>=-5)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}