import java.util.Random;
public class HoT{
    public static void main(String[] args){
	    Random rand = new Random();
	    int head = 0, tail = 0;
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
    }
}
