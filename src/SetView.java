import java.util.Scanner;

public class SetView {

        public void setview (){
            Scanner sc = new Scanner(System.in);
            System.out.println("추가하실 메뉴를 선택해주세요 : ");
            System.out.println("1. 탄산음료");
            System.out.println("2. 감자튀김");
            System.out.println("3. 치즈볼");
            System.out.println("4. 치즈스틱");
            System.out.println("5. 양념감자");
            System.out.println("6. 소프트 아이스크림");
            System.out.println("9. 추가 종료");
            int c = sc.nextInt();
            sc.nextLine();

           do {

               switch (c) {

                   case 1:
                       Pay.price += 2000;
                       System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                       System.out.print("다른 메뉴를 추가하시겠습니까? : (Y/N) ");
                       c = sc.nextLine().toUpperCase().charAt(0);
                       break;
                   case 2:
                       Pay.price += 3000;
                       System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                       break;
                   case 3:
                       Pay.price += 3000;
                       System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                       break;
                   case 4:
                       Pay.price += 4000;
                       System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                       break;
                   case 5:
                       Pay.price += 4000;
                       System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                       break;
                   case 6:
                       Pay.price += 1000;
                       System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                       break;
                   case 9:
                       System.out.println("최종가격은 " + Pay.price + "원 입니다.");
                       break;
                   default:
                       System.out.println("알맞은 메뉴를 선택해주세요 : ");
                       break;

               }
           }while (c != 9);



        }







}
