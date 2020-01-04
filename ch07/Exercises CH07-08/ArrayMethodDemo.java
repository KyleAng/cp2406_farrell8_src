public class ArrayMethodDemo {
    public static void main(String[] args){
        int[] my_array = new int[10];
        my_array = build_array(my_array); // 0-9
        System.out.println("Array");
        display(my_array);
        System.out.println("\nArray In Reverse");
        display_rev(my_array);
        System.out.println("\nSum: " + get_sum(my_array));
        System.out.println("Array below 5");
        up_to(my_array, 5);
        System.out.println("\nHigher Than Average: ");
        System.out.println("Average: " + get_avg(my_array, get_sum(my_array)));
        higher_than_avg(my_array, get_avg(my_array, get_sum(my_array)));


    }

    public static int[] build_array(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = i;
        }
        return array;
    }

    public static void display(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void display_rev(int[] array){
        for(int k=array.length-1; k!= -1; k--){
            System.out.print(array[k] + " ");
        }
    }
    public static int get_sum(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void up_to(int[] array, int num){
        for(int i=0; i<array.length; i++){
            if(array[i] < num)
                System.out.print(array[i] + " ");
        }
    }

    public static void higher_than_avg(int[] array, Double avg){
        for(int i=0; i<array.length; i++){
           if(array[i] > avg)
                System.out.print(array[i] + " ");
        }
    }

    public static Double get_avg(int[] array, int sum){
        return Double.valueOf(sum) / array.length;
    }
}
