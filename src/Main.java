import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("Task 1. printThreeWords:");
        printThreeWords();
        System.out.println();

        System.out.println("Task 2. checkSumSign:");
        checkSumSign();
        System.out.println();

        System.out.println("Task 3. printColor:");
        printColor();
        System.out.println();

        System.out.println("Task 4. compareNumbers:");
        compareNumbers();
        System.out.println();

        System.out.println("Task 5. checkSum:");
        boolean b = checkSum(10, 10);
        System.out.println(b);
        System.out.println();

        System.out.println("Task 6. printSign:");
        printSign(-1);
        System.out.println();

        System.out.println("Task 7. isNegative:");
        System.out.println(isNegative(-10));
        System.out.println();

        System.out.println("Task 8. printString:");
        printString("Hello", 5);
        System.out.println();

        System.out.println("Task 9. isLeapYear:");
        System.out.println(isLeapYear(1900));
        System.out.println();

        System.out.println("Task 10. changeArray:");
        int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArray(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        System.out.println("Task 11. createArray:");
        int[] arr2 = createArray();
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        System.out.println("Task 12. multiplyArray:");
        int[] arr3 = multiplyArray();
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        System.out.println("Task 13. createDiagonalArray:");
        int[][] twoArr = createDiagonalArray();
        System.out.println(Arrays.deepToString(twoArr));
        System.out.println();

        System.out.println("Task 14. createFilledArray:");
        int[] newArray = createFilledArray(3, 15);
        System.out.println(Arrays.toString(newArray));


    }


    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        int a = 1;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() { //когда используется конструкция if then else
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }

    static void compareNumbers() {
        int a = 10000;
        int b = 1233;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    static boolean checkSum(int x, int y) {
        return x + y > 10 && x + y <= 20;
    }

    static void printSign(int x) {
        if (x >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }

    }

    static boolean isNegative(int x) {
        return x < 0;
    }

    static void printString(String string, int count) {
        for (int i = 0; i < count; ++i) {
            System.out.println(string);
        }
    }

    static boolean isLeapYear(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            return false;
        } else {
            return true;
        }
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }

    }

    static int[] createArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    static int[] multiplyArray() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    static int[][] createDiagonalArray() {
        int[][] twoArr = new int[4][4];
        for (int i = 0; i < twoArr.length; i++) {
            for (int j = 0; j < twoArr.length; j++) {
                if (i == j || twoArr.length - i - 1 == j) {
                    twoArr[i][j] = 1;
                }
            }
        }
        return twoArr;
    }

    static int[] createFilledArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}