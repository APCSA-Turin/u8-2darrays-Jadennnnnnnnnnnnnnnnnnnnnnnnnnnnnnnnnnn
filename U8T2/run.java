public class run {
    public static void main(String[] args) {
        System.out.println("PROBLEM 1:");
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        System.out.println("---------");


        for (int[] array : nums) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
        for (int row = 0; row < nums.length; row ++) {
            for (int column = 0; column < nums[row].length; column++) {
                System.out.print(nums[row][column] + " ");
            }
            System.out.println();
        }

        for (int column = 0; column < nums[0].length; column++)  {
            for (int row = 0; row < nums.length; row ++) {
                System.out.print(nums[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] animals = {
                {"anteater", "bird"},
                {"camel", "dog"},
                {"elephant", "giraffe"},
                {"hyena", "jackal"}
        };

        for (int row = 0; row < animals.length; row++) {
            for (int column = 0; column < animals[row].length; column++) {
                animals[row][column] += "s";
            }
        }

        for (int column = 0; column < animals[0].length; column++) {
            System.out.print("|");
            for (int row = 0; row < animals.length; row++) {
                System.out.print(animals[row][column] + "|");
            }
            System.out.println();
        }
    }
}