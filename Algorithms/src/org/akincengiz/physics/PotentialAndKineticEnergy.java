package org.akincengiz.physics;
import java.util.Scanner;

public class PotentialAndKineticEnergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double mass,v,height,potantialEnergy,kineticEnergy;
		System.out.print("Kutle     : ");
		mass = input.nextDouble();
		System.out.print("Hiz       : ");
		v = input.nextDouble();
		System.out.print("Yukseklik : ");
		height = input.nextDouble();
		
		potantialEnergy = mass * 9.8 * height;
		kineticEnergy = mass * Math.pow(v,2) / 2;
		System.out.print("\n=============================\nPotansiyel enerji : "+ potantialEnergy);
		System.out.print("\nKinetik Enerji    : " + kineticEnergy);
	}

}
