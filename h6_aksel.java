package java_h_aksel;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class h6_aksel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aksel ratt
		        ArrayList<Integer> list = new ArrayList();

				while(1==1) {
				Scanner Scanner =new Scanner (System.in);
				
		        
				System.out.print("Sisesta arv: ");
				String vastus = Scanner.nextLine();
				if (vastus == "") {
					System.out.println("Sinu list: " + list);
					break;
				}
				else {
					list.add(Integer.parseInt(vastus));
				}


				
				}
				System.out.println("Masiivis kokku: " +summa(list));
				System.out.println("Keskmine: " +keskmine(list));
				File minuFail = new File("lol.txt");
				try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(minuFail));
				bw.write("Arvud: " +list);
				bw.write("Keskmine: " +keskmine(list));
				bw.write("Kokku: " +summa(list));
				bw.close();
				System.out.println("Fail loodud!");
				 } catch (IOException e) {
					 e.printStackTrace();
					 }
					 }


			

			public static int summa(ArrayList <Integer> b) {
				int summa = 0;
				for (int i : b) {
					summa +=i;
				}
				return summa;
						
			}
			public static int keskmine(ArrayList <Integer> a) {
				int kesk = summa(a)/a.size();
				return kesk;

	}

}
