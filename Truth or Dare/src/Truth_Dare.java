import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Truth_Dare {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        System.out.println("'TRUTH' OR 'DARE'?\n********************************");
        System.out.println("Type 't' or 'd'");
        char answer = scanner.next().charAt(0);

        switch (answer){
            case 't'-> System.out.println(Truth());
            case 'd'-> System.out.println(Dare());
        }
        System.out.println("\nType 'r' to run again 'q' to quit");
        char c = scanner.next().charAt(0);
        if (c == 'r'){main(null);}
    }

    static String Truth() throws IOException {
        final RandomAccessFile truth = new RandomAccessFile("Truths.txt", "r");
        final long randomLocation = (long) (Math.random() * truth.length());
        truth.seek(randomLocation);
        truth.readLine();
        String randomLine = truth.readLine();
        truth.close();
        return randomLine;
    }

    static String Dare() throws IOException {
        final RandomAccessFile truth = new RandomAccessFile("Dares.txt", "r");
        final long randomLocation = (long) (Math.random() * truth.length());
        truth.seek(randomLocation);
        truth.readLine();
        String randomLine = truth.readLine();
        truth.close();
        return randomLine;
    }

}
