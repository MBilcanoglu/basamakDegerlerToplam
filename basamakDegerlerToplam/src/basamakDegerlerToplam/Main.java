package basamakDegerlerToplam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number,basamak,total=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Sayý giriniz: ");
		number=scan.nextInt();
		
		while(number!=0) {
			basamak=number%10;
			total+=basamak;
			number/=10;
		}
		
		System.out.println("Girilen sayýnýn basamaklarýnýn toplamý= "+total);
		
		
	}

}
