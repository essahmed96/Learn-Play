import org.junit.Test;
import org.testng.AssertJUnit;



public class TeacherTest {
	Teacher teacher = new Teacher();
	@Test
	public void Signin() {
		String str =  teacher.setName("T1");
		 AssertJUnit.assertEquals("T1",str);
		  
		  
		  boolean save = teacher.Signin("T1","12345");
		   AssertJUnit.assertEquals(true,save); 
		  
		    
			  boolean save1 = teacher.Signin("h","12345");
			   AssertJUnit.assertEquals(false,save1); 
		  
	}

	@Test
	public void SignUp() {
	//	teacher.setID("1");
		
		boolean save = teacher.SignUp("p2","12");
	   AssertJUnit.assertEquals(save,true); 
	   
	   
	   boolean save1 = teacher.SignUp("T1","12345")== null;
	   AssertJUnit.assertEquals(save1,false); 
	  
	   
	}
	
	

}