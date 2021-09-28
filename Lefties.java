/*
9/22/2021
*/
public class Lefties{
    public static void main(String[] args){
        int numTrials = 0;
        for(int trials = 1; trials <= 100; trials++){
            int count = 0;
            for (int people = 1; people <=20; people++){
                int lefthanded = (int) (Math.random() * 10 +1);//random [1,10]
                // 1 means lefthanded
                if (lefthanded ==1){
                    count++;
                }
            }
            if(count >= 2){
                numTrials = numTrials + 1;
            }
        }
        System.out.println("Num trials = " + numTrials);
    }
}
