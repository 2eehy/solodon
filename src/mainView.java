import java.util.Scanner;

public class mainView {

    public void mainMenu() {
        BurgurView bv = new BurgurView();

        int c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("======롯데리아에 오신것을 환영합니다=======");
            System.out.println(" 1. 햄버거 선택");
            System.out.println(" 9. 프로그램 종료");
            System.out.print("실행하실 메뉴 번호를 입력하세요 : ");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    bv.burgurview();
                    break;

                case 9:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("알맞은 숫자가 아닙니다, 다시 입력해주세요");
            }

        } while (c != 9);

    }


}
