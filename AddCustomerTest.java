public class AddCustomerTest{
	public static void main(String[] args){
	
		AddCustomer jane = new AddCustomer();
		
		jane.setaddCustomer("簡盈", "女", "jane@gmail.com", "簡體中文");
		
		//以set和get方式撰寫，故暫時不使用display()
		// jane.display();
		
		System.out.println("會員資料"+jane.getaddCustomer());
	}
}