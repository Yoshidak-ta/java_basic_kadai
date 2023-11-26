package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    boolean[] prime = new boolean[101];
    
    
    for(int i = 1; i < prime.length; i++) {
      prime[i] = true;
     }
    
    int j = 2;
    while(j < prime.length) {
    	for(int i = j + 1; i < prime.length; i++) {
    		if(i % j == 0) {
    		  prime[i] = false;
    		  continue;
    		}
    	}
    	j += 1;
     }
    
    for(int i = 2; i < prime.length; i++) {
    	if(prime[i]) {
    		System.out.println(i);
    	}
     }
    }

}
