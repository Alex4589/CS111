/*
9/15/2021
*/
public class Cats{
    public static void main(String[] args){
     
        int anaCats = Integer.parseInt(args[0]);
        int ellenCats = Integer.parseInt(args[1]);
        if ((anaCats < 0 ) || (ellenCats < 0)){
            System.out.println("ERROR");
        }else {
            int totalCats = anaCats + ellenCats;
            System.out.println("Total cats = " + totalCats);
        }
    }
}