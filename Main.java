import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private int sides;

    // Constructor to initialize the number of sides for the dice
    public Main(int sides) {
        this.sides = sides;
    }

    // Method to generate modified dice combinations
    public int[][] undoomDice() {
        // List to store all possible combinations of dice values
        List<List<Integer>> combinations = new ArrayList<>();

        // Generating all possible combinations of dice values
        for (int i = 1; i <= sides; i++) {
            for (int j = 1; j <= sides; j++) {
                List<Integer> combination = new ArrayList<>();
                combination.add(i);
                combination.add(j);
                combinations.add(combination);
            }
        }

        // Sorting combinations based on the sum of their values
        combinations.sort((a, b) -> (a.get(0) + a.get(1)) - (b.get(0) + b.get(1)));

        // Initializing the modified dice array
        int[][] modifiedDice = new int[2][sides];

        // Assigning values to the modified dice array based on sorting criteria
        for (int i = 0; i < sides; i++) {
            List<Integer> currentCombination = combinations.get(i);
            int valueA = currentCombination.get(0);
            int valueB = currentCombination.get(1);

            // Assigning values to the modified dice array based on condition
            if (valueA <= 4) {
                modifiedDice[0][i] = valueA;
                modifiedDice[1][i] = valueB;
            } else {
                modifiedDice[0][i] = valueB;
                modifiedDice[1][i] = valueA;
            }
        }
        return modifiedDice;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating an instance of Main class with 6 sides
        Main main = new Main(6);

        // Printing the modified dice combinations
        System.out.println("------------Part - 'B'-----------------");
        int[][] modifiedDice = main.undoomDice();
        System.out.println("Output - Generating Modified Dices:  ");
        System.out.println("New_Dice_A: " + Arrays.toString(modifiedDice[0]));
        System.out.println("New_Dice_B: " + Arrays.toString(modifiedDice[1]));
    }
}
