package Practice;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertTest {
	@Test
	public void createContact()
	{
		System.out.println("step1");
		System.out.println("step2");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(true, true);
		System.out.println("step3");
		System.out.println("step4");
		sa.assertAll();
		//pushing changes
		//pulling changes
		//jenkin push
	}

}
