package org.akincengiz.plane;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point();
		point.setX(3);
		point.setY(4);
		
		Point point2 = new Point();
		point2.setX(6);
		point2.setY(8);
		
		Point point3 = Point.clone(point);
		
		point3.movePoint(2, 2);
		
		
		System.out.print("X ekseni : " + point.getX() + "\nY ekseni : " + point.getY() + "\nolan noktanin origine olan uzakligi : " + point.getDistanceFromOrigin() + " birimdir...");
		System.out.print("\n************************************************************\n");
		System.out.print("X ekseni : " + point2.getX() + "\nY ekseni : " + point2.getY() + "\nolan noktanin origine olan uzakligi : " + point2.getDistanceFromOrigin() + " birimdir...");
		System.out.print("\n************************************************************\n");
		System.out.print("Noktalarin birbirlerine olan uzakligi : " + Point.calculateDistanceFromPoint(point, point2) + " birimdir...");
		System.out.print("\n************************************************************\n");
		System.out.print("X ekseni : " + point3.getX() + "\nY ekseni : " + point3.getY() + "\nolan noktanin origine olan uzakligi : " + point3.getDistanceFromOrigin() + " birimdir...");
		System.out.print("\n************************************************************\n");
		System.out.print("Noktalarin birbirlerine olan uzakligi : " + Point.calculateDistanceFromPoint(point, point3) + " birimdir...");
		System.out.print("\n************************************************************\n");
	}

}
