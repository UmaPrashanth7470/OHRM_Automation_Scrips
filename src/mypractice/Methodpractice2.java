package mypractice;

public class Methodpractice2 {
	public static void main(String[] args) {
		/*Methodspractice car=new Methodspractice();
		car.carspeed();
		car.cartyres();
		car.seats();
		car.cargears();*/
		Methodpractice2 bank= new Methodpractice2();
		bank.ICICI();
		bank.Deposit();
		bank.withdrawl();
		
	}
	public void ICICI() {
		String icici="welcome to ICICI Bank";
		System.out.println("greetings :"+icici);
	}
	void Deposit() {
		int deposit=1000;
		System.out.println(" deposit the money in bank:"+deposit);
	}
	protected void withdrawl() {
		int deposit=1000;
		int withdraw=400;
		int currentbalance;
		currentbalance=deposit-withdraw;
		System.out.println("the current balance is:-"+currentbalance);
	}
	

}
