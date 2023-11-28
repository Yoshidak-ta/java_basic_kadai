package kadai_017;

public class KatoExec_Chapter17 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
      KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
      KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
     
      taro.commonIntroduce();
      taro.setGivenName("太朗");
      taro.execIntroduce();
      taro.eachIntroduce();

      ichiro.commonIntroduce();
      ichiro.setGivenName("一郎");
      ichiro.execIntroduce();
      ichiro.eachIntroduce();
      
      hanako.commonIntroduce();
      hanako.setGivenName("花子");
      hanako.execIntroduce();
      hanako.eachIntroduce();

	}
	
}
