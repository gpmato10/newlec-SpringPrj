package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * Created by dw on 2016. 4. 30..
 */
public class Program {
    public static void main(String[] args) {
//        Calculator cal = new NewlecCalculator();
//
//        Calculator proxy =
//                (Calculator) Proxy.newProxyInstance(
//                cal.getClass().getClassLoader(),
//                cal.getClass().getInterfaces(),
//                new LogPrintHanlder(cal));


        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Calculator proxy = (Calculator) ctx.getBean("proxy");

        System.out.println(proxy.add(3, 4));
//        System.out.println(cal.add(3, 4));
    }
}
