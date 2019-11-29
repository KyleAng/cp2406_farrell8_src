public class Percentages {

    public static void main(String[] args){
        double variable1 = 1.25;
        double variable2 = variable1*2;
        System.out.println(variable1 + " is " + computePercent(variable1, variable2) + " percent of " + variable2);
        System.out.println(variable2 + " is " + computePercent(variable2, variable1) + " percent of " + variable1);

    }

    public static double computePercent(double x, double y){
        return (x/y)*100;
    }

}
