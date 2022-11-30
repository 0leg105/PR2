package Zoo;

import java.util.ArrayList;
import java.util.Scanner;


public class ZooMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Tier t1 = new Hund("Boby",1);
		//Tier t2 = new Tier("Dennis",40); //Abstrakte Klassen können nicht instanziert werden
		
		//Factory Method Pattern
		Tier tier = null;
		String spezies ="...";
		int alter = 0;
		String name ="...";
		
		System.out.println("Tier: ");
		spezies = sc.nextLine();
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("Alter: ");
		alter = sc.nextInt();
		
		switch(spezies) {
		case "Hund":
			tier = new Hund(name,alter);break;
		default:
			System.out.println("Spezies unbekannt");break;
		}
		
	}
} 