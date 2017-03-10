import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.testng.AssertJUnit;

//import com.FCI.SWE.Models.UserEntity;

//import com.FCI.SWE.Models.UserEntity;

public class StudentTest {

	@Test
	public void testWriteScore() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
	Student  x1 =new Student();
	x1.setName("kero");
	//x1.WriteScore();
	
	 

	 String str1 = x1.WriteScore("TOF");
   AssertJUnit.assertEquals("TOF",str1);
   
   

	 String str2 = x1.WriteScore("MSQ");
 AssertJUnit.assertEquals("MSQ",str2);
 
 boolean save1 = x1.WriteScore("")== null;
 AssertJUnit.assertEquals(save1,false); 
		 
     	      
	}

}
