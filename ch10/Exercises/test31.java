public class test31 extends test3 {
    int y;
    int j;

    public test31(int i_x, int i_y, int i_j){
        x = i_x;
        y = i_y;
        j = i_j;
    }

    public int getY() {
        return y;
    }

    public int getJ() {
        return j;
    }

    public static void main(String[] args){
       test31 testy = new test31(3, 4, 5);
        System.out.println(testy.getX());
        System.out.println(testy.getY());
        System.out.println(testy.getJ());
    }
}

