package chapter02;

//Coding By 김용선.

public class NumberTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mach;
		int distance;

		mach = 340;
		distance = mach * 60 * 60;
		System.out.println("소리가 1시간 동안 가는 거리 : "+ distance + "m");
		
		double radius;
		double area;
		
		radius = 10.0;
		area = radius * radius * 3.14;
		System.out.println("반지름이 "+ radius + "인 원의 넓이 : "+ area);		
	}

}
