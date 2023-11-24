package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    int userAge = 0;
    int serviceCost = 0;
    
    userAge = 30;
    switch(userAge) {
    	case 10 -> {
    	  serviceCost = 1000;
    	  System.out.println(userAge + "代");
    	  System.out.println(serviceCost + "円");
    	}
    	case 20 -> {
      	  serviceCost = 2000;
      	 System.out.println(userAge + "代");
      	  System.out.println(serviceCost + "円");
    	}
    	case 30 -> {
      	  serviceCost = 3000;
      	 System.out.println(userAge + "代");
      	  System.out.println(serviceCost + "円");
    	}
    	case 40,50,60,70 -> {
      	  serviceCost = 4000;
      	 System.out.println(userAge + "代");
      	  System.out.println(serviceCost + "円");
    	}
    	case 80 -> {
      	  serviceCost = 5000;
      	 System.out.println(userAge + "代");
      	  System.out.println(serviceCost + "円");
    	}
    	default -> {
      	  serviceCost = 500;
      	 System.out.println(userAge + "代");
      	  System.out.println(serviceCost + "円");
    	}
    }
	}

}
