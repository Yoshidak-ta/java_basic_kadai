package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
   
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		String[] myHand = new String[3];
		myHand[0] = "r";
		myHand[1] = "s";
		myHand[2] = "p";
		
		if(myHand[0].equals(input)) {
			scanner.close();
		} else if(myHand[1].equals(input)) {
			scanner.close();
		} else if(myHand[2].equals(input)) {
			scanner.close();
		} else {
			System.out.println("正しいじゃんけんの手ではありません");
			System.exit(0);
			scanner.close();
		}
		
		  return input;
	 }
	
	
	public String getRandom() {
		String[] yourHand = new String[3];
		
		yourHand[0] = "r";
		yourHand[1] = "s";
		yourHand[2] = "p";
		
        double yourChoice = Math.random() * 2;
        int yourChoiceFloor = (int)( Math.floor(yourChoice));
				
        return yourHand[yourChoiceFloor];
        }
	
	
	public void playGame(String myChoice, String random) {
		HashMap<String, String> play = new HashMap<String, String>();
		 play.put("r", "グー");
		 play.put("s", "チョキ");
		 play.put("p", "パー");
		 
		 String hand1 = play.get(myChoice);
		 String hand2 = play.get(random);
		
		System.out.println("自分の手は" + hand1 + ",対戦相手の手は" + hand2);
		
		if(hand1 == "グー") { 
			switch(hand2) {
			 case "グー":
				System.out.println("あいこです");
				break;
			 case "チョキ":
				System.out.println("自分の勝ちです");
				break;
			 case "パー":
				System.out.println("自分の負けです");
				break;
			};
		} else if(hand1 == "s") {
			switch(hand2) {
			case "r":
				System.out.println("自分の負けです");
				break;
			case "s":
				System.out.println("あいこです");
				break;
			case "p":
				System.out.println("自分の勝ちです");
				break;
			};
		} else if(hand1 == "p") {
			switch(hand2) {
			case "r":
				System.out.println("自分の勝ちです");
				break;
			case "s":
				System.out.println("自分の負けです");
				break;
			case "p":
				System.out.println("あいこです");
				break;
			};
		}
		
	}

}
