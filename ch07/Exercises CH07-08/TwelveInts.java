public class TwelveInts {
    public static void main(String[] args){
        int[] my_array = new int[12];
        for(int i=0; i<my_array.length; i++){
            my_array[i] = i + 1;
        }
        System.out.println("First to Last");
        for(int j=0; j<my_array.length; j++){
            System.out.print(my_array[j] + " ");
        }
        System.out.println("\nLast to First");
        for(int k=my_array.length - 1; k!=-1; k--){
            System.out.print(my_array[k] + " ");
        }

    }
}
