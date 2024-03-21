package mypractice;

public class Method3 {
	public void ITcompany(){
		
		String wel="welcome to our company";
		String come=" its a best company";
		System.out.println( " this is the company wishe ;- " +wel + come);
		
	}
	
	 public void  services () {
		String ser="Development,testing, cloudservices and Data Science ";
		System.out.println("we provide our services;"+ ser);
		
	}
	 void clients() {
		 String cli="we have clients in US&UK";
		 System.out.println(cli);
		 System.out.println("##############");
	 }
	public static void main(String[] args) {
		Method3 it =new Method3 ();
		Methodpractice2 bank=new Methodpractice2();
		Methodspractice car=new  Methodspractice();
		it.ITcompany();
		it.services();
		it.clients();
		bank.ICICI();
		bank.Deposit();
		bank.withdrawl();
		System.out.println();
		car.seats();
		car.cargears();
		car.carspeed();
		car.cartyres();
		
	}

}
