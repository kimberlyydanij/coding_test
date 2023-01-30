package coding_test;

/*문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
 */
public class Test7 {

	public static void main(String[] args) {
		
		String strlist[] = {"We", "are", "the", "world!"};
		int chk = strlist.length;
		int answer[] = new int[chk];
		
		for(int i=0;i<chk;i++) {
			answer[i] = strlist[i].length();
			System.out.println(answer[i]);
		}
		

	}

}
