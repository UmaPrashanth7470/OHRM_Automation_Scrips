package com.BasicJava;

public class Inbuiltparameters {
	private static final int case1 = 0;

	public static void main(String[] args) {

		/*
		 * String x="Y s r"; String y="Y S R"; System.out.println(x.charAt(4));
		 * 
		 * System.out.println(x.equalsIgnoreCase(y));
		 * 
		 * 
		 * System.out.println("*******************************"); int var='a'; // it
		 * prints ascii numbers System.out.println("var value " + var);
		 * 
		 * char var1='b'; System.out.println("var1 value" +var1);
		 * 
		 * String stringvariable="jai jagan"; System.out.println(stringvariable);
		 * 
		 * System.out.println("*******************************");
		 * System.out.println("asci numbers of below this"); int reddy='R'; int
		 * chowdary='C'; int naidu='N'; int kapu='K'; int shetty='S';
		 * System.out.println(reddy); System.out.println(chowdary);
		 * System.out.println(naidu); System.out.println(kapu);
		 * System.out.println(shetty);
		 * 
		 * 
		 * System.out.println("*******************************"); String
		 * srini="srini sir is the corporate trainer   "; System.out.println(srini);
		 * 
		 * int n= 10; int v=12; if (n>v) { System.out.println("nag is great");
		 * 
		 * } else { System.out.println("venky is great"); }
		 * 
		 * int bday=2; switch (bday) {
		 * 
		 * case1: System.out.println("1 nov is bday"); break;
		 * 
		 * case2: System.out.println("2 nov is bday"); break; default:
		 * System.out.println("not your bday");
		 * 
		 * }
		 */

		/*
		 * String x="sudhakar"; String y="sai"; if(x.contains(y)){
		 * System.out.println("sudhakat is good"); } else{
		 * System.out.println("sai is waste");
		 * 
		 * }
		 */
		/*
		 * String x="live tech"; String y="tech"; if(x.contains(y)) {
		 * System.out.println("x contains y "); } else {
		 * System.out.println(" x it does not contains y "); }
		 * 
		 * 
		 * String p="Peoplemedia"; String p1="media"; if (p.contains(p1)) {
		 * System.out.println("string p contaims p1"); } else {
		 * System.out.println("it does not contaains");
		 * 
		 * }
		 * 
		 * 
		 * String l="LIVETECH"; String lowercase=l;
		 * System.out.println(lowercase.toLowerCase()); String b="BHAGAavanthkesari";
		 * System.out.println(b.toUpperCase()); String Bala=b;
		 * System.out.println(Bala.toLowerCase());
		 */

		
		  String y ="YS JAGAN "; 
		  String s="ys jagan"; 
		  if (y.equalsIgnoreCase(s)) {
		  System.out.println("it is same");} 
		  else {
		  System.out.println("it is not same");
		  
		  }
		  
		  
		  System.out.println("&*$#&#*@#$%^&"); System.out.println(y.toLowerCase());
		  System.out.println(s.toUpperCase()); System.out.println(y.length());
		  System.out.println(s.length());
		  
	  String ys1="YSR";
	  String ys2="Ysr";
	  System.out.println(ys1.equals(ys2));
	  System.out.println(ys1.equalsIgnoreCase(ys2));
		  
	int ylength=y.length();
	int yslength=ys1.length();
	if (ylength<yslength) {
		System.out.println("y contains heavy numbers than ys1");
		
	}
	else {
		System.out.println("ys contains heavy numbers than y");

	}
	
	String nb="natasimham";
	String nb1="Nata SIMHAm";
	int nbk=nb.length();
	int nbk1=nb1.length();
	if (nbk<nbk1) {
		System.out.println("nbk contains less characters nbk1");
		
	}
	else {
		System.out.println("nbk1 contains more characters nbk");
	}
	System.out.println("####@@@*******@@@@*****######");
		
		  

	}

}
