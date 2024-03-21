package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ARRAYS {

	public static void main(String[] args) {
		Object arrayList;
/*
		 * int srini[]=new int[3];
		 * 
		 * srini[0]=35; srini[1]=244; srini[2]=200; System.out.println(srini[0]);
		 * System.out.println(srini[1]); System.out.println(srini[2]);
		 * 
		 * // for(int index=0;index<=2;index++) { for(int index
		 * =0;index<srini.length;index++) { System.out.println(srini[index]); }
		 

		int mouni[] = new int[2];
		mouni[0] = 222;
		mouni[1] = 333;
		mouni[2] = 111;
		mouni[3] = 444;

		for (int muni = 0; muni <= mouni.length; muni++) {
			System.out.println(mouni[muni]);
		}
		
		
		int konda[]= new int[3];
		  konda[0]=33;789541.
		  konda[1]=44;
		  konda[2]=55;
		for(int rowdy=0;rowdy<=konda.length;rowdy++) {
			System.out.println(konda[rowdy]);
		}
		
		
	int revi[]= new int[3];
	revi[0]=22;
	revi[1]=33;
	revi[2]=44;
	for(int ravi=0;ravi<=revi.length;ravi++) {
		System.out.println(revi[ravi]);
	}
		
	int m[]=new int[3];
	m[0]=90;
	
	m[1]=80;
	m[2]=70;
	for(int om=0;om<=m.length;om++) {
		System.out.println(m[om]);
	}

		int lav[]= new  int[3];
		
		lav[0]=22;
		lav[1]=55;
		lav[2]=66;
		for(int lavs=0;lavs<=lav.length;lavs=lavs++) {
			System.out.println(lav[lavs]);
		}*
		
		
		int x[]= new int [3];
		x[0]=20;
		x[1]=11;
		x[2]=33;

		
		for(int xa=0;xa<x.length; xa++) {
			System.out.println(x[xa]);
		}
		
		int y[]= new int[5];
		y[0]=222;
		y[1]=223;
		y[2]=322;
		y[3]=111;
		y[4]=98;
		for(int ya=0;ya<y.length;ya++) {
			System.out.println(y[ya]);
		}
		
		
		int n[]=new int[10	];
		n[0]=123;
		n[1]=321;
		n[2]=320;
		n[3]=650;
		n[8]=886;
		n[7]=554;
		n[6]=334;
		n[4]=444;
		n[5]=432;
		n[9]=999;
		
		for(int nag =0;nag<n.length;nag++) {
			System.out.println(n[nag]);
		}
		
		int bal[]=new int [12];
		bal[11]=22;
		bal[10]=33;
		bal[9]=12;
		bal[8]=234;
		bal[7]=43;
		bal[6]=34;
		bal[5]=56;
		bal[4]=44;
		bal[3]=889;
		bal[2]=456;
		bal[1]=982;
		bal[0]=765;
		for(int bala=0;bala<bal.length;bala++) {
			System.out.println(bal[bala]);
		}
		
		
		int vik[]= new int[ 24];
		vik[0]=223;
		vik[1]=330;
		vik[2]=440;
		vik[3]=234;
		vik[4]=443;
		vik[5]=333;
		vik[6]=443;
		vik[7]=444;
		vik[8]=666;
		vik[9]=888;
		vik [10]=12;
		for(int viki=0;viki<=vik.length;viki++) {
			System.out.println(vik[viki]);
		}
				
		int esh[] []=	new int[2][2];
		esh[0][0]=55;
		esh[0][1]=99;
		System.out.println(esh);
		
		String array1[][]=new String [3][3];
		array1[0][0]="venkat";
		
		array1[0][1]="manual testing";
		
		array1[1][0]="vishnu";
				
		array1[1][1]="APi";
		
				
		array1[2][0]="srini";
		
				
		array1[2][1]= "automation";
		
	for(int arr=0;arr<=2;arr++) {	
		for(int arra=0;arra<=2;arra++)
			System.out.println(array1[arr] [arra]);
	}
		{
		System.out.println();
	}
		String array0 [][]=new String [1][5];
		array0[0] [0]="data science";
		array0[0][1]="meachine learning";
		array0[0][2]="deep learning";
		array0[0][3]="statstics";
		array0[0][4]="java";
		
		for (int x=0;x<=5;x++) {
			for(int y=0;y<=5;y++) {
				System.out.println(array0[x][y]);
				
			}
		}
		
		String multidimension[][]=new String [1][4];
		
		multidimension[0][0]="guntur karam";
		multidimension[0][1]="saindhav";
		multidimension[0][2]="hanuman";
		multidimension[0][3]="eagle";
		for (int multireleasedate =0;multireleasedate<3;multireleasedate++) {
			for(int multireleasedate1=0;multireleasedate1<3;multi releasedate1++) {
				System.out.println(multidimension[multireleasedate][multireleasedate1]);
			}
			System.out.println();
		}
		
		String cherry[]=new String[5];
		cherry[0]="chirutha";
		cherry[1]="magadheera";
		cherry[2]="raccha";
		cherry[3]="nayak";
		cherry[4]="rangastalam";
		for(int cherry1=0;cherry1<=5;cherry1++) {
			System.out.println(cherry[cherry1]);
			
		}
		
	String livetech[][]=new String [1][4];
	livetech[0][0]="revi";
	livetech[0][1]="venky";
	livetech[0][2]="vikky";
	livetech[0][3]="uma";
	for(int livetech1=1;livetech1<=livetech.length;livetech1++) {
		for (int liveteach=1;liveteach<=livetech.length;liveteach++)
			System.out.println(livetech[livetech1][liveteach]);
		
	}
//object array
Object array[]=new Object [3];	
array [0]=10;
array[1]=22;
array[2]=33;
System.out.println(array [0]);
	for(int a=0; a<=array.length;a++)	{
		System.out.println(array[a]);
		}
	
Object venky[]=new Object[4];
venky[0]=88;
venky[1]=89;
venky [2]="venk";
venky[3]=44;
for(int ven=0;ven<=venky.length;ven++) {
	System.out.println(venky[ven]);
}

		Object rowdy[]=new Object[4];
		rowdy[0]="pelli choopulu";
		rowdy[1]="arjun reddy";
		rowdy[2]="taxiwal"	;
		rowdy[3]="IRONEY VANCHALA YEnti";
		
		for(int row=0;row<=rowdy.length;row++) {
			System.out.println(rowdy[row]);
		}
		
		Object Jagan[]= new Object [9];
		Jagan[0]="amma vodi";
		Jagan[1]="aarogya sri";
		Jagan[2]="pension";
		Jagan[3]="raithu barosa";
		Jagan[4]="nadu nedu";
		Jagan[5]="madhya panam nisheydham";
		Jagan [6]="job calendar";
		Jagan [7]="Rural development";
		Jagan[8]="Sachivalayam";
		for(int J=0;J<=Jagan.length;J++) {
			System.out.println(Jagan[J]);
		}



		// Syntax:-
		// List<dataType>arrayListName = new ArrayList<>();
		// ArrayList - collections of Java

		//String array2[] = new String[2]; // static Structure with 2 indexes
		//arrayList1[0]=10

		List<Object>arrayList1 = new ArrayList<>(); // Dynamic data structure with not indexes
		arrayList1.add("10.6");
		//System.out.println(arrayList1.get(0));

		arrayList1.add("LoadRunner");
		//System.out.println(arrayList1.get(1));

		arrayList1.add(10);
		//System.out.println(arrayList1.get(2));

		//arrayList1.add('B');
		//System.out.println(arrayList1.get(3));

		//arrayList1.add(true);

		//for(int index=0;index<=2;index++)
		for(int index=0;index<arrayList1.size();index++)
		{
		System.out.println(arrayList1.get(index));
		}
		System.out.println(arrayList1.size());*/
		
       List<Integer> y= new ArrayList<>();
       y.add(10);
       y.add(45);
       System.out.println(y);
     
       
       
       
       


		
       
		
				
		
		
		
	
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		}

}
