package stringph;

import java.util.Scanner;

public class FeePaypalEbay {

	private static Scanner sc;

	public static void main(String[] args) {
		double liv =0;
		int q2;
		sc = new Scanner(System.in);
		//double prixdevente; 
		

		System.out.println("*************************************");
		System.out.println("***           Bienvenue           ***");
		System.out.println("*************************************");
		do {
		System.out.println("Pour commencer saisi le numero 1");
		 q2 = sc.nextInt();
		}while(q2!=1);
			System.out.println("Entrez votre Prix de vendre ");
		double prixdevente = sc.nextDouble();
		System.out.println("Vous voulez Ajouter le prix de livraison Oui/Non");
		String q = sc.next();
		if (q.equals("Oui") || q.equals("oui") || q.equals("OUI")) {
			System.out.println("Merci de saisi le prix de livraison ");
			 liv = sc.nextDouble();
			}
		else
		{
			 liv = 0;
		}
		double feepaypal =(prixdevente*4.4/100)+0.30; 
		double feeebay = (prixdevente*10/100) ;
		double fee = feepaypal + feeebay +liv;
		
		//double productdefournisseur =0;
		System.out.println("Prixe de vente : " +prixdevente);
		System.out.println("Frais de paypal : " +feepaypal);
		System.out.println("Frais de Ebay : " +feeebay);
		System.out.println("Livraison : "+liv);
		System.out.println("Total Frais : "+ fee +" avec les frais de livraison " +liv);
		
	}

}
