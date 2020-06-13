import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = 0, Y = 0;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		for (int i = 1; i <= Y; i++) {
						
			System.out.print(i);
			if (i % X != 0) {
			System.out.print(" ");
			}else {
			System.out.println("");
				}
			}
		

		sc.close();
	}

}
