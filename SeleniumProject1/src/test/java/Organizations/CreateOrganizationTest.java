package Organizations;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import GenericUtility.BaseClass;
import GenericUtility.Excel_Utility;
import GenericUtility.Java_Utility;
import GenericUtility.WebDriver_Utility;
import POM.HomePage;
import POM.OrganizationsPage;
import POM.VerificationAndValidationPage;

public class CreateOrganizationTest extends BaseClass{
	@Test(groups="regressiontesting")
	public void createOrganizationTest() throws Throwable {
		
		WebDriver_Utility wlib=new WebDriver_Utility();
		wlib.implicitWait(driver);
		
		//creating random class and generating random num
		Java_Utility jlib=new Java_Utility();
		int ran_num = jlib.getRandomNum();
		
		//reading data from excel
		Excel_Utility elib=new Excel_Utility();
		String Excel_data = elib.getExcelData("Organizations", 0, 0)+ran_num;
		
		HomePage homepage=new HomePage(driver);
		homepage.clickOrganisationsLinkText();
		
		OrganizationsPage orgpage=new OrganizationsPage(driver);
		orgpage.clickOrgCreateImg();
		orgpage.getOrgNameTxtField().sendKeys(Excel_data);
		orgpage.clickSaveButton();
		
		VerificationAndValidationPage validate=new VerificationAndValidationPage(driver);
		String actdata = validate.orgCreateValidation(Excel_data);
		Assert.assertEquals(actdata, Excel_data);
		
		
	}
	
	 


}
