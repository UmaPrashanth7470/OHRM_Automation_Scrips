package com.TestNG;

import org.testng.annotations.Test;

import Log4j_Utility.Log;

public class ProductionUnit {
	@Test(priority=1)
	public void employees() {
		int x=400;
		int y=500;
		int z;
		z=x+y;
		//int z;
		//z=x+y;
	Log.info(" number of employees :" +z);
	}
	@Test(priority=2)
	public void workingunit() {
		String a="there are 2 units in production, ";
		String b="1st unit is productin unit, ";
		String c="2nd unit is packing unit .";
		
		Log.info(a+b+c);
				
	}
	@Test(priority=3)
	void workingemp () {
		int wemp =300;
		int wemp1=300;
		int wemp0;
		wemp0=wemp1+wemp;
		Log.info("total working employees in production unit:"+wemp0);
	}
	@Test(priority=4)
	protected void workingemp1() {
		int wemp1 =100;
		int wemp2=50;
		int wemp3;
		wemp3=wemp1+wemp2;
		Log.info("total working employees in :"+ wemp3);
	}

}
