package test3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
    public static void main(String[] args) {

        while (true) {
            boolean test = false;

            TreeSet<String> words = new TreeSet<>();
            words.add("gthdsq");

            Scanner scanner = new Scanner(System.in);
            String read = scanner.nextLine();

            String[] arrScanner = read.split(" ");
            {
                if (arrScanner[0].equalsIgnoreCase("List")) {
                    for (String word : words) {
                        System.out.println(word);
                    }
                } else if (arrScanner[0].equalsIgnoreCase("ADD")) {
                    char[] at = arrScanner[1].toCharArray();
                    for (char c : at) {
                        if (Character.toString(c).equals("@")) {
                            test = true;
                        }
                    }
                    if (test) {

                        words.add(arrScanner[1].toString());
                        for (String word : words) {
                            System.out.println(word);

                        }

                    }


                }
            }
        }
    }
}
