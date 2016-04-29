package di;

/**
 * Created by dw on 2016. 4. 29..
 */
public class NewlecRecordGridView extends NewlecRecordView {
    @Override
    public void print() {

        NewlecRecord record = (NewlecRecord) getRecord();

        System.out.println("┌───────────────────────┐");
        System.out.println("│                            성적  출력                        │");
        System.out.println("├───┬───┬───┬───┬───┬───┤");
        System.out.println("│ 번호  │ 국어  │ 영어  │ 수학  │ 총점  │ 평균  │");
        System.out.println("├───┼───┼───┼───┼───┼───┤");
        System.out.printf("│   %3d  │  %3d  │  %3d  │  %3d   │ %3d   │ %6.2f│\n"
                ,1 , record.getKor(), record.getEng(), record.getMath(), record.total(), record.avg());
        System.out.println("└───┴───┴───┴───┴───┴───┘");
    }
}
