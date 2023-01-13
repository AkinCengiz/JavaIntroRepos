package org.akincengiz.shape;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci kosegen uzunlugu   : ");
		double diagonalA = input.nextDouble();
		System.out.print("Ikinci kosegen uzunlugu    : ");
		double diagonalB = input.nextDouble();
		System.out.print("Kosegenlere ait aci olcusu : ");
		double radius = input.nextDouble();
		double area = (diagonalA * diagonalB * Math.sin(radius * Math.PI / 180))/2;
		
		System.out.print("Kosegen uzunlukları\n================================\na kosegeni : "+diagonalA+" birim\nb kosegeni : "+diagonalB+" birim\nAci olcusu : "+radius+" derece\nDortgenin Alani\n=====================\n"+area+" birim karedir...");
	}

}
