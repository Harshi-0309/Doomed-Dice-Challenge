import java.util.*;

public class Dice2 {

    public static void undoom_dice(int[] die_A, int[] die_B) {
        int[] New_Die_A = Arrays.copyOf(die_A, die_A.length);
        int[] New_Die_B = Arrays.copyOf(die_B, die_B.length);

        for (int i = 0; i < New_Die_A.length; i++) {
            if (New_Die_A[i] > 4) {
                New_Die_B[i] += (New_Die_A[i] - 4); 
                New_Die_A[i] = 4; 
            }
        }
        System.out.print("New_Die_A : [");
        for (int i = 0; i < New_Die_A.length; i++) {
            System.out.print(New_Die_A[i]);
            if (i != New_Die_A.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("New_Die_B : [");
        for (int i = 0; i < New_Die_B.length; i++) {
            System.out.print(New_Die_B[i]);
            if (i != New_Die_B.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] die_A = {1, 2, 3, 4, 5, 6};
        int[] die_B = {1, 2, 3, 4, 5, 6};
        System.out.println("-----Part -'B'-----");
        System.out.println("Input:");
        System.out.println("Die_A = " + Arrays.toString(die_A));
        System.out.println("Die_B = " + Arrays.toString(die_B));
        System.out.println("Output:");

        undoom_dice(die_A, die_B);
    }
}



