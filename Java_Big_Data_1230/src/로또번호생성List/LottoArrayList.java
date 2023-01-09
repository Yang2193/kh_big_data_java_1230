package 로또번호생성List;
// 로또번호생성 + 중복제거
import java.util.ArrayList;
import java.util.List;

public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // 갯수지정필요없음
        int tmp; // 로또 번호를 임시로 저장하는 변수.
        while(true){
            tmp = (int)((Math.random() * 45) + 1);

            if(!list.contains(tmp)) list.add(tmp); // 중복체크코드 중복체크하고 없으면 list.add로 추가.
            if(list.size() == 6) break;


        }

        for(Integer e : list) System.out.print(e + " ");
    }
}
