package mypractice;

public class Inbuiltparameters {
public static void main(String[] args) {
	String n="BALAKRISHNA ";
	String n1="balakrishna ";
	System.out.println(n.equalsIgnoreCase(n1));
	System.out.println(n.contains(n1));
	System.out.println(n1.toUpperCase());
	System.out.println(n.toLowerCase());
	System.out.println(n.equals(n1));
	
System.out.println(n.charAt(6));
System.out.println(n1.charAt(6));


int nb=n.length();
int nb1=n1.length();

if(nb>=nb1) {
	System.out.println("nb is same " +nb);
}
else {
	System.out.println("not same"+nb1);
}

String x="vikesh bhai";
String y="venky bhai";
String z="ravi bhai";

int x1=x.length();
int y1=y.length();
int z1=z.length();
if (x1>y1&&x1>z1) {
	System.out.println("x is greater than all statements");
	
}

if (y1>z1) {
	System.out.println("y is greater than all statements");
	
}
else {
System.out.println("z is greater than all statements");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}	

}
