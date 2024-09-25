import java.util.Scanner;

public class ex12 {
  public static void main(String[] args) {
    String[] daysKorean = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
    String[] daysEnglish = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };

    Scanner scanner = new Scanner(System.in);
    int random = (int) (Math.random() * 7) + 1;

    int prevDay = -1;

    while (true) {
      int curDay;
      do {
        curDay = random;
      } while (curDay == prevDay);

      prevDay = curDay;

      System.out.print("요일 명을 소문자로 입력하세요\n" + daysKorean[curDay] + ": ");
      String input = scanner.nextLine().toLowerCase();

      if (input.equals(daysEnglish[curDay])) {
        System.out.println("정답");
      } else {
        System.out.println("오답");
        System.out.println("어떻게 할까요? 1...재입력 / 0...정답 보기: ");
        int choice = scanner.nextInt();

        if (choice == 0) {
          System.out.println(daysKorean[curDay] + "은 " + daysEnglish[curDay] + "입니다.");
          break;
        }
      }

      System.out.println("다시 한 번? 1...yes/0...no: ");
      int again = scanner.nextInt();
      scanner.nextLine();

      if (again == 0) {
        break;
      }

    }
  }
}
