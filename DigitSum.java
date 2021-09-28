/*

9/20/2021
Sum of the digits in a number

*/
public class DigitSum{
        public static void main(String[] args) {
                int num = Integer.parseInt(args[0]);
                int sum = 0;
                while (num > 0){
                    int dig = num % 10;
                    sum += dig;
                    num /= 10;
                }
                System.out.println("The sum of the digits in " + args[0] + " is " + sum);
        }
    }
