package sample04;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * wrapper class: 일반 자료형을 클래스화한 것
		 * 
		 * 일반 자료형 wrapper class boolean Boolean byte Byte short Short int Integer long
		 * Long float Float double Double char Character char[] String
		 */

		int i = 123;
		Integer in = 234;
		Integer cin = new Integer(345);
		System.out.println(cin);

		double d = 123.456;
		Double do1 = 123.456;
		System.out.println(do1);

		// Integer, Double
		// String

		// 문자열 -> 숫자
		String str = "1234";
		int num = Integer.parseInt(str);
		System.out.println(num);

		// 숫자 -> 문자열
		int num1 = 234;
//		String str1 = num1 + "";
		Integer num2 = 234;
		String str1 = num2.toString(); // 문자열 변환
		System.out.println("str1 = " + str1);

		Double do2 = 234.5678;
		String str2 = do2 + "";

		// String
		// 문자열 저장, 편집, 정보취득
		String str3 = null; // or ""로 초기화

		str3 = "안녕하세요";

		String str4 = new String("반갑습니다");
		String str5 = str3 + str4;
		System.out.println(str5);

		str3.concat(str4); // str3에 str4추가

		// equals(비교함수)
		String str6 = "world";
		String str7 = "worl";
		str7 += "d";
		System.out.println(str6 == str7); // 정확한 비교가 어려움 --> 초창기값으로 비교하기 때문

		System.out.println(str6.equals(str7));

		// 문자위치
		// indexOf, lastIndexOf
		String str8 = "abcabcabc";
		int index = str8.indexOf("c");
		System.out.println(index); // 2

		int lastIndex = str8.lastIndexOf("c");
		System.out.println(lastIndex);

		// 문자열의 길이
		// length() 배열에선 length
		System.out.println(str8.length());// 9

		// 문자열의 수정
		// replace
		String str9 = "A*B*C*D";
		String replaceStr = str9.replace("*", "-"); // replace("현재문자","변경후문자")

		// 문자열 자르기
		// split => tokenNizer
		// substring
		// ex) 홍길동-24-2001/03/16-서울
		String str10 = "홍길동-24-2001/03/16-서울";
		String split[] = str10.split("-"); // -를 기준으로 자름
		System.out.println(split[0]);// 홍길동
		System.out.println(split[1]);// 24
		System.out.println(split[2]);// 2001/03/16
		System.out.println(split[3]);// 서울

		// 범위를 기준으로 자르기
		// substring()
		String substr = str10.substring(4);// idx4부터 끝까지 가져오기
		System.out.println(substr);

		substr = str10.substring(4, 6); // 4부터 5까지
		System.out.println(substr);

		// 앞뒤에 공백없애기
		// trim()
		String str11 = "         java         jav?      ";
		System.out.println(str11.trim());

		// index로 문자찾기
		// charAt
		String str12 = "가나다라마";
		System.out.println(str12.charAt(2));

		// 문자열 탐색
		// contains
		String str13 = "서울시 마포구 서교동";
		boolean b = str13.contains("서교"); //true
		System.out.println(b);
	}
}
