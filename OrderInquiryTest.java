public class OrderInquiryTest{
	public static void main(String[] args){
	
	OrderInquiry jane = new OrderInquiry();
	OrderInquiry amy = new OrderInquiry();
	
	//顧客名稱
	String name1 = "jane";
	String name2 = "amy";
	
	//設定封裝值set
	jane.setItem("戲劇");
	jane.setMount(20);
	jane.setDate("2024/09/26");
	
	amy.setItem("運動");
	amy.setMount(0);
	amy.setDate("2024/09/26");
	
	//結果顯示get
	System.out.println("=======|客戶"+name1+"訂單查詢|=======");
	System.out.println("訂購項目: "+jane.getItem());
	//數量不可為0
	if(jane.getMount()<=0)
		System.out.println("數量有誤，數量需大於0");
	else
		System.out.println("訂購數量: "+jane.getMount());
	
	System.out.println("訂購日期: "+jane.getDate());
	System.out.println("============================="+"\n");
	
	System.out.println("=======|客戶"+name2+"訂單查詢|=======");
	System.out.println("訂購項目: "+amy.getItem());
	//數量不可為0
	if(amy.getMount()<=0)
		System.out.println("數量有誤，數量需大於0");
	else
		System.out.println("訂購數量: "+amy.getMount());
	
	System.out.println("訂購日期: "+amy.getDate());
	System.out.println("============================="+"\n");
	
	}
}