public class Main {

    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] a : arr) {
            if (a.length != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Строка: " + i + " Столбец: " + j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] strings = new String[][]{
                {"1", "2", "3"},
                {"0", "0", "0"}};

        try {
            System.out.println("Сумма элементов массива равна: " + sumArray(strings));
        } catch (MyArraySizeException e) {
            System.out.println("Некорректный размер массива!");
        } catch (MyArrayDataException e) {
            System.out.println("Не корректные данные! " + e.getMessage());
        }

        String[][] strings1 = new String[][]{
                {"1", "f", "2", "0"},
                {"0", "0", "0", "0"},
                {"1", "0", "0", "5"},
                {"0", "0", "0", "0"}};

        try {
            System.out.println("Сумма элементов массива равна: " + sumArray(strings1));
        } catch (MyArraySizeException e) {
            System.out.println("Некорректный размер массива!");
        } catch (MyArrayDataException e) {
            System.out.println("Не корректные данные! " + e.getMessage());
        }

        String[][] strings2 = new String[][]{
                {"1", "2", "3", "4"},
                {"0", "0", "0", "0"},
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"}};

        try {
            System.out.println("Сумма элементов массива равна: " + sumArray(strings2));
        } catch (MyArraySizeException e) {
            System.out.println("Некорректный размер массива!");
        } catch (MyArrayDataException e) {
            System.out.println("Не корректные данные! " + e.getMessage());
        }
    }
}
