import java.util.Locale;
import java.util.Scanner;


public class Controller {
    SetView sv = new SetView();

    Scanner sc = new Scanner(System.in);

    Pay pay = new Pay();
    MemberDTO[] member = new MemberDTO[10];

    {
        member[0] = new MemberDTO("이후영", "01032283158");
        member[1] = new MemberDTO("강정희", "01011112222");
        member[2] = new MemberDTO("이수민", "01033334444");
        member[3] = new MemberDTO();
        member[4] = new MemberDTO();
        member[5] = new MemberDTO();
        member[6] = new MemberDTO();
        member[7] = new MemberDTO();
        member[8] = new MemberDTO();
        member[9] = new MemberDTO();


    }

    int index = 3;

    public void SetQuestion() {


        System.out.println("세트를 추가하시겠습니까? : (Y/N)");
        char c = sc.nextLine().toUpperCase().charAt(0);

        switch (c) {

            case 'Y':
                Pay.price -= 2000;
                sv.setview();
                break;
            case 'N':
                System.out.println("단품으로 결제 진행하겠습니다.");
                SigninView();
                break;


            default:
                System.out.println("y와 n 중에서 입력해주세요:");

        }


    }

    public void MemberCheck() {


        System.out.print("회원 이름을 입력해주세요 : ");
        String SearchName = sc.nextLine();

        for (MemberDTO marr : member) {

            if (marr.getName().equals(SearchName)) {

                System.out.println(marr.getName() + "님 회원 인증에 성공하였습니다 ");
                System.out.println("회원 랜덤쿠폰 적용후 최종결제 진행하겠습니다.");
                System.out.println(marr.getName() + " 님 의 최종결제금액은 " + pay.memberPrice() + "원 입니다.");
                Pay.price = 0;
                break;


            } else {
                char c = sc.nextLine().toUpperCase().charAt(0);
                System.out.println("가입된 회원이 아닙니다. 가입하시겠습니까? : Y/N ");
                switch (c) {
                    case 'Y':
                        SigninMember();
                        break;
                    case 'N':
                        System.out.println("비회원 결제를 진행합니다. ");
                        System.out.println("고객님의 최종 결제 금액은 : " + pay.normalPrice() + "원 입니다.");
                        Pay.price = 0;
                        break;


                }


            }


        }

    }

    public void SigninMember() {


        System.out.println("회원가입을 시작합니다.");
        System.out.println("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("전화번호를 입력해주세요 : ");
        String phone = sc.nextLine();

        this.member[index] =  member[3] = new MemberDTO();
        System.out.println(member[index].toString());
        index++;
        System.out.println("회원 가입이 완료되었습니다.");


    }

    public void SigninView() {
        Scanner sc = new Scanner(System.in);

        System.out.println("회원 랜덤쿠폰(5~10%)이벤트중입니다. 회원이십니까? : (Y/N) ");
        char c = sc.nextLine().toUpperCase().charAt(0);


        switch (c) {

            case 'Y':
                MemberCheck();
                break;

            case 'N':
                System.out.println("가입 하시겠습니까?(Y), 비회원 결제를 진행하시겠습니까? (N) ");
                char s = sc.nextLine().toUpperCase().charAt(0);
                switch (s) {
                    case 'Y':
                        SigninMember();
                        MemberCheck();
                }


                Pay.price = 0;
                break;


        }


    }


}


