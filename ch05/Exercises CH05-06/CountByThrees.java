public class CountByThrees {
    public static void main(String[] args){
        final int three = 3;
        for(int i = three; i<= 300; i+= three){
            if(i % 30 == 0){
                System.out.println(i);
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
