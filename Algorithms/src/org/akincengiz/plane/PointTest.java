package org.akincengiz.plane;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point();
		point.x = 3;
		point.y = 4;
		
		Point point2 = new Point();
		point2.x = 6;
		point2.y = 8;
		
		Point point3 = Point.clone(point);
		
		point3.movePoint(2, 2);
		
		
		System.out.print("X ekseni : " + point.x + "\nY ekseni : " + point.y + "\nolan noktanin origine olan uzakligi : " + point.getDistanceFromOrigin() + " birimdir...");
		System.out.print("\n************************************************************\n");
		System.out.print("X ekseni : " + point2.x + "\nY ekseni : " + point2.y + "\nolan noktanin origine olan uzakligi : " + point2.getDistanceFromOrigin() + " birimdir...");
		System.out.print("\n************************************************************\n");
		System.out.print("Noktalarin birbirlerine olan uzakligi : " + Point.calculateDistanceFromPoint(point, point2) + " birimdir...");
		System.out.print("\n************************************************************\n");
		System.out.print("X ekseni : " + point3.x + "\nY ekseni : " + point3.y + "\nolan noktanin origine olan uzakligi : " + point3.getDistanceFromOrigin() + " birimdir...");
		System.out.print("\n************************************************************\n");
		System.out.print("Noktalarin birbirlerine olan uzakligi : " + Point.calculateDistanceFromPoint(point, point3) + " birimdir...");
		System.out.print("\n************************************************************\n");
	}

}
