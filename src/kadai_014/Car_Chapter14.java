package kadai_014;

public class Car_Chapter14 {
//	 フィールド
	  private int gear = 1; 
	  private int speed = 10;
	  
// コントラクタ
   Car_Chapter14() {
 }
   
// メソッド
   public void gearChange(int afterGear) {
	  System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
       }
   
   
   public void run(int afterGear) {
	   int afterSpeed = this.speed * afterGear;
	   System.out.println("速度は時速" + afterSpeed + "kmです");
   }
   
   
}
