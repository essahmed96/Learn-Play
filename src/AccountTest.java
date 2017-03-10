import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.testng.AssertJUnit;

public class AccountTest {
	 Account account = new Account();
	 private Object name;
	 @Test
	    public void ShowScore() throws FileNotFoundException
	    {
	        //given
		String str =  account.setName("sayed");
		  AssertJUnit.assertEquals("sayed",str);  

	       
	        

	        String str1 = Account.ShowScore("sayed");
	        AssertJUnit.assertEquals("12",str1);
	        
	        boolean save1 = Account.ShowScore("say") != null;
			   AssertJUnit.assertEquals(false,save1); 
	 
	     
	 
	 
	 }
	
		
		
	

}
