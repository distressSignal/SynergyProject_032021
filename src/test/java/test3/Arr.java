package test3;

public class Arr {
    public static void main(String[] args) {
        int[][] studentsMarks = {
                {4, 5, 1, 2, 4},
                {3, 4, 2, 4, 5, 2, 2, 3},
                {2, 3, 4, 5},
                {3, 5, 3, 2, 2, 2, 3}
        };

        for (int i = 0; i < studentsMarks.length; i++) {
            System.out.println("Class " + i +
                    " (" + studentsMarks[i].length + "" + " students:");
            for (int j = 0; j < studentsMarks[i].length; j++) {
                System.out.println("\t" + studentsMarks[i][j]);

            }

        }
    }
}
