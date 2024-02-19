import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            FileWriter fileWriter = new FileWriter("file.txt");

            ArrayList<String> words = new ArrayList<>(Arrays.asList(
                    "A a", "\nB b", "\nS s", "\nD d", "\nE e", "\nF f",
                    "\nG g", "\nH h", "\nI i", "\nJ j", "\nK k", "\nL l",
                    "\nM m", "\nN n", "\nO o", "\nP p", "\nQ q", "\nR r",
                    "\nS s", "\nT t", "\nU u", "\nV v", "\nW w", "\nX x", "\nY y", "\nZ z", "\n0",
                    "\n1", "\n2", "\n3", "\n4", "\n5", "\n6", "\n7", "\n8", "\n9"));

            fileWriter.write(String.valueOf(words));

            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("file.txt");
            Scanner scanner = new Scanner(fileReader);


            while (scanner.hasNextLine()) {
                for (int i = 1; i <= 36; i++) {
                    System.out.println(i + ": " + scanner.nextLine());

                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}