import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class App {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

	    Random rand = new Random();

	    int num1 = rand.nextInt(0,10) + 1;
	    int num2 = rand.nextInt(0,10) + 1;
	    int num3 = rand.nextInt(0,10) + 1;

	    int mony = 5;

	    String vastaus = "";



	    do {
	    	System.out.println("1 Peli = 1 euro. Sinulla on " + mony + " euroa\nx = lopeta");
	    	vastaus = in.nextLine();

	    	if (vastaus.equals("x")) {
	    		break;
	    	}

	    	mony -= 1;

	    	num1 = rand.nextInt(0,10) + 1;
	    	num2 = rand.nextInt(0,10) + 1;
	    	num3 = rand.nextInt(0,10) + 1;

	    	System.out.println((num1) + " " + (num2) + " " + (num3));

	    	int seiskat = 0;

	    	if (num1 == 7) {
	    		seiskat += 1;
	    	}
	    	if (num2 == 7) {
	    		seiskat += 1;
	    	}
	    	if (num3 == 7) {
	    		seiskat += 1;
	    	}

			if (seiskat > 0) {
				switch (seiskat) {
					case 1:
						mony += 3;
						break;
					case 2:
						mony += 5;
						break;
					case 3:
						mony += 10;
						break;
				}
				
				System.out.println("YOU WIN");
			}
	    } while (mony > 0);

	    if (mony <= 0) {
	    	System.out.println("Sinulta loppui rahat\nGAME OVER");
	    }
	}
}