package java_h_aksel;

import java.util.Scanner;

public class h4_aksel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in); //kasutaja sisestus
		System.out.print("Sisesta oma nimi: "); 
		String nimi = scanner.nextLine(); //lisab sisestuse sõne muutujasse
		System.out.print("Sisesta oma vanus: "); 
		int vanus = scanner.nextInt(); //lisab sisestuse täisarvu muutujasse
		 
		System.out.println("Tere "+nimi.toUpperCase()+", "+vanus+"!"); // väljastab nime ja vanuse
		System.out.println("Sõnas on "+nimi.length()+" tähemärki"); // väljastab mitu tähemärki on sõnas
		
		//Sõnade kokku lugemine
        int count = 1;

        for (int i = 0; i < nimi.length(); i++) 
        {
            if (nimi.charAt(i) == ' ') // kui on tühik sees siis paneb +1 sõnale juurde 
            {
                count++; // loetab kokku
            } 
        }

        System.out.println("Sõnasi kokku = " + count); // Väljastab mitu sõna on nimes.
		
        String esimene[] = nimi.split(" ", 2);
        System.out.printf("Esimene sõna: %s",esimene);
        
        scanner.close();
	}

}