public class FunWith2DArrays {
    public FunWith2DArrays(){}

    public static int totalElements(int[][] nums) {
        return nums.length * nums[0].length;
    }

    public static void fourCorners(String[][] strings) {
        System.out.println(strings[0][0]);
        System.out.println(strings[0][strings[0].length - 1]);
        System.out.println(strings[strings.length - 1][0]);
        System.out.println(strings[strings.length - 1][strings[0].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] strings) {
        String[] temp = strings[0];
        strings[0] = strings[strings.length - 1];
        strings[strings.length - 1] = temp;
    }

    public static double average(int[][] nums) {
        double sum = 0;
        int length = 0;

        for (int[] array :nums) {
            for (int element : array) {
                sum += element;
                length++;
            }
        }
        return sum / length;
    }

    public static int edgeSum(int[][] nums) {
        int sum = 0;
        for (int row = 1; row < nums.length - 1; row++) {
            sum += nums[row][0] + nums[row][nums[row].length - 1];
        }
        for (int element = 0; element < nums[0].length; element++) {
            sum += nums[0][element] + nums[nums.length - 1][element];
        }
        return sum;
    }

    public static int[] indexFound(String[][] strings, String string) {
        int[] index = {-1 , -1};
        for (int row = 0; row < strings.length; row ++) {
            for (int column = 0; column < strings[row].length; column++) {
                if (strings[row][column].equals(string)) {
                    index[0] = row; index[1] = column;
                    return index;
                }
            }
        }
        return index;
    }

    public static int[][] split(int[][] nums, int num1, int num2) {
        int[][] newNums = new int[num1 + 1][num2 + 1];
        if (num1 >= nums.length || num2 >= nums[0].length) {
            int[][] empty = new int [0][0];
            return empty;
        }
        for (int row = 0; row <= num1; row ++) {
            for (int column = 0; column <= num2; column++) {
                    newNums[row][column] = nums[row][column];
                }
            }
        return newNums;
    }

    public static int[][] invert(int[][] nums) {
        int[][] newNums = new int[nums[0].length][nums.length];
        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums[row].length; column++) {
                    newNums[row][column] = nums[column][row];
                }
            }
        return newNums;
    }
}
