public class StudentAtLarge extends Student{

    public StudentAtLarge(int i, String l) {
        super(i, l);
        setTuition();
    }


    public void setTuition() {
        this.tuition = 2000.00;
    }
}
