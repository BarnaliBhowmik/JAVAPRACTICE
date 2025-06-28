import java.util.Scanner;
import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        sc.close();
    }
}
