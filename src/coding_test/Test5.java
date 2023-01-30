package coding_test;

public class Test5 {

	public static void main(String[] args) {
		
		//int num_list[] = {1,2,3,4,5};
		int num_list[] = {1,1,1,1,1,2};
		//int num_list[] = {1,0,1,1,1,3,5};
		
		int leng = num_list.length;
		int[] answer = new int[leng];
		int cnt = leng-1;

		for(int i=0;i<leng;i++) {
			answer[cnt] = num_list[i];
			cnt = cnt-1;

		}
		
		for(int i=0;i<leng;i++) {
			System.out.println(answer[i]);
		}
	

	}

}
