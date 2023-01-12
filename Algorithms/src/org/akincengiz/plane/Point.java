package org.akincengiz.plane;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point()
	{
		this(0,0);
	}
	public Point(int x)
	{
		this(x,0);
	}
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	double getDistanceFromOrigin()
	{
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y,2));
		
	}
	
	public static double calculateDistanceFromPoint(Point p1, Point p2)
	{
		int x = Math.abs(p1.x - p2.x);
		int y = Math.abs(p1.y - p2.y);
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public static Point clone(Point p1)
	{
		Point p = new Point();
		p.x = p1.x;
		p.y = p1.y;
		return p;
	}
	
	void movePoint(int x, int y)
	{
		this.x += x;
		this.y += y;
	}

}
