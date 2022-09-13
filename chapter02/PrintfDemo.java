package chapter02;

//Coding By 김용선.

public class PrintfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 97;
		String s = "java";
		double f = 3.14f;
		
//		10진수 출력
		System.out.printf("%d\n",i);
		
//		8진수 출력
		System.out.printf("%o\n",i);
		
//		16진수 출력
		System.out.printf("%x\n",i);
		
//		문자 출력
		System.out.printf("%c\n",i);
		
//		5자리 출력, 빈자리는 공백으로 출력
		System.out.printf("%5d\n",i);
		
//		5자리 출력, 빈자리는 0으로 출력
		System.out.printf("%05d\n",i);
		
//		문자열 출력
		System.out.printf("%s\n",s);
		
//		5자리 출력, 빈자리는 공백으로 출력
		System.out.printf("%5s\n",s);
		
//		5자리 출력, 빈자리는 공백으로 출력, 왼쪽 정렬
		System.out.printf("%-5s\n",s);
		
//		10진수 실수 출력
		System.out.printf("%f\n",f);
		
//		지수 출력
		System.out.printf("%e\n",f);
		
//		4자리, 소수점 이하 1자리 출력
		System.out.printf("%4.1f\n",f);
		
//		4자리, 소수점 이하 1자리, 빈자리 0 출력
		System.out.printf("%04.1f\n",f);
		
//		4자리, 소수점 이하 1자리, 왼쪽 정렬 출력
		System.out.printf("%-4.1f\n",f);
	}

}
