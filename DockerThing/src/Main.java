import java.util.concurrent.ThreadLocalRandom;
public class Main {
	
	public static void main(String[] args) {
		int rand = ThreadLocalRandom.current().nextInt(10, 101);
		for(int i = 0; i < rand; i++) {
			printBadgers(12);
			printMushrooms(2);
		}
	}
	
	public static void printBadgers(int badgers) {
		for(int i = 0; i < badgers; i++) {
			System.out.print("Badger ");
		}
	}
	
	public static void printMushrooms(int mushrooms) {
		for(int i = 0; i < mushrooms; i++) {
			System.out.println("Mushroom");
		}
	}
}
