class Runner {
    public static void main(String[] args) {
        /* String[][] seatingChart = {
            {"Abby", "Don", "George", "Kim"},
            {"Brian", "Elenor", "Harry", "Lenny"},
            {"Cathy", "Fred", "Jill", "Matt"}
        };

        seatingChart[1][2] = "Paul";

        String temp = seatingChart[2][3];
        seatingChart[2][3] = seatingChart[0][0];
        seatingChart[0][0] = temp;

        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;

        for (String[] strings : seatingChart) {
            for (String strings2 : strings) {
                System.out.print(strings2 + " ");
            }
            System.out.println();
        }

        System.out.println(seatingChart[0][2] + seatingChart[2][0]); 

        int[][] nums = new int[2][3];
        String[][] strings = new String[4][2];

        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[1][0] = 4;
        nums[1][1] = 5;
        nums[1][2] = 6;

        strings[0][0] = "a";
        strings[0][1] = "b";
        strings[1][0] = "c";
        strings[1][1] = "d";
        strings[2][0] = "e";
        strings[2][1] = "f";
        strings[3][0] = "g";
        strings[3][1] = "h";


        for (String[] string1 : strings) {
            for (String strings2 : string1) {
                System.out.print(strings2 + " ");
            }
            System.out.println();
        }

        for (int[] row : nums) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        } */
            int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
            System.out.println(FunWith2DArrays.totalElements(testArr1));
            int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
            System.out.println(FunWith2DArrays.totalElements(testArr2));
            int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
            System.out.println(FunWith2DArrays.totalElements(testArr3));
            int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
            System.out.println(FunWith2DArrays.totalElements(testArr4));
            int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
            System.out.println(FunWith2DArrays.totalElements(testArr5));
            int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
            System.out.println(FunWith2DArrays.totalElements(testArr6));
            int[][] testArr7 = {{4}, {7}, {8}, {2}};
            System.out.println(FunWith2DArrays.totalElements(testArr7));
            int[][] testArr8 = {{4}};
            System.out.println(FunWith2DArrays.totalElements(testArr8));
            int[][] testArr9 = {{}};
            System.out.println(FunWith2DArrays.totalElements(testArr9));
            
            System.out.println("-------TEST 1-------");
            String[][] words = {
                    {"hi", "bye", "stuff", "go"},
                    {"time", "up", "you", "good"},
                    {"map", "low", "bow", "mom"}
            };
            FunWith2DArrays.fourCorners(words);

            System.out.println("-------TEST 2-------");
            String[][] words2 = {
                    {"time", "up", "bye"},
                    {"hi", "hit", "up"},
                    {"map", "bam", "low"},
                    {"bow", "mom", "joy"}
            };
            FunWith2DArrays.fourCorners(words2);

            System.out.println("-------TEST 3-------");
            String[][] words3 = {{"phone", "mouse", "keyboard"}};
            FunWith2DArrays.fourCorners(words3);

            System.out.println("-------TEST 4-------");
            String[][] words4 = {
                    {"cat"},
                    {"dog"},
                    {"hamster"},
                    {"bird"}
            };
            FunWith2DArrays.fourCorners(words4);

            System.out.println("-------TEST 5-------");
            String[][] words5 = {{"time"}};
            FunWith2DArrays.fourCorners(words5);

            System.out.println("-------TEST 1-------");
String[][] w1 = {
        {"hi", "bye", "stuff", "go"},
        {"time", "up", "you", "good"},
        {"map", "low", "bow", "mom"}
};
System.out.println("--Original:");
for (String[] row : w1) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
System.out.println("--Modified:");
FunWith2DArrays.swapFrontAndBackRows(w1);
for (String[] row : w1) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
System.out.println("-------TEST 2-------");
String[][] w2 = {
        {"time", "up", "bye"},
        {"hi", "hit", "up"},
        {"map", "bam", "low"},
        {"bow", "mom", "joy"}
};
System.out.println("--Original:");
for (String[] row : w2) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
System.out.println("--Modified:");
FunWith2DArrays.swapFrontAndBackRows(w2);
for (String[] row : w2) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}

System.out.println("-------TEST 3-------");
String[][] w3 = {{"phone", "mouse", "keyboard"}};
System.out.println("--Original:");
for (String[] row : w3) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
System.out.println("--Modified:");
FunWith2DArrays.swapFrontAndBackRows(w3);
for (String[] row : w3) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}

System.out.println("-------TEST 4-------");
String[][] w4 = {
        {"cat"},
        {"dog"},
        {"hamster"},
        {"bird"}
};
System.out.println("--Original:");
for (String[] row : w4) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
System.out.println("--Modified:");
FunWith2DArrays.swapFrontAndBackRows(w4);
for (String[] row : w4) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}

System.out.println("-------TEST 5-------");
String[][] w5 = {{"time"}};
System.out.println("--Original:");
for (String[] row : w5) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
System.out.println("--Modified:");
FunWith2DArrays.swapFrontAndBackRows(w5);
for (String[] row : w5) {
    for (String element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}


        
    }
}