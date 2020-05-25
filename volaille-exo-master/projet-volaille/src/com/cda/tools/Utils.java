package com.cda.tools;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.cda.model.abat.Canard;
import com.cda.model.abat.Poulet;

public class Utils {
	
	
			
	private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");
	
	public static String formaterPrixOuPois(float pPrixOuPoids) {
		return DECIMAL_FORMAT.format(pPrixOuPoids);
	}
	
	public static void initialisation() {
		Scanner sc = new Scanner (System.in);

		System.out.println("Saisissez le prix de vente du poulet.");
		float prixPoulet=sc.nextFloat();
		sc.nextLine();
		Poulet.modifierPrixKg(prixPoulet);
		
		System.out.println("Saisissez le prix de vente du canard.");
		float prixCanard=sc.nextFloat();
		sc.nextLine();
		Canard.modifierPrixKg(prixCanard);
		
		System.out.println("Saisissez le poids d'abattage des poulets.");
		float vPoidsAbattagePoulet=sc.nextFloat();
		sc.nextLine();
		Poulet.modifierPoidsDAbattage(vPoidsAbattagePoulet);
		
		System.out.println("Saisissez le poids d'abattage des canards.");
		float vPoidsAbattageCanard=sc.nextFloat();
		sc.nextLine();
		Canard.modifierPoidsDAbattage(vPoidsAbattageCanard);
	}
}
