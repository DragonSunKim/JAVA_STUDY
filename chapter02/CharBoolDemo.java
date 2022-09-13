package chapter02;

//Coding By 김용선.

public class CharBoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ga1 = '가';
		char ga2 = '\uac00';
		
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(ga1);
		System.out.println((int)ga1);
		System.out.println(ga2);
		System.out.println(++ga2);
		System.out.println(cham + "가 아니면"+ geojit + "입니다.");
		
	}

}
