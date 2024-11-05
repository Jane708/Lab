public class OrderInquiry{
//訂單查詢所需資料(私密):訂購品項、訂購數量、訂購日期
	public String name;
	
	private String Item;
	private int Mount;
	private String Date;
	
	//訂購品項
	public void setItem(String item){
		if(item=="戲劇"||item=="電影"||item=="展覽"){
			Item=item;
		}
	}
	
	public String getItem(){
		return Item;
	}
	
	//訂購數量
	public void setMount(int mount){
		Mount=mount;
	}
	
	public int getMount(){
		return Mount;
	}
	
	//訂購日期
	public void setDate(String date){
		//時間不可小於訂購當天的日期
		Date=date;
	}
	
	public String getDate(){
		return Date;
	}
	
}