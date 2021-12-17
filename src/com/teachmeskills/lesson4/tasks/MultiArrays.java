package com.teachmeskills.lesson4.tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiArrays {

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[][] matrix = createMatrix(random, scanner);
//        printMatrix(matrix);

        //Задание 1
//        printMainDiagonalEvenElementsAmount(matrix);

        //Задание 2
//        printOddElementsUnderMainDiagonal(matrix);

        //Задание 3
//        compareTwoDiagonalsProducts(matrix);

        //Крестики-нолики
        String[][] gameField = createGameField();
        printGameField(gameField);
        playGame(scanner, gameField);

    }

    public static int[][] createMatrix(Random random, Scanner scanner) {
        System.out.println("Введите размерность квадратной матрицы:");
        int x = scanner.nextInt();
        while (x <= 0){
            System.out.println("Размерность квадратной матрицы должна быть целым положительным числом! Введите размерность квадратной матрицы:");
            x = scanner.nextInt();
        }
        int [][] matrix = new int[x][x];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 1
    public static void printMainDiagonalEvenElementsAmount(int[][] matrix) {
        int amount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i && matrix[i][j] % 2 == 0 && matrix[i][j] != 0) {
                    amount += matrix[i][j];
                }
            }
        }
        if (amount == 0) {
            System.out.println("На главной диагонали нет четных чисел.");
        } else {
            System.out.println("Сумма четных элементов на главной диагонали равна: " + amount);
        }
    }

    //Задание 2
    public static void printOddElementsUnderMainDiagonal(int[][] matrix) {
        System.out.println("Нечетные элементы под главной диагональю матрицы (включительно):");
        boolean check = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= i && matrix[i][j] % 2 != 0 && matrix[i][j] != 0){
                    System.out.print(matrix[i][j] + " ");
                    check = true;
                }
            }
        }
        if (!check) {
            System.out.println("Нечетные элементы под главной диагональю матрицы (включительно) отсутствуют.");
        }
    }

    //Задание 3
    public static void compareTwoDiagonalsProducts(int[][] matrix) {
        int mainDiagonalProduct = 1;
        int sideDiagonalProduct = 1;

        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalProduct *= matrix[i][i];
        }

        for (int i = 0; i < matrix.length; i++) {
            sideDiagonalProduct *= matrix[i][(matrix.length - 1) - i];
        }

        if (mainDiagonalProduct > sideDiagonalProduct) {
            System.out.println("Произведение элементов главной диагонали " + mainDiagonalProduct + " больше произведения элементов побочной диагонали " + sideDiagonalProduct);
        } else if (sideDiagonalProduct > mainDiagonalProduct) {
            System.out.println("Произведение элементов побочной диагонали " + sideDiagonalProduct + " больше произведения элементов главной диагонали " + mainDiagonalProduct);
        } else {
            System.out.println("Произведение элементов обеих диагоналей равны: " + mainDiagonalProduct + " и " + sideDiagonalProduct);
        }
    }

    //Крестики-нолики
    public static void playGame(Scanner scanner, String[][] gameField) {
        int x;
        int y;
        String cross = " X ";
        String zero = " 0 ";
        int n = 1;

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (n % 2 != 0) {
                    System.out.println("Игрок 1, введите координаты крестика (от 1 до 3):");
                    System.out.println("по горизонтали:");
                    x = scanner.nextInt();

                    while (x <= 0 || x > 3) {
                        System.out.println("Значение должно быть от 1 до 3!");
                        System.out.println("Игрок 1, введите координаты крестика (от 1 до 3):");
                        System.out.println("по горизонтали:");
                        x = scanner.nextInt();
                    }

                    System.out.println("по вертикали:");
                    y = scanner.nextInt();

                    while (y <= 0 || y > 3) {
                        System.out.println("Значение должно быть от 1 до 3!");
                        System.out.println("Игрок 1, введите координаты крестика (от 1 до 3):");
                        System.out.println("по вертикали:");
                        y = scanner.nextInt();
                    }

                    while (gameField[x - 1][y - 1] == cross || gameField[x - 1][y - 1] == zero){
                        System.out.println("По этим координатам уже есть крестик или нолик, попробуйте снова!");
                        printGameField(gameField);
                        System.out.println("Игрок 1, введите координаты крестика (от 1 до 3):");
                        System.out.println("по горизонтали:");
                        x = scanner.nextInt();
                        System.out.println("по вертикали:");
                        y = scanner.nextInt();
                    }
                    gameField[x - 1][y - 1] = cross;


                    System.out.println("Игровое поле:\n");
                    printGameField(gameField);
                    n++;
                } else if (n % 2 == 0) {
                    System.out.println("Игрок 2, введите координаты нолика (от 1 до 3):");
                    System.out.println("по горизонтали:");
                    x = scanner.nextInt();

                    while (x <= 0 || x > 3) {
                        System.out.println("Значение должно быть от 1 до 3!");
                        System.out.println("Игрок 2, введите координаты крестика (от 1 до 3):");
                        System.out.println("по горизонтали:");
                        x = scanner.nextInt();
                    }

                    System.out.println("по вертикали:");
                    y = scanner.nextInt();

                    while (y <= 0 || y > 3) {
                        System.out.println("Значение должно быть от 1 до 3!");
                        System.out.println("Игрок 1, введите координаты крестика (от 1 до 3):");
                        System.out.println("по вертикали:");
                        y = scanner.nextInt();
                    }

                    while (gameField[x - 1][y - 1] == cross || gameField[x - 1][y - 1] == zero) {
                        System.out.println("По этим координатам уже есть крестик или нолик, попробуйте снова!");
                        printGameField(gameField);
                        System.out.println("Игрок 2, введите координаты нолика (от 1 до 3):");
                        System.out.println("по горизонтали:");
                        x = scanner.nextInt();
                        System.out.println("по вертикали:");
                        y = scanner.nextInt();
                    }
                    gameField[x - 1][y - 1] = zero;

                    System.out.println("Игровое поле:\n" );
                    printGameField(gameField);
                    n++;
                }
                if (checkWinner(gameField, cross, zero)) {
                    return;
                }
            }
        }
    }

    public static String[][] createGameField() {
        String[][] gameField = new String[3][3];
        for (int i = 0; i < gameField.length; i++) {
            Arrays.fill(gameField[i], " - ");
        }
        return gameField;
    }

    public static void printGameField(String[][] gameField) {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                System.out.print(gameField[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(String[][] gameField, String cross, String zero) {
        boolean isOver = false;
        int crossQty = 0;
        int zeroQty = 0;
        int elementsQty = 0;

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j] == cross) {
                    crossQty += 1;
                } else if (gameField[i][j] == zero) {
                    zeroQty += 1;
                }
            }
            if (crossQty == 3) {
                System.out.println("Игрок 1 победил!");
                isOver = true;
                break;
            } else  if (zeroQty == 3) {
                System.out.println("Игрок 2 победил!");
                isOver = true;
                break;
            } else {
                crossQty = 0;
                zeroQty = 0;
            }
        }

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[j][i] == cross) {
                    crossQty += 1;
                } else if (gameField[j][i] == zero) {
                    zeroQty += 1;
                }
            }
            if (crossQty == 3) {
                System.out.println("Игрок 1 победил!");
                isOver = true;
                break;
            } else  if (zeroQty == 3) {
                System.out.println("Игрок 2 победил!");
                isOver = true;
                break;
            } else {
                crossQty = 0;
                zeroQty = 0;
            }
        }

        for (int i = 0; i < gameField.length; i++) {
            if (gameField[i][i] == cross) {
                crossQty += 1;
            } else if (gameField[i][i] == zero) {
                zeroQty += 1;
            }
            if (i == gameField.length - 1 && crossQty == gameField.length) {
                System.out.println("Игрок 1 победил!");
                isOver = true;
                break;
            } else if (i == gameField.length - 1 && zeroQty == gameField.length) {
                System.out.println("Игрок 2 победил!");
                isOver = true;
                break;
            } else if (i == gameField.length - 1 && zeroQty != gameField.length && crossQty != gameField.length) {
                crossQty = 0;
                zeroQty = 0;
            }
        }

        for (int i = 0; i < gameField.length; i++) {
            if (gameField[i][(gameField.length - 1) - i] == cross) {
                crossQty += 1;
            } else if (gameField[i][(gameField.length - 1) - i] == zero) {
                zeroQty += 1;
            }
            if (i == gameField.length - 1 && crossQty == gameField.length) {
                System.out.println("Игрок 1 победил!");
                isOver = true;
                break;
            } else if (i == gameField.length - 1 && zeroQty == gameField.length) {
                System.out.println("Игрок 2 победил!");
                isOver = true;
                break;
            } else if (i == gameField.length - 1 && zeroQty != gameField.length && crossQty != gameField.length) {
                crossQty = 0;
                zeroQty = 0;
            }
        }

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j] == cross || gameField[i][j] == zero) {
                    elementsQty += 1;
                }
            }
            if (elementsQty == 9 && crossQty == 0 && zeroQty == 0) {
                System.out.println("Победила дружба :)");
            }
        }
        return isOver;
    }
}
