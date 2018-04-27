package Costumer;
import java.util.Scanner;

import Costumer.CostumerStore.type;

public class CostumerRun {

	private static Scanner sc;

	public static void main(String args[]) {
		
		CostumerStore[] costumerArray;
		sc = new Scanner(System.in);
		type costumerType = type.OTHER;

		System.out.println("How many costumers would you like to register: ");
		int length = sc.nextInt();

		costumerArray = new CostumerStore[length];

		for (int i = 0; i < costumerArray.length; i++) {
			System.out.println("Name: ");
			String name = sc.next();

			System.out.println("Tax: ");
			int tax = sc.nextInt();

			System.out.println("Email: ");
			String email = sc.next();

			System.out.println("Post code: ");
			int postCode = sc.nextInt();
			
			System.out.println("Shop numer: ");
			int shopNumber = sc.nextInt();

			System.out.println("Type: ");
			String typeString = sc.next();

			if (typeString.contains("retailer"))
				costumerType = type.RETAILER;

			if (typeString.contains("wholesaler"))
				costumerType = type.WHOLESALER;

			if (typeString.contains("other"))
				costumerType = type.OTHER;


			costumerArray[i] = new CostumerStore(name, email, tax, postCode, shopNumber, costumerType);
		}

    }
}

