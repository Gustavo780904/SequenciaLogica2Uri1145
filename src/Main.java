import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = 0, Y = 0;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		sc.close();
	}

}
