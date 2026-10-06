import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
	public static void main(String[] args){
		Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("Can you guess what it is?");
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number:");
        int number2 = in.nextInt();
        System.out.print("Your guess is");
        System.out.println(number2);
        if(number2 > number){
			System.out.println("too high");
		}else if(number2<number){
			System.out.println("too low");
			}else{
			System.out.println("You are correct!");
			return;
				}
		
		System.out.print("Type a number:");
        int number3 = in.nextInt();
        System.out.print("Your guess is");
        System.out.println(number3);
        if(number3 > number){
			System.out.println("too high");
		}else if(number3<number){
			System.out.println("too low");
			}else{
			System.out.println("You are correct!");
			return;
				}
				
		System.out.print("Type a number:");
        int number4 = in.nextInt();
        System.out.print("Your guess is");
        System.out.println(number4);
        if(number4 > number){
			System.out.println("too high");
		}else if(number4<number){
			System.out.println("too low");
			}else{
			System.out.println("You are correct!");
			return;
				}
		System.out.print("You didn't get the number,the number is "+number);
	}
}
