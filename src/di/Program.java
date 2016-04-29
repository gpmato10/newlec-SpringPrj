package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dw on 2016. 4. 29..
 */
public class Program {
    public static void main(String[] args) {
//        Record record = new NewlecRecord();
//        RecordView view = new NewlecRecordView();
//
//        view.setRecord(record);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//        RecordView view = (RecordView) ctx.getBean("view");
        Record r = (Record) ctx.getBean("r4");

        RecordView v = (RecordView) ctx.getBean("view");
        v.setRecord(r);
        v.print();

    }
}
