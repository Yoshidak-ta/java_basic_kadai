package kadai_017;

abstract public class Kato_Chapter17 {
    public String familyName;
    public String givenName;
    public String address;
    
    Kato_Chapter17(){
    }
    
	
	public void commonIntroduce(String familyName, String address) {
		familyName = "加藤";
		address = "住所は東京都中野区〇×です";
	}
	abstract public void eachIntroduce();
	public void execIntroduce(String givenName) {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println(address);
	}

}
