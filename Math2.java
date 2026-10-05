public class Math2{
    static double pi = 3.14159265359;
    static double e = 2.71828182846;


    public static double circle (double radius){
        return pi*radius * radius;
    }


    public static double triangle (double number){
        return Math.pow(e, number);
    }

    public static double run(double a, double b, double c){
        double result = (a+b+c)/2;
        return Math.sqrt(result*(result - a) * (result - b) * (result - c));
    }
}