package org.akincengiz.algorithm;
import java.util.Scanner;

public class TriangleSinArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a,b,radius,area;
		System.out.print("a kenar uzunlugu : ");
		a = input.nextDouble();
		System.out.print("b kenar uzunlugu : ");
		b = input.nextDouble();
		System.out.print("Kenarlarin olusturdugu aci : ");
		radius = input.nextDouble();
		
		area = a * b * Math.sin(Math.toRadians(radius))/2;
		
		System.out.print("==============================\na Kenar uzunlugu : "+a+" birim\nb Kenar uzunlugu : "+b+"birim\nKenarlara ait aci : "+radius+" birim\nAlani : "+area+" birimkare'dir");
	}

}
