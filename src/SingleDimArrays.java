import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class SingleDimArrays {

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static int[] evenNumbers = new int[10];
    public static int[] oddNumbers = new int[50];
    public static int[] randomArr = new int[15];
    public static int[] randomArr4 = new int[20];
    public static int[] randomArr51 = new int[5];
    public static int[] randomArr52 = new int[5];
    public static int[] randomArr6 = new int[4];
    public static int[] randomArr7 = new int[12];
    public static int[] randomArr81 = new int[10];
    public static int[] randomArr82 = new int[10];
    public static double[] randomArr83 = new double[10];

    public static void main(String[] args) {

        //Задание 1
//        System.out.println(Arrays.toString(addEvenNumbers(evenNumbers)));
//        showArrayInColumn(evenNumbers);

        //Задание 2
//        int[] array2 = oddNumbers;
//        System.out.println(Arrays.toString(addOddNumbers(oddNumbers)));
//        System.out.println(Arrays.toString(bubbleSortDesc(array2)));

        //Задание 3
//        int[] array3 = randomArr;
//        System.out.println(Arrays.toString(createRandomArray(array3, 99)));
//        printEvenQuantity(array3);

        //Задание 4
//        int[] array4 = randomArr4;
//        System.out.println(Arrays.toString(createRandomArray(array4, 20)));
//        changeOddIndexNumbers(array4);

        //Задание 5
//        int[] array51 = createRandomArray(randomArr51, 15);
//        int[] array52 = createRandomArray(randomArr52, 15);
//        System.out.println("Массив 1:\n" + Arrays.toString(array51));
//        System.out.println("Массив 2:\n" + Arrays.toString(array52));
//        compareTwoArrays(array51, array52);

        //Задание 6
//        int[] array6 = createRandomArray(randomArr6, 10);
//        System.out.println(Arrays.toString(array6));
//        identifyIncreasing(array6);
//        //Проверка, что метод работает для отсортированного массива
//        Arrays.sort(array6);
//        System.out.println(Arrays.toString(array6));
//        identifyIncreasing(array6);

        //Задание 7
//        int[] array7 = createRandomArray(randomArr7, 15);
//        System.out.println(Arrays.toString(array7));
//        System.out.println("Максимальный элемент массива: " + findMaxNumber(array7));
//        findMaxNumberLastIndex(array7);

        //Задание 8
//        int[] array81 = createRandomArray(randomArr81, 9);
//        int[] array82 = createRandomArray(randomArr82, 9);
//        double[] array83 = createThirdArray(array81, array82, randomArr83);
//        System.out.println("Массив 1:\n" + Arrays.toString(array81));
//        System.out.println("Массив 2:\n" + Arrays.toString(array82));
//        System.out.println("Массив 3:\n" + Arrays.toString(array83));
//        printIntNumbersInArray(array83);

        //Задание 9
//        int[] array9 = createArrayFromConsole(scanner, random);
//        System.out.println(Arrays.toString(array9));
//        compareTwoArraysSides(array9);

        //Задание 10
//        int[] firstArray = createFirstArray(scanner, random);
//        System.out.println("Первый массив:\n" + Arrays.toString(firstArray));
//        int[] secondArray = createSecondArray(firstArray);
//        if (secondArray.length == 0) {
//            System.out.println("Второй массив пустой, т.к. в первом массиве нет четных чисел.");
//        } else {
//            System.out.println("Второй массив:\n" + Arrays.toString(secondArray));
//        }

    }

    // Задание 1
    public static int[] addEvenNumbers(int[] array){
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num += 2;
            array[i] = num;
        }
        return array;
    }

    public static void showArrayInColumn(int[] array) {
        for (int el : array) {
            System.out.println(el);
        }
    }

    // Задание 2
    public static int[] addOddNumbers(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
           if (num % 2 == 0){
               num += 1;
           }
           array[i] = num;
           num += 1;
        }
        return array;
    }

    public static int[] bubbleSortDesc(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    //Задание 3
    public static int[] createRandomArray(int[] array, int randomBound){
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(randomBound);
        }
        return array;
    }

    public static void printEvenQuantity(int[] array){
        int qty = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                qty += 1;
            }
        }
        System.out.println("Количество четных чисел в массиве: " + qty);
    }

    //Задание 4
    public static void changeOddIndexNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //Задание 5
    public static void compareTwoArrays(int[] array1, int[] array2) {
        int average1 = findArrayAverage(array1);
        int average2 = findArrayAverage(array2);

        if (average1 == average2){
            System.out.println("Среднее арифметическое массивов равно.");
        } else if (average1 > average2) {
            System.out.println("Среднее арифметическое первого массива больше второго.");
        } else {
            System.out.println("Среднее арифметическое второго массива больше первого.");
        }
    }

    public static int findArrayAverage(int[] array) {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            amount += array[i];
        }
        amount /= array.length;
        return amount;
    }

    //Задание 6
    public static void identifyIncreasing(int[] array) {
        boolean increasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                increasing = false;
                break;
            }
        }
        if (increasing) {
            System.out.println("Данный массив имеет строго возврастающую последовательность.");
        } else {
            System.out.println("Данный массив НЕ имеет строго возврастающую последовательность.");
        }
    }

    //Задание 7
    public static int findMaxNumber(int[] array){
        int maxNum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] && maxNum < array[i + 1]) {
                maxNum = array[i + 1];
            } else if (maxNum < array[i]){ // Для нулевого индекса
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static void findMaxNumberLastIndex(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findMaxNumber(array)){
                index = i;
            }
        }
        System.out.println("Максимальный элемент массива нахожится под индексом: " + index);
    }

    //Задание 8
    public static double[] createThirdArray(int[] array1,int[] array2, double[] array3) {
        for (int i = 0; i < array1.length; i++) {
            array3[i] = (double) array1[i] / (double) array2[i];
        }
        return array3;
    }

    public static void printIntNumbersInArray(double[] array) {
        int qty = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 1 == 0 && array[i] != 0) {
                qty += 1;
            }
        }
        System.out.println("Количество целых чисел в массиве равно: " + qty);
    }

    //Задание 9
    public static int[] createArrayFromConsole(Scanner scanner, Random random) {
        int dimension = 0;
        while (dimension <= 0) {
            System.out.println("Введите размерность массива: ");
            dimension = scanner.nextInt();
            if (dimension <= 0){
                System.out.println("Вы ввели неверное значение! " +
                                    "Введенное значение должно быть целое и положительное.");
            } else {
                break;
            }
        }
        int[] array = new int[dimension];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        return array;
    }

    public static void compareTwoArraysSides(int[] array) {
        int leftSide = 0;
        int rightSide = 0;
        int breakpoint = (array.length - 1) / 2;

        for (int i = 0; i < array.length; i++) {
            if (i <= breakpoint) {
                leftSide += array[i];
            } else {
                rightSide += array[i];
            }
        }
        if (leftSide > rightSide) {
            System.out.println("Левая половина массива больше правой.");
        } else  if (rightSide > leftSide) {
            System.out.println("Правая половина массива больше левой.");
        } else {
            System.out.println("Обе половины массива равны");
        }
    }

    //Задание 10
    public static int[] createFirstArray(Scanner scanner, Random random) {
        int n = 0;
        while (n <= 3) {
            System.out.println("Введите число n:");
            n = scanner.nextInt();
            if (n <= 3) {
                System.out.println("Вы ввели неверное значение! " +
                        "Введенное значение должно быть целое и больше 3.");
            } else {
                break;
            }
        }
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
        }
        return array;
    }

    public static int[] createSecondArray(int[] array) {
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                n += 1;
            }
        }
        int[] secondArray = new int[n];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                secondArray[j] = array[i];
                j++;
            }
        }
        return secondArray;
    }
}