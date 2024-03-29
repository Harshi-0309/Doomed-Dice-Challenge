import java.util.*;
public class Dice{
    public static void main(String[] args) {
    int total_comb = 6 * 6;
    System.out.println("----- Part - 'A' -----");
    System.out.println("Question 1");
    System.out.println("Total Combinations : " + total_comb);
    System.out.println();
    System.out.println("Question 2");
    System.out.println("All Possible Combinations : ");
    for(int i=1;i<=6;i++)
    {
        for(int j=1;j<=6;j++)
        {
            System.out.print("(" + i + "," + j + ") ");
        }
        System.out.println();
    }
    System.out.println("Combinations Distribution :");
        for (int i = 2; i <= 7; i++) {
            for (int j = i; j <= i + 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    System.out.println();
    System.out.println("Question 3");
    System.out.println("All Possible Sums :");
    for(int i=2;i<=12;i++)
    {
        int num = getFreq(i);
        int den = total_comb;
        System.out.printf("P(Sum=%d) = %d/%d\n", i , num, den);
    }
}
    public static int getFreq(int sum){
        if (sum <2 || sum > 12)
            return 0;
        if (sum<=7)
            return sum-1;
        return 13-sum;        
    }
}
