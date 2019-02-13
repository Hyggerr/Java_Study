public class DataType {
	public static void main(String[] args) {
		System.out.println("Hello World");
		byteExample(); //동일한 이름의 메소드 실행
		intExample();
		longExample();
		floatDoubleExample();
		booleanExample();
		charExample();
		promotionExample();
		Java_02_01 java02 = new Java_02_01();
		java02.castingExample();
	}
	
	public static void byteExample() {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128;	// 128은 byte형의 최대값인 양수 127을 넘어서는 값이므로 에러가 발생함.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

//	int형은 4byte 크기의 음의 정수와 양의 정수를 나타내는 타입, 가장 많이 사용하는 숫자 타입
	
	public static void intExample() {
		int var1 = 10; //10진수
		int var2 = 012;//8진수
		int var3 = 0xA;//16진수
		
		System.out.println("----- int Example -----");
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);		
		
	}
//	long형은 뒤에 L을 붙여줘야 함.
	public static void longExample() {
		long var1 = 10; // long 타입의 값 10 // int 범위 안이라 자동 형변환
		long var2 = 20L; // long 타입의 값 20
//		long var3 = 1000000000000; // 숫자의 끝에 L을 사용하지 않아 long형의 값으로 옳지 않아 에러 발생 // int 범위를 벗어남.
		long var4 = 1000000000000L;
				
		System.out.println("----- int Example -----");
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);	
		
		int var5 = 1000000000;
		
		System.out.println("int형 변수 var5 : " + var5);
//		1. var1에 var5의 값을 입력하여 출력
		var1 = var5;
		System.out.println("long형 변수 var1에 int형 변수 var5의 값을 대입하여 출력 : " + var1);
//		2. var5에 var1의 값을 입력하여 출력
//		var5 = var1;
		var1 = 1000000000000L; // long형의 자료값을 int형으로 강제 변환할 경우 사용자가 원하지 않는 형태의 값으로 변경될 가능성이 있음
		var5 = (int)var1;
		System.out.println("int형 변수 var5에 long형 변수 var1의 값을 대입하여 출력 : " + var5);		
	}
	
//	실수타입
//	float, double
//	float형은 long형과 같이 숫자의 마지막에 F 기호를 입력해야 함
//	double형은 부동소수점 방식의 기본 자료형
	
	public static void floatDoubleExample() {
//		실수값 저장
		double var1 = 3.14;
//		float var2 = 3.14; // 큰 자료형은 작은 자료형에 들어 갈 수 없다.
		float var3 = 3.14F;
		
//		정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
//		e사용하기
		int var6 = 3000000;
		double var7 = 3e6; //e는 10을 의미. 10의 6승
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}
	
	public static void booleanExample() {
		boolean stop = true;
		
		System.out.println("------ booleanExample -----");
		
		if (!stop) {
			System.out.println("중지합니다.");			
		} else {
			System.out.println("시작합니다.");
		}
	}
//	char형 문자를 나타내기 위해서 사용하는 타입
//	char형은 반드시 '' 을 사용해야 함 ("" 은 문자열을 나타냄)
//	char형은 아스키 코드를 사용하여 문자를 표현 가능
//	자바는 기본 문자형을 유니코드(UTF-8)을 사용하여 2byte로 문자를 표현함
	public static void charExample() {
		char c1 = 'A'; // char형 A 출력
		char c2 = 65; // 10진수 65를 아스키코드로 출력 : A
		char c3 = '\u0041'; // 유니코드를 사용하여 0041에 해당하는 문자를 출력 : A를 의미
		
		char c4 = '가'; // char형 가 출력
		char c5 = 44032; // 유니코드를 사용하여 10진수 44032에 해당하는 문자를 출력
		char c6 = '\uac00'; // 유니코드를 사용하여 ac00에 해당하는 문자를 출력 : 가를 의미  
		
		int uniCode = c1;
		
		System.out.println("----- charExample -----");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		
//		Java에서 쌍따옴표는 문자열을 표현하기 위한 기호이므로 char형에서 사용할 수 없음(에러발생)
//		char c7 = "A'";
	}
//	형변환
//	자동 형변환 - 작은 크기의 타입에서 큰 크기의 타입으로 변환할 경우 변환되는 타입을 입력하지 않아도 자동적으로 변환이 되는 형태
	
	public static void promotionExample() {
		System.out.println("-----promotion Example-----");
		byte byteValue = 10;
		int intValue = byteValue; // 자동 형변환 발생
//		byte형은 1byte 용량을 사용하는 정수 타입
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; // 자동 형변환 발생
//		char는 문자를 저장하고 나타내기 위한 타입이긴 하지만 2byte 용량의 정수를 저장할 수 있기 때문에 자동 형변환이 발생할 수 있음
//		자동 형변환이 발생할 때 char형이 가지고 있는 문자의 코드값을 10진수 정수로 변환하여 저장하게 됨
		System.out.println("가의 유니코드 : " + intValue); // 변수 intValue는 int 타입이기 때문에 정수로서 출력함.
		intValue = 500;
		long longValue = intValue; // 자동 형변환 밣생
//		long형과 int형은 둘다 정수를 보관하고 출력하기 위해 사용된는 타입이므로 화면 표현에 변화가 없음
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // 자동 형변환 발생
//		정수 타입보다 부동소수점 타입이 더 큰 타입임
//		정수를 부동소수점 타입으로 변환하면 소수점 이하의 숫자를 화면에 표현 할 수 있음
		System.out.println(doubleValue);
	}
}
