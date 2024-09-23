import java.util.Arrays;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] string = new String[3];
        System.out.println("3개의 문자열을 입력하세요");
        for (int i = 0; i < string.length; i++) {
            string[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(string));

    }
}
