package coding_test;

/* 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 * 
 */

public class Test6 {

	public static void main(String[] args) {
		String my_string = "jaron";
		//String my_string = "bread";
		
		StringBuffer sb = new StringBuffer(my_string);
		String answer = sb.reverse().toString();
		
		System.out.println(sb);

	}

}