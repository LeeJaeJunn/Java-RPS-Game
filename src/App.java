import java.util.Scanner;
import java.util.Random;

class rpsGame {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();
    String[] hands = {"가위", "바위", "보"};
    int retry; // 한번 더?

    do {
      int com = rand.nextInt(3);

      int user;
      do {
        System.out.print("가위바위보 게임!!!   ");
        for (int i = 0; i < 3; i++)
          System.out.printf("(%d)%s", i, hands[i]);
        System.out.print(" : ");
        user = stdIn.nextInt();
      } while (user < 0 || user > 2);

      System.out.println("computer : " + hands[com] + "user : " + hands[user]);

      int judge = (user - com + 3) % 3;
      switch (judge) {
        case 0: System.out.println("비겼습니다.");  break;
        case 1: System.out.println("당신이 이겼습니다!!!");  break;
        case 2: System.out.println("당신이 졌습니다...");  break;
      }
      do {
        System.out.print("한번 더 하시겠습니까? (0)아니요 (1)예 : ");
        retry = stdIn.nextInt();
      } while (retry != 0 && retry != 1);
    } while (retry == 1);
  }
}