package com.Ohrm_valids;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Ohrm_login {
	@Test(priority = 1,description = "ohrm valids")
	
	private void ohrm() {
		// TODO Auto-generated method stub

	
		
	
	 WebDriver driver;
	 System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("open the browser");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
//	driver.get("https://www.google.co.in/");
//	System.out.println("opens the google");
	driver.navigate().to("http://127.0.0.1/orangehrm-4.2.0.1");
	System.out.println("Navigate the ohrm");
	String ohrmactualtittle=driver.getTitle();
	String ohrmactualurl=driver.getCurrentUrl();
	String ohrmexpecttittle="OrangeHRM";
	String ohrmexpecturl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	if (ohrmactualtittle.equals(ohrmexpecttittle)) 
	{System.out.println("1)the tittle is matches as per requirement:pass");}
	else 
	{System.out.println("1)the tittle is not matches as per requirement:false");}
	
	if (ohrmactualtittle.equalsIgnoreCase(ohrmexpecttittle)) 
	{System.out.println("2)the tittle is matches as per requirement aftter the ignorecases:pass");}
	else 
	{System.out.println("2)the tittle is not matches as per requirement aftter the ignorecases:fail");}
	
	if (ohrmactualtittle.contains(ohrmexpecttittle)) 
	{System.out.println("3)the contains the same as per requirement:pass");}
	else 
	{System.out.println("3)the contains the same as per requirement:fail");}
	
	if (ohrmactualurl.equals(ohrmexpecturl)) 
	{System.out.println("4)the contains the same as per requirement:pass");}
	else 
	{System.out.println("4)the contains the same as per requirement:fail");}
	String invalidemail="ummmmasss";
	String invalidpassword="prsssss";
	String validemail="Uma@7470";
	String validpassword="Pra@7470";
	By loginpanelpropert=By.id("logInPanelHeading");
	WebElement logintext=driver.findElement(loginpanelpropert);
	System.out.println("the text of :"+logintext.getText());
	By usernameproperty=By.id("txtUsername");
	By passwordpropery=By.id("txtPassword");
	By loginproperty=By.id("btnLogin");
	WebElement username=driver.findElement(usernameproperty);
	WebElement password=driver.findElement(passwordpropery);
	username.sendKeys(invalidemail);
	password.sendKeys(invalidpassword);
	WebElement login=driver.findElement(loginproperty);
	login.click();
	System.out.println("it displays the invalid credintails");
	driver.navigate().back();
	System.out.println("driver navigates the back");
	username.clear();
	password.clear();
	System.out.println("clearing the invalid credientails");
	
	username.sendKeys(validemail);
	password.sendKeys(validpassword);
	login.click();
	System.out.println("it shows the displays login home page");
	By welcometextproperty=By.xpath("//a[text()='Welcome Admin']");
	WebElement welcome_admin_actual_text=driver.findElement(welcometextproperty);
	System.out.println("it is the welcome actual text :"+welcome_admin_actual_text.getText());
	
	By admintextproperty=By.xpath("//b[text()='Admin']");
	WebElement admin_actual_text=driver.findElement(admintextproperty);
	System.out.println("it is the admin actual text :"+admin_actual_text.getText());
	
	By pimtextproperty=By.xpath("//b[text()='PIM']");
	WebElement pim_actual_text=driver.findElement(pimtextproperty);
	System.out.println("the is the pim of actual text :"+pim_actual_text.getText());
	
	By leavetextproperty=By.xpath("//b[text()='Leave']");
	WebElement leave_actual_text=driver.findElement(leavetextproperty);
	System.out.println("it is the leave of actual text:"+leave_actual_text.getText());
	
	By recruittextproperty=By.xpath("//b[text()='Recruitment']");
	WebElement recruit_actual_text=driver.findElement(recruittextproperty);
	System.out.println("it is the recruit of actual text:"+recruit_actual_text.getText());
	
	By performancetextproperty=By.xpath("//b[text()='Performance']");
	WebElement performance_actual_text=driver.findElement(performancetextproperty);
	System.out.println("it is performance of actual text :"+performance_actual_text.getText());
	
 By dashboardproperty=By.xpath("//b[text()='Dashboard']");
 WebElement dashboard_actual_text=driver.findElement(dashboardproperty);
 System.out.println("it is the dashboard of actual text:"+dashboard_actual_text.getText());
 
 By directorytextproperty=By.xpath("//b[text()='Directory']");
 WebElement directory_actual_text=driver.findElement(directorytextproperty);
 System.out.println("it is the directory of actual text:"+directory_actual_text.getText());
 
 By maintaincetextproperty=By.xpath("//b[text()='Maintenance']");
 WebElement maintaince_actual_text=driver.findElement(maintaincetextproperty);
 System.out.println("it is the the maintaince of actual text:"+maintaince_actual_text.getText());
 
 By quicklaunchtectproperty=By.xpath("//legend[text()='Quick Launch']");
 WebElement quick_launch_actual_text=driver.findElement(quicklaunchtectproperty);
 System.out.println("it is the  quick launch of actual text:"+quick_launch_actual_text.getText());
 
 By assignleavetextproperty=By.xpath("//span[text()='Assign Leave']");
 WebElement assign_actual_text=driver.findElement(assignleavetextproperty);
 System.out.println("it is assigntextt:"+assign_actual_text.getText());
 
 By leavelisttextpropery=By.xpath("//span[text()='Leave List']");
 WebElement leave_list_actual_text=driver.findElement(leavelisttextpropery);
 System.out.println("it is the  leaveslist actual text:"+leave_list_actual_text.getText());
 
 By timesheettextproperty=By.xpath("//span[text()='Timesheets']");
 WebElement time_sheet_actual_text=driver.findElement(timesheettextproperty);
 System.out.println("it is the  timesheet actual text"+time_sheet_actual_text.getText());
 
 By employeedistrubutionsubmitproperty =By.xpath("//legend[text()='Employee Distribution by Subunit']");
 WebElement employee_distrubution_actual_text=driver.findElement(employeedistrubutionsubmitproperty);
 System.out.println("it is the employee distrubution actual text"+employee_distrubution_actual_text.getText());
 
 By legendtextproperty=By.xpath("//legend[text()='Legend']");
 WebElement legend_actual_text=driver.findElement(legendtextproperty);
 System.out.println("it is the legend actual text:"+legend_actual_text.getText());
 
 By pendingleaverequestsproperty=By.xpath("//legend[text()='Pending Leave Requests']");
 WebElement pending_leave_request_actual_text=driver.findElement(pendingleaverequestsproperty);
 System.out.println("it is the pending_leave_request_actualtext: "+pending_leave_request_actual_text.getText());
 
 String welcome_admin_expect_text="Welcome Admin";
 String admin_expect_text="Admin";
 String Pim_expect_text="PIM";
 String leave_expect_text="leave";
 String time_expect_text="Time";
 String recruitment_expect_text="Recruitment";
 String performance_expect_text="Performance";
 String dashboard_expect_text="DashBoard";
 String directory_expect_text="Directory";
 String maintaince_expect_text="maintaince";
 String quicklaunch_expect_text="Quick launch";
 String assignleave_expect_text="Assign Leave";
 String leavelist_expect_text="Leavelist";
 String timesheet_expect_text="Time Sheets";
 String employee_distribution_by_submit_expect_text="Employee Distribution By Submit";
 String legend_expect_result="Legend";
 String pending_leave_requests="Pending Leave Requests";
 
 if (welcome_admin_actual_text.equals(welcome_admin_expect_text)) 
 {System.out.println("1)welcome admin text is matches as per requirement:pass");}
 else
 {System.out.println("1)welcome admin text is not matches as per requirement:fail");}
 
 if (admin_actual_text.equals(admin_expect_text)) 
 {System.out.println("2) admin text is matches as per requirement:pass");}
 else 
 {System.out.println("2) admin text is not matches as per requirement:fail");}
 
 if (pim_actual_text.equals(Pim_expect_text)) 
 {System.out.println("3) pim text is matches as per requirement:pass");}
 else
 {System.out.println("3) pim text is not matches as per requirement:fail");}
 
 if (leave_actual_text.equals(leave_expect_text)) 
 {System.out.println("4) Leave text is  matches as per requirement:pass");}
 else 
{System.out.println("4) leave text is not matches as per requirement:fail");}
 
 if (time_expect_text.equals(time_sheet_actual_text) )
 {System.out.println("5) Time text is  matches as per requirement:pass");}
 else
 {System.out.println("5) Time text is not  matches as per requirement:fail");}
 if(recruit_actual_text.equals(recruitment_expect_text))
 {System.out.println("6) Recruit text is  matches as per requirement:pass");}	
 else
 {System.out.println("6) Recruit text is  not matches as per requirement:fail");}
 
 if(performance_actual_text.equals(performance_expect_text))
 {System.out.println("7) performance  text is  matches as per requirement:pass");}
 else
 {System.out.println("7) performance  text is not matches as per requirement:fail");}
 
 if(dashboard_actual_text.equals(dashboard_expect_text))
 {System.out.println("8) dashboard text is  matches as per requirement:pass");}
 else
 {System.out.println("8) dashboard text is not matches as per requirement:fail");}
 
 if(directory_actual_text.equals(directory_expect_text))
{System.out.println("9) directory text is  matches as per requirement:pass");}
 else 
 {System.out.println("9) directory text is not matches as per requirement:fail");}
 
 if(maintaince_actual_text.equals(maintaince_expect_text))
 {System.out.println("10) directory text is  matches as per requirement:pass");}
 else
 {System.out.println("10) directory text is not matches as per requirement:fail");}

 if(quick_launch_actual_text.equals(quicklaunch_expect_text))
 {System.out.println("11) quick launc text is  matches as per requirement:pass");}
 else
 {System.out.println("11) quick launc text is not matches as per requirement:fail" );}
 
 if(assign_actual_text.equals(assignleave_expect_text))
 {System.out.println("12) assign leave text is  matches as per requirement:pass");}
 else
 {System.out.println("12) assign leave text is  not matches as per requirement:fail");}
 
 if(leave_list_actual_text.equals(leavelist_expect_text))
 {System.out.println("13)  leave list text is  matches as per requirement:pass");}
 else
 {System.out.println("13)  leave list text is not matches as per requirement:fail");}
 
 if(time_sheet_actual_text.equals(timesheet_expect_text))
 {System.out.println("14) time sheet text is  matches as per requirement:pass");}
 else
 {System.out.println("14 ) time sheet text is not matches as per requirement:fail");}
 
 By welcomeadminproperty=By.id("welcome");
 WebElement welcomeadmin=driver.findElement(welcomeadminproperty);
 welcomeadmin.click();
 System.out.println("clicking the welcome admin");
 
 By logoutproperty=By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a");
 WebElement logout=driver.findElement(logoutproperty);
 logout.click();
 System.out.println("logout the ohrm");
 driver.quit();
 System.out.println("driver.close");
}
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 
 
 
	

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
		
		
	
		
	
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


