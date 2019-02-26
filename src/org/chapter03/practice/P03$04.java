package org.chapter03.practice;

public class P03$04 {

	public static void main(String[] args) {
		//调用这个Math.Random()函数能够返回带正号的double值，
		//该值大于等于0.0且小于1.0，即取值范围是[0.0,1.0)
		int num = (int)(Math.random()*12)+1;
		switch (num) {
			case 1:System.out.println("January");break;
			case 2:System.out.println("February");break;
			case 3:System.out.println("March");break;
			case 4:System.out.println("April");break;
			case 5:System.out.println("May");break;
			case 6:System.out.println("June");break;
			case 7:System.out.println("July");break;
			case 8:System.out.println("August");break;
			case 9:System.out.println("September");break;
			case 10:System.out.println("October");break;
			case 11:System.out.println("November");break;
			case 12:System.out.println("December");break;
		}
	}
}
