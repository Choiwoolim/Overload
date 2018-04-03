package edu.handong.csee.java.overload;

public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double average1 = overload.getAverage(30, 40);
		double average2 = overload.getAverage(30, 40, 20);
		char average3 = overload.getAverage('a', 'c');
		
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);
		

	}
	

	public static double getAverage(double first, double second) {
		return (first+second)/2;
	}
	
	public static double getAverage(double first, double second, double three) {
		return (first+second+three)/3;
		
	}
	
	public static char getAverage(char first, char second) {
		return (char)(((int)first + (int)second)/2);
	}

}