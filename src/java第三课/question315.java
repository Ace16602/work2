package java������;
import java.util.Scanner;
public class question315 {
	public static void main(String[] args) {
		int lottery=(int)(Math.random()*1000);
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter your lottery pick(three digits):");
		int guess = input.nextInt();
		int lotteryDigit1 = lottery%10;
		int transition = lottery/10;
		int lotteryDigit2 = transition %10;
		int lotteryDigit3 = transition / 10;
		
		int guessDigit1 = guess%10;
		int transition1 = guess/10;
		int guessDigit2 = transition1 %10;
		int guessDigit3 = transition1 /10;
		
		if(guess==lottery)
			System.out.println("Exact match:you win $10,000");
		else if((lotteryDigit1==guessDigit1&&lotteryDigit2==guessDigit3&&lotteryDigit3==guessDigit2)||
				(lotteryDigit2==guessDigit2&&lotteryDigit1==guessDigit3&&lotteryDigit3==guessDigit1)||
				(lotteryDigit3==guessDigit3&&lotteryDigit1==guessDigit2&&lotteryDigit2==guessDigit1)||
				(lotteryDigit1==guessDigit2&&lotteryDigit2==guessDigit3&&lotteryDigit3==guessDigit1)
				)
			System.out.println("Match all digits:you win $3,000");
		else if(lotteryDigit1==guessDigit1||lotteryDigit2==guessDigit2||lotteryDigit3==guessDigit3||
				lotteryDigit1==guessDigit2||lotteryDigit1==guessDigit3||lotteryDigit2==guessDigit3)
			System.out.println("Match one digit:you win $1,000");
		else
			System.out.println("Sorry,no match");
	}
}
