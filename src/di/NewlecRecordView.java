package di;

import java.util.Scanner;

/**
 * Created by dw on 2016. 4. 29..
 */
public class NewlecRecordView implements RecordView {

    private NewlecRecord record;

    @Override
    public void setRecord(Record record) {
        this.record = (NewlecRecord) record;
    }

    @Override
    public Record getRecord() {
        return record;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kor:");
        record.setKor(scan.nextInt());
        System.out.println("eng:");
        record.setEng(scan.nextInt());
        System.out.println("math:");
        record.setMath(scan.nextInt());
    }

    @Override
    public void print() {
        System.out.printf("kor:%d\n", record.getKor());
        System.out.printf("eng:%d\n", record.getEng());
        System.out.printf("math:%d\n", record.getMath());
        System.out.printf("total:%d\n", record.total());
        System.out.printf("avg:%f\n", record.avg());

    }

}
