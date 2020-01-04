public class test {
    private int id;
    public int length;
    public test(int c_id, int c_length){
        id = c_id;
        length=c_length;
    }
    public test(int c_id){
        id = c_id;
        length=10;
    }
    public test(){}

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }
}
