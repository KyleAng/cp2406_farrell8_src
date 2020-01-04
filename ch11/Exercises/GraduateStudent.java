public class GraduateStudent extends Student{

    public GraduateStudent(int i, String l) {
        super(i, l);
        setTuition();
    }


    public void setTuition() {
        this.tuition = 6000.00;
    }
}
