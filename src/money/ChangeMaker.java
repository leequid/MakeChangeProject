package money;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		double price = 1.03;
		double paid = 1;
		double changes = price - paid;
		String change;
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00"); 
		change = df.format(changes);
		System.out.println(change);
	

	}

}
