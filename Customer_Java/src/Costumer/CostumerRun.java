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
			String tax = sc.next();

			System.out.println("Email: ");
			int email = sc.nextInt();

			System.out.println("Post code: ");
			int postCode = sc.nextInt();
			
			System.out.println("Shop numer: ");
			int shopNumer = sc.nextInt();

			System.out.println("Type: ");
			String typeString = sc.next();

			if (typeString.contains("retailer"))
				costumerType = type.RETAILER;

			if (typeString.contains("wholesaler"))
				costumerType = type.WHOLESALER;

			if (typeString.contains("other"))
				costumerType = type.OTHER;


			costumerArray[i] = new CostumerStore(name, tax, email, postCode, shopNumer, costumerType);
		}

    }
}

