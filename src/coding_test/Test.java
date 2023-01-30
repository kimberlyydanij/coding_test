package coding_test;


/* 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 
 * numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 
 * 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */

public class Test {

	public static void main(String[] args) {
	
		int numer1 = 620;
		int denom1 = 210;
		int numer2 = 10;
		int denom2 = 24;

		int common = denom1 * denom2;
	    int a = (numer1 * denom2) + (numer2 * denom1) ;

	    //System.out.println(a);
	    //System.out.println(common);
	    
	        for(int i=common; i>=2; i--) {
	             if (a%i == 0 && common%i== 0 ) {
	                a = a/i;
	                common = common/i; 
	                    }
	        }
	        
            System.out.println(a);
            System.out.println(common);
	        //int[] answer = {a, common};
	        
	       // System.out.printf("%d, %d" ,answer[0], answer[1]);
		
	}
}
