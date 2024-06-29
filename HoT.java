import java.util.Random;
import java.util.Scanner;
public class HoT{
    public static void main(String[] args){
	    Random rand = new Random();
	    Scanner sc = new Scanner(System.in);
	    int head = 0, tail = 0;
	    System.out.println("Who are you?");
	    String name = sc.next();
	    System.out.println("Hello, " + name + "!");
	    System.out.println("Tossing a coin...");
	    for(int i=1;i<=3;i++){
	        System.out.print("Round " + i + ": ");
	        int num = rand.nextInt(2);
	        if(num == 0){
		          System.out.println("Heads");
		          head++;
	        }else if(num == 1){
		          System.out.println("Tails");
		          tail++;
	        }
	    }
	    System.out.println("Heads: " + head + ", Tails: " + tail);
	    if(head > tail)System.out.println("You won!");
	    else System.out.println("You lost!");
    }
}
