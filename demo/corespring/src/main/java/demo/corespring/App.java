package demo.corespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* System.out.println("Hello World!");*/
    	/*MessageService ms=new MessageService();
    	ms.printMessage();*/
    	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("demo/corespring/beanconfig.xml");
    	MessageService service=ctx.getBean("msg",MessageService.class);
    //	MessageService ser=ctx.getBean("msg",MessageService.class);
    	//System.out.println(service);
    //	System.out.println(ser);
    	service.printMessage();
    }
}
