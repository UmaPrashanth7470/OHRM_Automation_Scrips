package com.TestNG;

import org.testng.annotations.Test;

import Log4j_Utility.Log;

public class SalaarData extends BaseTest {
	//@BeforeTest
	//@AfterTest
	//@Test
	
	@Test
	public void SalaarCast_Crew() {	
		String Actror = "Prabhas";
		String Actror2 = "PruthviRaj";
		int Total_MainCharacterArtists = 10;	
		Log.info(Actror);
		Log.info(Actror2);
	    Log.info("Total_MainCharacterArtists"+Total_MainCharacterArtists);

	}
}
