public abstract class Student {
    int id;
    String last;
    Double tuition;

    public Student(int i, String l){
        id = i;
        last = l;
    }

    public int getId() {
        return id;
    }

    public Double getTuition() {
        return tuition;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public abstract void setTuition();
}

