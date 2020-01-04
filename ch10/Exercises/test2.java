public class test2 extends test {
    private int length;
    public test2(int l_id, int L_length){
        super(l_id, L_length/2);
    }

    public static void main(String[] args){
        test2 t2 = new test2(5, 10);
        System.out.println(t2.getLength());
        test t1 = new test(6, 10);
        System.out.println(t1.getLength());
    }
}
