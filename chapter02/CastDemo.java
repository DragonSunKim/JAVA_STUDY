package chapter02;

//Coding By 김용선.

public class CastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		double d;
		byte b;
		
		i = 7/4;
		System.out.println(i);
		
		d = 7/4;
		System.out.println(d);
		
		d = 7/(double)4;
		System.out.println(d);
		
		i = 300;
		if(i< Byte.MIN_VALUE || i > Byte.MAX_VALUE)
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		else
			b = (byte) i;
		
	}

}
