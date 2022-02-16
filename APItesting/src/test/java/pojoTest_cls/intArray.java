package pojoTest_cls;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo.com.CommanPojoForNumberObject;

public class intArray {
	
	@Test
	public void intAray() throws JsonGenerationException, JsonMappingException, IOException  {
		
		int[] bb= {1234,5678,7654};
		CommanPojoForNumberObject cp=new CommanPojoForNumberObject("sudarshan","TYSS001",123456,"sud@gmail.com", bb);
		
		ObjectMapper ob=new ObjectMapper();
		
		System.out.println(ob.writeValueAsString(cp));
		
		ob.writerWithDefaultPrettyPrinter().writeValue(new File("./int.json"), cp);
		
	}

}
