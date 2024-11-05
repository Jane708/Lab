public class AddCustomer{
	
	private String customerNM = "請輸入您的大名。";
	private String customerSX = "請輸入您的性別。";
	private String customerBD = "";
	private String customerEM = "尚未輸入，則無法取得密碼驗證號！";
	private String customerLG = "繁體中文";
	
	public void setaddCustomer(String customerNM, String customerSX, String customerEM, String customerLG){
		this.customerNM = customerNM;
		this.customerSX = customerSX;
		this.customerEM = customerEM;
		this.customerLG = customerLG;
	}
	public void setaddCustomer(String customerNM, String customerSX, String customerBD, String customerEM, String customerLG){
		this.customerNM = customerNM;
		this.customerSX = customerSX;
		this.customerBD = customerBD;
		this.customerEM = customerEM;
		this.customerLG = customerLG;
	}
	
	//以封裝的形式撰寫，卡在於其中增加if條件的方式
	public String getaddCustomer(){
		return 
		"姓名："+this.customerNM+"\n"+
		"性別："+this.customerSX+"\n"+
		"生日："+this.customerBD+"\n"+
		"Email："+this.customerEM+"\n"+
		"語言："+this.customerLG+"\n";
	}
	
	//一般display()的寫法
	// public void display(){
		// System.out.println("姓名："+this.customerNM);
		// System.out.println("性別："+this.customerSX);
		// System.out.println("生日："+this.customerBD);
		// System.out.println("Email："+this.customerEM);
		
		//語言只有兩種選項
		// if(this.customerLG!="繁體中文" || this.customerLG!="英文")
			// System.out.println("語言：請填寫繁體中文或英文");
		// else
			// System.out.println("語言："+this.customerLG);
}
	