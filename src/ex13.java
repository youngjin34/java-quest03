import java.util.Random;
import java.util.Scanner;

public class ex13 {
  public static void main(String[] args) {
    String[] monthsEnglish = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December" };

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int prevMonth = -1;

    while (true) {
      int curMonth;
      do {
        curMonth = random.nextInt(12);
      } while (curMonth == prevMonth);

      prevMonth = curMonth;

      while (true) {
        System.out.print((curMonth + 1) + "월: ");
        String input = scanner.nextLine();

        if (input.equals(monthsEnglish[curMonth])) {
          System.out.println("정답");
          break;
        } else {
          System.out.println("오답");
        }
      }

      System.out.print("다시 한 번? 1...yes / 0...no: ");
      int again = scanner.nextInt();
      scanner.nextLine();

      if (again == 0) {
        break;
      }
    }

  }
}
