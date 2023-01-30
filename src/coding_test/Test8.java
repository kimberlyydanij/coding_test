package coding_test;

/* 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.

가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 
만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요. 
*/

public class Test8 {

	public static void main(String[] args) {
		int answer = 0;
        int max = 0;
        int sum = 0;
        
        //int[] sides = {1,2,3};     	
        int[] sides = {3,6,2};
        //int[] sides = {199,72,222};    
        
        //최대값 구하기
        for(int i=0;i<3;i++) {
            
            sum = sum + sides[i];
            
            if(max<sides[i]) 
               max = sides[i];
        }
        

        System.out.println(max);
        sum = sum - max;
        System.out.println(sum);
        if(sum>max) 
            answer = 1;
        else answer = 2;
            
        
        System.out.printf("answer : %d\n", answer);
	}

}
