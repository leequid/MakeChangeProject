package money;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChangeMaker {

	private static Scanner kb;

	public static void main(String[] args) {
		double price = 0;
		double paid = 0;
		String change;
		kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("Type total price of product: ");
		price = kb.nextDouble();
		System.out.print("Type total amount received: ");
		paid = kb.nextDouble();
		double changes = paid - price;
		change = df.format(changes);
		
		if (price > paid) {
			System.out.println("Insufficient funds!");
		}

		else {
			System.out.println("The total change due is: " + change);
			CF1c(CF5c(CF10c(CF25c(CF1(CF5(CF10 (CF20 (changes))))))));
		}
		
		
		kb.close();

	}
	
	public static double CF20 (double amount){
		int count20 = 0;
		while (amount > 0){
			amount -= 20;
			 if(amount < 0){
				 amount +=20;
				 break;
			 }
			 else{
			count20++;
			 }
		}
		
		if(count20 !=0){
		System.out.print(count20 + " : 20 dollar bill, ");
		}
		return amount % 20;
	}
	
	public static double CF10 (double amount){
		int count10 = 0;
		while (amount > 0){
			amount -= 10;
			 if(amount < 0){
				 amount +=10;
				 break;
			 }
			 else{
			count10++;
			 }
		}
		
		if(count10 !=0){
		System.out.print(count10 + " : 10 dollar bill, ");
		}
		return amount % 10;
	}
	
	public static double CF5 (double amount){
		int count5 = 0;
		while (amount > 0){
			amount -= 5;
			 if(amount < 0){
				 amount +=5;
				 break;
			 }
			 else{
			count5++;
			 }
		}
		
		if(count5 !=0){
		System.out.print(count5 + " : 5 dollar bill, ");
		}
		return amount % 5;
	}
	
	public static double CF1 (double amount){
		int count1 = 0;
		while (amount > 0){
			amount -= 1;
			 if(amount < 0){
				 amount +=1;
				 break;
			 }
			 else{
			count1++;
			 }
		}
		
		if(count1 !=0){
		System.out.print(count1 + " : 1 dollar bill, ");
		}
		return amount % 1;
	}
	
	public static double CF25c (double amount){
		int count25c = 0;
		while (amount > 0){
			amount -= 0.25;
			 if(amount < 0){
				 amount +=0.25;
				 break;
			 }
			 else{
				 count25c++;
			 }
		}
		
		if(count25c !=0){
		System.out.print(count25c + " : 25 cents, ");
		}
	
		return amount % 0.25;
	}
	
	public static double CF10c (double amount){
		int count10c = 0;
		while (amount > 0){
			amount -= 0.1;
			 if(amount < 0){
				 amount +=0.10;
				 break;
			 }
			 else{
			count10c++;
			 }
		}
		
		if(count10c !=0){
		System.out.print(count10c + " : 10 cents, ");
		}

		return amount % 0.1;
	}
	
	public static double CF5c (double amount){
		int count5c = 0;
		while (amount > 0){
			amount -= 0.05;
			 if(amount < 0){
				 amount +=0.05;
				 break;
			 }
			 else{
			count5c++;
			 }
		}
		
		if(count5c !=0){
		System.out.print(count5c + " : 5 cents, ");
		}
		return amount % 0.05 + 0.005;
	}
	
	public static void CF1c (double amount){
		int count1c = 0;
		while (amount > 0){
			amount -= 0.01;
			 if(amount < 0){
				 break;
			 }
			 else{
			count1c++;
			 }
		}

		if(count1c !=0){
		System.out.println(count1c + " : 1 cents ");
		}
		
	}
	
	

}
