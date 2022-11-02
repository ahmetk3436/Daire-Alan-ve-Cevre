package daire;

import java.util.Scanner;

public class Main {
	static float pi = 3.14f;
	static float yariCap;
	static int alfaOlcusu;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yarıçapı giriniz :");
		yariCap = scan.nextFloat();
		System.out.println("Lütfen alfa ölçüsünü giriniz :");
		alfaOlcusu = scan.nextInt();
		System.out.println("Daire çevre : " + 2*pi*yariCap);
		System.out.println("Daire alan : " + yariCap*pi*yariCap*(alfaOlcusu/360.0f));
		scan.close();
	}

}
