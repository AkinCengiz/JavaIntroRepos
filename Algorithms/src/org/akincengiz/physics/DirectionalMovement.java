package org.akincengiz.physics;
import java.util.Scanner;

public class DirectionalMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double firstVelocity,lastVelocity, height, horizontalDistance, flightTime, verticalVelocity;
		System.out.print("Cismin yerden yuksekligi : ");
		height = input.nextDouble();
		System.out.print("Cismin ilk hiz olcusu    : ");
		firstVelocity = input.nextDouble();
		flightTime = Math.sqrt(2 * height * 9.8);
		horizontalDistance = firstVelocity * flightTime;
		verticalVelocity = 9.8 * flightTime;
		lastVelocity = Math.sqrt(Math.pow(firstVelocity, 2) + Math.pow(verticalVelocity, 2));
		
		System.out.print("\nYuksekligi : " + height + " birim\nIlk hizi   : " + firstVelocity + " birim\n========================\n" );
		System.out.print("Cismin havada kalma suresi : " + flightTime + " saniye\nYatayda aldigi mesafe      : " + horizontalDistance + " metre\nYere carpma hizi           : " + lastVelocity + " metre/saniye 'dir...");
		
		
		
	}

}
