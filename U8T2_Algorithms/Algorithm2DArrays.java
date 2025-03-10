package U8T2_Algorithms;
import java.util.ArrayList;
import java.util.Arrays;

public class Algorithm2DArrays {

    public static int sumForRow(int[][] arr, int row) { 
        int count = 0;
        for (int i = 0; i < arr[0].length; i++) {
            count += arr[row][i];
        }
        return count;
    }

    public static int sumForColumn(int[][] arr, int col) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i][col];
        }
        return count;
    }

    public static int replaceEvensWithZero(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    arr[i][j] = 0;
                    count++;
                }
            }
        }
        return count;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < wordChart.length; i++) {
            for (int j = 0; i < wordChart[0].length; j++) {
                if (wordChart[i][j].length() == len) {
                    strings.add(wordChart[i][j]);
                }
            }
        }
        return strings;
    }

    public static double classAverage(Student[][] seatingChart) {
        int total = 0;
        for (Student[] row : seatingChart) {
            for (Student column : row) {
                total += column.getGrade();
            }
        }
        return (double) total / (seatingChart.length * seatingChart[0].length);
    }

    public static boolean consecutive(int[][] arr) {
        int rows = arr.length;
        int column = arr[0].length; 
    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column - 1; j++) { 
                if (arr[i][j] == arr[i][j + 1]) {
                    return true; 
                }
            }
        }
        for (int i = 0; i < rows - 1; i++) { 
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == arr[i + 1][j]) {
                    return true; 
                }
            }
        }
        return false; 
    }

    public static boolean magicSquare(int[][] arr) {
        int row = arr.length;
        int sum = 0;
        ArrayList<Integer> seen = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            sum += arr[0][i];
        }

        for (int i = 0; i < row; i++) {
            int rsum = 0;
            for (int j = 0; j < row; j++) {
                rsum += arr[i][j];
                if (seen.contains(arr[i][j])) {
                    return false; 
                }
                seen.add(arr[i][j]); 
            }
            if (rsum != sum) {
                return false; 
            }
        }
    
        for (int i = 0; i < row; i++) {
            int csum = 0;
            for (int j = 0; j < row; j++) {
                csum += arr[i][j];
            }
            if (csum != sum) {
                return false;
            }
        }

        int dsum1 = 0;
        for (int i = 0; i < row; i++) {
            dsum1 += arr[i][i];
        }
        if (dsum1 != sum) {
            return false; 
        }
    
        int dsum2 = 0;
        for (int i = 0; i < row; i++) {
            dsum2 += arr[i][row - 1 - i];
        }
        if (dsum2 != sum) {
            return false; 
        }
        return true;
    }
}
