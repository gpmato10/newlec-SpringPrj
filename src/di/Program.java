package di;

/**
 * Created by dw on 2016. 4. 29..
 */
public class Program {
    public static void main(String[] args) {
        Record record = new NewlecRecord();
        RecordView view = new NewlecRecordView();

        view.setRecord(record);

        view.input();
        view.print();
    }
}
