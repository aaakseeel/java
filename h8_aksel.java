package java_h_aksel;
import java.util.Scanner;

	public class h8_aksel {
		public static void main(String[] args) {

			Scanner scanner = new Scanner (System.in);

			System.out.print("Kuup ruumala (1) \nRisttahukas ruumala (2) \nSilinder ruumala (3)\nVali tegevus: "); 
			String valik = scanner.next();
			String korgus;
			String alus;
			String pikkus;
			String laius;

			
			double s ;
			switch (Integer.parseInt(valik)) {
			case 1:
				System.out.print("Sisesta pikkus: ");
				pikkus = scanner.next();
				s = pindala.kuup(pikkus);

				System.out.printf("Kuup ruumala on %.2f ",s);
				break;
			case 2:
				System.out.print("Sisesta pikkus: ");
				pikkus = scanner.next();
				System.out.print("Sisesta laius: ");
				laius = scanner.next();
				System.out.print("Sisesta kõrgus: ");
				korgus = scanner.next();
				s = pindala.risttahukas(pikkus, laius, korgus);
				System.out.printf("Risttahukas ruumala on %.2f ",s);
				break;
			case 3:
				System.out.print("Sisesta kõrgus: ");
				korgus = scanner.next();
				System.out.print("Sisesta raadius: ");
				alus = scanner.next();
				s = pindala.silinder(alus, korgus);
				System.out.printf("Silinder ruumala on %.2f ",s);
				break;

			default:
				System.out.print("Valikust arusaamine ebaõnnestus!");
				break;
			}

		}

	}