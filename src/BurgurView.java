import java.util.Scanner;

public class BurgurView {

    public void burgurview() {
        Controller ct = new Controller();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 치즈버거");
        System.out.println("2. 불고기버거");
        System.out.println("3. 새우버거");
        System.out.println("4. 핫크리스피버거");
        System.out.println("5. 한우버거");
        System.out.println("햄버거를 선택해주세요 : ");
        int c = sc.nextInt();
        sc.nextLine();

        switch (c){

            case 1 : Pay.price += 5000;
            System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
            ct.SetQuestion();break;
            case 2 : Pay.price += 6000;
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                ct.SetQuestion();break;
            case 3 : Pay.price += 7000;
            System.out.println("현재 가격은 " + Pay.price + "원 입니다.");ct.SetQuestion();break;
            case 4 : Pay.price += 8000;
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");ct.SetQuestion(); break;
            case 5 : Pay.price += 9000;
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");ct.SetQuestion();break;
            default:
                System.out.println("알맞은 메뉴를 선택해주세요 : "); break;

        }





    }





}
