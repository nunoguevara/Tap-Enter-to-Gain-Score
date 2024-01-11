import java.util.Scanner;

public class Main {
				
				public static void main(String[] args) {
								int score = 0;
								Scanner enter = new Scanner(System.in);
								while (true) {
												System.out.println("Your score: " + score);
												System.out.printf("Tap Enter to add score");
												enter.nextLine();
												score += 1;
												
								}
				}
				
}