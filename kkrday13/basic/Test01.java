package day13.basic;
// overload : 같은 이름의 메서드를 여러 개 정의하는 것 (ex. sysout)
public class Test01 {
	public static void main(String[] args) {
		// 우리가 만든 메서드는
		// 매개변수의 개수/자료형 == 인자값의 개수/자료형
		
		MyTest test = new MyTest();
		
		test.aa();
		test.aa(10); // 안됨 --> 됨
		test.aa("ㅋㅋㅋ"); // 안됨 --> 됨
		test.aa(10, 20); // 안됨 --> 됨
		
		System.out.println();
		System.out.println(10);
		System.out.println("ㅋㅋㅋ");
		//System.out.println(10, 20); // 안됨 => sysout은 상대적으로 유동적임
		
		
	}

}
