package org.chapter02.practice;

import java.util.Scanner;

class Point{
	private double x;
	private double y;
	
	
	public Point() {
		super();
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	
}
public class P02$19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first points for a triangle:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		Point p1 = new Point(x1, y1);
		
		System.out.println("Enter second points for a triangle:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		Point p2 = new Point(x2, y2);
		
		System.out.println("Enter third points for a triangle:");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		Point p3 = new Point(x3, y3);
		//declare side
		double s12 = getSide(p1,p2);
		double s23 = getSide(p2,p3);
		double s13 = getSide(p1,p3);
		
		//declare variable
		double s = (s12 + s23+ s13)/2;
		
		double result = Math.pow(s*(s-s12)*(s-s23)*(s-s13), 0.5);
		
		System.out.println("the area of triangle"+result);
		
		
	}

	private static double getSide(Point p1, Point p2) {
		
		return Math.pow((Math.pow((p1.getX()-p2.getX()), 2)+Math.pow((p1.getY()-p2.getY()), 2)), 0.5);
	}

	
}
