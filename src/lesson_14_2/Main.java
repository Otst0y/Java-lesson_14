package lesson_14_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	static HashSet<Commodity> comm = new HashSet();
	
	static void menu() {
		System.out.println("Enter 1 to add a product:");
		System.out.println("Enter 2 to delete a product:");
		System.out.println("Enter 3 to edit a product:");
		System.out.println("Enter 4 to sort products by name:");
		System.out.println("Enter 5 to sort products by length:");
		System.out.println("Enter 6 to sort products by width:");
		System.out.println("Enter 7 to sort products by weight:");
		System.out.println("Enter 8 to display product:");
		System.out.println("Enter 9 to exit:");
	}

	public static void main(String[] args) {
		
		Commodity c = new Commodity(null, 0, 0, 0);
		CompareByName compByName = new CompareByName();
		CompareByLength compByLength = new CompareByLength();
		CompareByWidth compByWidth = new CompareByWidth();
		CompareByWeight compByWeight = new CompareByWeight();
		
		while(true) {
			menu();
			Scanner scan = new Scanner(System.in);
			int scanMenu = scan.nextInt();
			switch (scanMenu) {
			case 1:
				c.addProduct(comm);
				for (Commodity key : comm) {
					System.out.println(key);
				}
				break;
			case 2:{
				c.deleteProduct(comm);
				for (Commodity key : comm) {
					System.out.println(key);
				}
				break;
			}
			case 3:{
				c.editProduct(comm);
				for (Commodity key : comm) {
					System.out.println(key);
				}
				break;
			}
			case 4:{
				TreeSet<Commodity> tSByName = new TreeSet<>(compByName);
				tSByName.addAll(comm);
				for (Commodity key : tSByName) {
					System.out.println(key);
				}
				break;
			}
			case 5:{
				TreeSet<Commodity> tSByLength = new TreeSet<>(compByLength);
				tSByLength.addAll(comm);
				for (Commodity key : tSByLength) {
					System.out.println(key);
				}
				break;
			}
			case 6:{
				TreeSet<Commodity> tSByWidth = new TreeSet<>(compByWidth);
				tSByWidth.addAll(comm);
				for (Commodity key : tSByWidth) {
					System.out.println(key);
				}
				break;
			}
			case 7:{
				TreeSet<Commodity> tSByWeight = new TreeSet<>(compByWeight);
				tSByWeight.addAll(comm);
				for (Commodity key : tSByWeight) {
					System.out.println(key);
				}
				break;
			}
			case 8:{
				c.showProduct(comm);
				break;
			}
			case 9:{
				System.exit(0);
				break;
			}
			default: System.out.println("Invalid input.");
				break;
			}
		}
		
	}

}
