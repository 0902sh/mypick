package day06;

import util.MyUtil;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil.cp("String Class");
		
		// 1. length()
		String str1 = "sfwejfljlsjsdjgdojwjgojgrogwjiogwjio";
		String str2 = "한글은 몇 자로 칩니까?";  // 한글도 1자로 인식
		MyUtil.p("[length()] : eng - " + str1.length());
		MyUtil.p("[length()] : kor - " + str2.length());
		
		// 2. charAt()
		String str3 = "이것도 한글이 궁금해요";
		MyUtil.p("[charAt()] : " + str3.charAt(5));
		
		// 3. equals, equalsIgnoreCase
		String str4 = "abcde";
		String str5 = "abcde";
		MyUtil.p("[equals()] str4 == str5 : " + (str4==str5));
		MyUtil.p("[equals()] str4.equals(str5) : " + str4.equals(str5));
		
		String str6 = new String("abcde");
		String str7 = new String("abcde");
		String str8 = new String("ABCDE");
		MyUtil.p("[equals()] str6 == str7 : " + (str6==str7));
		MyUtil.p("[equals()] str7.equals(str8) : " + str7.equals(str8));
		MyUtil.p("[equalsIgnoreCase()] str7.equalsIgnoreCase(str8) : " + str7.equalsIgnoreCase(str8));
		
		// 4. replace()
		String str9 = "Heaven helps those who help themselves";
		String str10 = "help";
		String str11 = str9.replace("e", "_");
		MyUtil.p("[replace()] : " + str11);
		MyUtil.p("[replace()] : " + str9.replace(str10, "___"));
		
		// 5. substring()
		String str12 = str9.substring(0, 4);
		MyUtil.p("[substring()] : " + str12);
		
		// 두 번째 인자를 생략할 경우
		String str13 = str9.substring(5);  // 인덱스5부터 끝까지
		MyUtil.p("[substring()] : " + str13);
		
		// 실습문제 : str14에 str9의 오른쪽 다섯글자를 넣으시오.
		String str14 = str9.substring(str9.length()-5);
		MyUtil.p("[substring()] : " + str14);
		
		// 6. trim()
		MyUtil.p("[trim()] : " + "1       eouwjowgjwgojgjgwo      ".trim());
		
		// 7. split()
		String str15 = str9;
		String[] str16 = str15.split(" helps ");
		System.out.println("[split()] : " + str16);
		for(String s : str16) MyUtil.p("[split()] : " + s);
		
		// 단어별
		String[] str17 = str15.split(" ");
		
		
		for(String s : str17) MyUtil.p("[split() - 단어별] : " + s);
		
		// 글자별
		String[] str18 = str15.split("");
		
		for(String s : str18) MyUtil.p("[split() - 글자별] : " + s);
		
		// 구분자가 2개일 때 어떻게 할 수 있을까?? e와 공백(space)
		String[] str19 = str15.split("[ e]");
		for(String s : str19) MyUtil.p("[split() - 여러글자] : " + s);
		
		// 8. matches(regular expression)
		String str20 = "298-182318-82321793";
		String regExp = "[0-9]{3,4}[-][0-9]{5,7}[-][0-9]{6,100}";
		boolean result = str20.matches(regExp);
		MyUtil.p("[matches()] : " + result);
		
		String fileName = "data.zip";
		String checkRule = "(.*?)\\.(exe|sh|zip|alz)$";
		result = fileName.matches(checkRule);
		MyUtil.p("[matches()] : " + result);
		
		String phoneNum = "011-1133-2314";
		result = checkPhoneNumber(phoneNum);
		if(result) {
			MyUtil.p("완벽한 전화번호 입력 완료");
		}
		else {
			MyUtil.p("너 지금 뭐 입력한거냐");
		}
		
		
	}
	
	private static boolean checkPhoneNumber(String str) {
		// str이 전화번호 타입인지 검사하여 전화번호 타입이면 true
		// 숫자3자리 + "-" + 숫자3-4자리 + "-" + 숫자4자리
		String phoneNum = "011-1133-2314";
		String regExp = "[0-9]{3}[-][0-9]{3,4}[-][0-9]{4}";
		boolean result = phoneNum.matches(regExp);
		
		
		return result;
	}

}
