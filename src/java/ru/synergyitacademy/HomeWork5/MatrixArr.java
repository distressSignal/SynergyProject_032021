package ru.synergyitacademy.HomeWork5;

class Matrix {
    //поля класса
    int n = 0, m = 0;
    private int array[][];

    Matrix(int[][] array) {
        this.array = array;
        this.n = array.length;
        this.m = array[0].length;
    }

    Matrix(Matrix matrix) {
        this.array = matrix.array;
        this.n = matrix.n;
        this.m = matrix.m;
    }

    Matrix() {
        this.n = 2;
        this.m = 2;
        this.array = new int[n][m];
    }

    public int getN() {

        return n;
    }

    public int getM() {

        return m;
    }


    public static Matrix sumMatrices(Matrix matrixOne, Matrix matrixTwo) {
        Matrix matrix = new Matrix();
        for (int i = 0; i < matrixOne.n; i++) {
            for (int j = 0; j < matrixOne.m; j++) {
                matrix.array[i][j] = matrixOne.array[i][j] + matrixTwo.array[i][j];
            }
        }
        return matrix;
    }

    public static Matrix differenceMatrices(Matrix matrixOne, Matrix matrixTwo) {
        Matrix matrix = new Matrix();
        for (int i = 0; i < matrixOne.n; i++) {
            for (int j = 0; j < matrixOne.m; j++) {
                matrix.array[i][j] = matrixOne.array[i][j] - matrixTwo.array[i][j];
            }
        }
        return matrix;
    }


    public static void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.n; i++) {
            System.out.println("");
            for (int j = 0; j < matrix.m; j++) {
                System.out.print(matrix.array[i][j] + "\t");
            }
        }
    }

    public static Matrix matrixMultiplication(Matrix matrix, int a) {
        for (int i = 0; i < matrix.n; i++) {
            for (int j = 0; j < matrix.m; j++) {
                matrix.array[i][j] *= a;
            }
        }
        return matrix;
    }


    public int getMatrixSize(Matrix matrix) {
        return matrix.array.length;
    }

    public static Matrix matrixMultiplicationToMatrix(Matrix matrixOne, Matrix matrixTwo) {
        Matrix matrix = new Matrix();
        for (int i = 0; i < matrixOne.m; i++) {
            for (int j = 0; j < matrixOne.n; j++) {
                matrix.array[i][j] = matrixOne.array[i][j] * matrixTwo.array[i][j];
            }
        }
        return matrix;
    }

    public static Matrix matrixSquare(Matrix matrix) {
        for (int i = 0; i < matrix.n; i++) {
            for (int j = 0; j < matrix.m; j++) {
                matrix.array[i][j] *= matrix.array[i][j];
            }
        }
        return matrix;
    }

    public static int opredelitel(Matrix matrix) {

        int a = matrix.array[0][0] * matrix.array[1][1];
        int b = matrix.array[1][0] * matrix.array[0][1];
        int result = a - b;
        return result;
    }

    public static void main(String[] args) {


    }