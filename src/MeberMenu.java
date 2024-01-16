import java.lang.reflect.Member;
import java.util.List;
import java.util.Scanner;

public class MeberMenu {
    private MeberSever meberSever = new MeberSever();
    Scanner sc =  new Scanner(System.in);
    public void mainMenu(){

        mainMenu:
        while (true){
            System.out.println("=========회원관리 프로그램 ==========");
            System.out.println("1. 회원 정보 저장 ");
            System.out.println("2. 회원 정보 조회 ");
            System.out.println("3. 회원 정보 수정 ");
            System.out.println("4. 회원 정보 삭제 ");
            System.out.println("5. 종료합니다 ");

            System.out.print("선택하세요 : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1 :
                    saveMember();
                    break;
                case 2 :
                    viewMember();
                    break;
                case 3 :
                    updateMember();
                    break;
                case 4 :
                   deleteMember();
                    break;
                case 5 :
                    System.out.println("프로그램을 종료합니다 ");
                    break mainMenu;
                default:
                    System.out.println("없는 선택지 입니다. 다시선택해주세요 ");
                    break;
            }
        }
    }

    public void saveMember(){
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("휴대폰 번호 : ");
        String phone = sc.nextLine();

        MeberSever.addList(new MeberDTO(name, age, phone));
    }
    public void viewMember(){
        System.out.println("======= 회원 정보 조회 ========");
        List<MeberDTO> meberList = meberSever.MemberInquiry();

        if(!meberList.isEmpty()){
            for (MeberDTO meber : meberList){
                System.out.println(meber);
            }
        } else{
            System.out.println("목록이 존재하지 않습니다. ");
        }
    }

    public void updateMember(){
        System.out.println("====== 회원 정보 수정 ========");
        System.out.print("수정할 회원의 이름 :");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.print("수정할 회원의 나이 : ");
        int uqdateAge = sc.nextInt();
        System.out.print("수정할 회원의 핸드폰번호 : ");
        String uqdatePphone = sc.nextLine();

        MeberDTO uqdatemeber = new MeberDTO(name, uqdateAge, uqdatePphone);

        if (meberSever.uqdateMeber(uqdatemeber)){
            System.out.println("수정되었습니다. ");
        } else {
            System.out.println("수정하지 못했습니다.");
        }
    }

    public void deleteMember(){
        System.out.println("==== 곡 삭제 ====");
        System.out.println("삭제할 이름의 name : ");
        if (meberSever.removerMeber(sc.nextLine())){
            System.out.println(" 삭제 되었습니다.");
        } else {
            System.out.println(" 삭제되지 않았습니다. ");
        }
        sc.nextLine();
    }




}
