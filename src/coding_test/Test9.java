package coding_test;

/*문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 
 * 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 *  */
public class Test9 {

	public static void main(String[] args) {
		
		String my_string = "abcedfda";
		String letter = "f";
		String answer ="";
		
		int chk = my_string.length();
		
		String arr[] = my_string.split("");
		
				
		for(int i=0;i<chk;i++) {
			System.out.println(arr[i]);
			System.out.println(letter);
			if(arr[i]==letter) { 
				System.out.println("same");
				
			}
			else { answer = answer + arr[i];
			System.out.println("not same"); 
		}
		}
		System.out.println(answer);
		}
				
			

	
}
