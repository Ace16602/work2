package javaµÚÈı¿Î;
import java.util.Scanner;
public class question327 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String point = input.next();
		String[] nums = point.split(",");
		double x = Integer.parseInt(nums[0]);
		double y = Integer.parseInt(nums[1]);
		if(x<=200&&x>=0&&y<=100&&y>=0&&y<=(1/2)*x+100)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}