package mypractice;

import org.apache.poi.hpbf.model.MainContents;

public class Methodspractice {
	/*public void addition() {
		int var1=10;
		int var2=20;
		int var3 ;
		var3=var1-var2;
		System.out.println("the addition value of :-"+var3);
	}
	public static void main(String[] args) {
		Methodspractice mp =new Methodspractice();
		Methodspractice sub=new Methodspractice();
		Methodspractice vik =new Methodspractice();
		Methodspractice div =new Methodspractice();
		Methodspractice kha =new Methodspractice();
	    mp.addition();
	    sub.substraction();
	    vik.multiplication();
	    div.divison();
	    kha.Words();
	    
	}
	
	private static void substraction(){
		int ven1=30;
		int ven2=43;
		int ven3;
		ven3=ven1-ven2;
		System.out.println(" the value of substraction:-"+ven3);
		
	}
	protected void multiplication() {
		int vik=90;
		int vikk=90;
		int vikki;
		vikki=vik*vikk;
		System.out.println("the value of multiplication:-"+vikki);
		
	}
	void divison () {
		int div1=20;
		int div2=2;
		int div3;
		div3=div1/div2;
		System.out.println("the value of div :-"+div3);
		
	}
	public void Words() {
		String hey ="khaleja;";
		String hey2="tri@mahi";
		String hey3;
		hey3=hey+""+hey2;
		System.out.println(hey3);*/
	public void carspeed() {
		int speed =20;
		int speed1=60;
		int speed2;
		speed2=speed+speed1;
		System.out.println("this is minimum speed of LAMBHORGIN:-"+speed2);
		
	}
	public void cargears() {
		int gears=4;
		System.out.println("lambhorghini car has gears:"+gears);
		
	}
	protected void cartyres() {
		int tyres=4;
		System.out.println("lambhorghini car has gears:"+tyres);
	}
	void seats() {
		int seats=4;
		System.out.println("lambhorgini car has seats:"+seats);
	
				
	}
	public static void main(String[] args) {
		Methodspractice lambhorgini =new Methodspractice() ;
		Methodpractice2 bank= new Methodpractice2();
		bank.ICICI();
		bank.Deposit();
		bank.withdrawl();
		
		
		System.out.println("**********************");
		
		
			lambhorgini.cargears();
			lambhorgini.cartyres();
			lambhorgini.carspeed();
			lambhorgini.seats();
	
		}
	}
	
	
		
		
		
		

	


