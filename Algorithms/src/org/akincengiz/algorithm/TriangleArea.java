package org.akincengiz.algorithm;
import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, h, area;
		Scanner input = new Scanner(System.in);
		System.out.print("Kenar uzunlugu : ");
		a = input.nextFloat();
		System.out.print("Kenara ait yukseklik : ");
		h = input.nextFloat();
		area = (a * h) / 2;
		System.out.print("==============================\nKenar uzunlugu : "+a+" birim\nYuksekligi : "+h+" birim\nAlani : "+area+" birimkare'dir");
	}

}
