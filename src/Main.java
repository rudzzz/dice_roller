import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random randomNumer = new Random();
		int dice = randomNumer.nextInt(6) + 1;
		
		System.out.printf("You have got a %d", dice);
	}
}
