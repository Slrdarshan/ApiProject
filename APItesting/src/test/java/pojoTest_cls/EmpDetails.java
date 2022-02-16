package pojoTest_cls;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo.com.CompanyCls;
import pojo.com.empCls;

public class EmpDetails {

	@Test
	public void deails() throws JsonGenerationException, JsonMappingException, IOException {
		
		int[] a= {11123,567890,123456789};
		empCls ec1=new empCls("sudarshan", "TYss001",123456,"suda@gmail.com");
		empCls ec2=new empCls("darshan", "TYss002",123456,"suda@gmail.com");
		empCls ec3=new empCls("sudar", "TYss003",123456,"suda@gmail.com");
		
		Object[] emp= {ec1,ec2,ec3}; 
		
		CompanyCls cs=new CompanyCls("TYSS",a,emp);
		
		ObjectMapper om=new ObjectMapper();
		
		System.out.println(om.writeValueAsString(cs));
		om.writerWithDefaultPrettyPrinter().writeValue(new File("./company.jason"), cs);
		
		
	}
	
	
}
