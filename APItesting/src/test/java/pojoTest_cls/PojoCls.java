package pojoTest_cls;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo.com.commanPojo_cls;

public class PojoCls {
	
	@Test
	public void emp() throws JsonGenerationException, JsonMappingException, IOException {
		
		commanPojo_cls cs=new commanPojo_cls("sudarshan","TYss001",12345,"sudars@gmail.com");
          
		ObjectMapper om=new ObjectMapper();
		
		System.out.println(om.writeValueAsString(cs));
	    om.writerWithDefaultPrettyPrinter().writeValue(new File("./FirstCls.jason"), cs);
	
	}
	
	

}
