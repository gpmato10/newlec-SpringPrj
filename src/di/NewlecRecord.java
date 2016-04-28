package di;

/**
 * Created by dw on 2016. 4. 29..
 */
public class NewlecRecord implements Record {

    private int kor;
    private int eng;
    private int math;

    public NewlecRecord() {
    }

    public NewlecRecord(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }


    @Override
    public int total() {
        return kor+eng+math;
    }

    @Override
    public float avg() {
        return total() / 3.0f;
    }
}
