import java.util.ArrayList;
import java.util.List;

public class MeberSever {
    /* 회원 저장 되는 리스트*/
    private static List<MeberDTO> meberList = new ArrayList<>();
    /* 회원 추가 */
    public static void addList(MeberDTO meber){
        meberList.add(meber);
    }
    /* 회원 조회 */
    public List<MeberDTO> MemberInquiry(){

        return meberList;
    }

    /* 회원 정보 수정 */
     public boolean uqdateMeber(MeberDTO uqdateMeber){

         MeberDTO old = null;

         for (int i = 0; i < meberList.size(); i++) {
             if(meberList.get(i).getId() == uqdateMeber.getId()){
                 old = meberList.set(i, uqdateMeber);

             }
         }
         return old != null;
     }

     /* 회원정보 삭제*/
     public boolean removerMeber(int id){

         MeberDTO old = null;

         for (int i = 0; i < meberList.size(); i++) {
             if(meberList.get(i).getId() == id) {
                 old = meberList.remove(i);
             }
         }

         return old != null;
     }







}
