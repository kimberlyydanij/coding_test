package coding_test;

/*최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 
 * 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
 * 최빈값이 여러 개면 -1을 return 합니다.
 */

public class Test2 {

	public static void main(String[] args) {

		//int array[] = { 1, 2, 3, 3, 3, 4, 3, 3, 4, 6, 8, 9, 10 };
		int array[] = { 2,2,1,1,2,10,23,12,12,10,10,23,12,23,12,12 };


		int answer = 0;
		int leng = array.length;
		int max = 0;
		int data = 0;
		int maxdata = 0;
		int cnt = 0;
		
		
		if(array.length==1) 
			answer = array[0];
		
		else if(array.length>1) {
		// 최대값 구하기
		for(int i = 0; i < leng; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}

		//최대값 크기의 배열 만들기
		int chk[] = new int[max + 2];
		// 배열 카운트 하기
		for(int i = 0; i < leng; i++) {
			data = array[i];
			chk[data] = chk[data] + 1;
		}
		
		// 최대값 인덱스 찾기
		for(int i=1; i<max; i++) {
			if(maxdata<chk[i]) {
				maxdata = chk[i];
				answer = i;
			}
		}
			
		for(int i=0; i<max+1; i++)    
            if(maxdata==chk[i]) {
                cnt = cnt + 1;
            }   
        
        if(cnt>1)
            answer = -1;
        
		}
		System.out.println(answer);
		
		
		}
		


}

