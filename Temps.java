/* 
9/15/2021
*/

public class Temps{
    public static void main(String [] args){
        double tempF = Double.parseDouble(args[0]);
        if (tempF < -459.67){
            System.out.println("error");
        } else {
            double tempC = (tempF - 32.0) * 5.0/9.0;
            System.out.println(tempC);
        }
    }
}