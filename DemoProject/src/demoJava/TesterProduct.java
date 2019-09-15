package demoJava;

import java.io.File;
//import java.util.logging.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import org.apache.log4j.Logger;

public class TesterProduct {

	private final static Logger log=Logger.getLogger(TesterProduct.class.getName());
	public static void main(String[] args) throws Exception {
 String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.xml";
 DOMConfigurator.configure("log4j.xml");
		Product p=new Product(1002, "T-Shirt", 3);
		
		log.info("Product Id is: "+p.getProductId());
		log.info("Product Name is: "+p.getProductName());
		log.info("Product Stock available is: "+p.getStock());
		
		
		
		Product.orderProduct(p);
		Product.orderProduct(p);
		if(p.getStock()==1) {
			log.warn("Only 1 "+p.getProductName()+" left");
		}
		Product.orderProduct(p);
		if(p.getStock()==0) {
			try {
				throw new Exception(p.getProductName()+" out of stock");
			}
			catch(Exception e) {
				log.error(e.getMessage());
			}
		}
		Product.orderProduct(p);
		
		
		

	}

}
