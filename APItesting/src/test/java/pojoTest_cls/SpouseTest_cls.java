package pojoTest_cls;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo.com.Mydetails;
import pojo.com.SpouseDetails;

public class SpouseTest_cls {
	
	
	@Test
	public void spousedetails_Test() throws JsonGenerationException, JsonMappingException, IOException {
	SpouseDetails sd=new SpouseDetails("pallavi","pallu@gmail.com",567890);
	Mydetails my=new Mydetails("sudarshan","suda@gmail.com",123456,sd);
	
	ObjectMapper ob=new ObjectMapper();
	System.out.println(ob.writeValueAsString(my));
	
	ob.writerWithDefaultPrettyPrinter().writeValue(new File("./spouse.jason"), my);
	
	}
	
	
	

}
