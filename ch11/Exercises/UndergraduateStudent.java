public class UndergraduateStudent extends Student{

    public UndergraduateStudent(int i, String l) {
        super(i, l);
        setTuition();
    }


    public void setTuition() {
        this.tuition = 4000.00;
    }
}
