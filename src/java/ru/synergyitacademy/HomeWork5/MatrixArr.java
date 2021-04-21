package ru.synergyitacademy.HomeWork5;

class Matrix {
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
        Matrix matrix = new Matrix(matrixOne);
        for (int i = 0; i < matrixOne.n; i++) {
            for (int j = 0; j < matrixOne.m; j++) {
                matrix.array[i][j] += matrixTwo.array[i][j];
            }
        }
        return matrix;
    }

    public static Matrix differenceMatrices(Matrix matrixOne, Matrix matrixTwo) {
        Matrix matrix = new Matrix(matrixOne);
        for (int i = 0; i < matrixOne.n; i++) {
            for (int j = 0; j < matrixOne.m; j++) {
                matrix.array[i][j] -= matrixTwo.array[i][j];
            }
        }
        return matrix;
    }

    public static void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.array.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix.array.length; j++) {
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

    public static int getMatrixSize(Matrix matrix) {
//        return matrix.array.length;
        return matrix.array.length;
    }

    public static Matrix matrixMultiplicationToMatrix(Matrix matrixOne, Matrix matrixTwo) {
        Matrix matrix = new Matrix(matrixOne);
        for (int i = 0; i < getMatrixSize(matrix); i++) {
            for (int j = 0; j < getMatrixSize(matrix); j++) {
                matrix.array[i][j] *= matrixTwo.array[i][j];
            }
        }
        return matrix;
    }

    Matrix matrixSquare(Matrix matrix) {
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
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        for (int i = 0; i < matrix.array.length; i++) {
            for (int j = 0; j < matrix.array.length; j++) {
                matrix.array[i][j] = (int) (2*Math.random());
                matrix2.array[i][j] = (int) (4*Math.random());
            }
        }
        printMatrix(matrixMultiplicationToMatrix(matrix, matrix2));
        printMatrix(matrixMultiplication(matrix, 7));
        printMatrix(differenceMatrices(matrix, matrix2));
        printMatrix(sumMatrices(matrix, matrix2));
        printMatrix(matrix.matrixSquare(matrix));
        System.out.println(getMatrixSize(matrix));
    }
}