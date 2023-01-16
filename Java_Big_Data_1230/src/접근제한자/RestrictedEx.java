package 접근제한자;

// 접근제한자는 객체지향언어 4가지 중요 특성 중 하나
// 사용목적은 내부의 필드값을 외부에서 접근하는 것을 제한하는 목적으로 사용.
public class RestrictedEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.name); // 동일패키지 내에 필드라서 접근제한이 안걸림.
        System.out.println(childRest.jobs); // 패키지가 많아지면 접근제한자 특성을 상세하게 이용해야한다.
        System.out.println(childRest.getMoney());


    }
}

class ChildRest extends ParentRest {
    String jobs;
    public  String getJobs(){
        return jobs;
    }

    public void setJobs(){
        this.jobs = jobs;
    }

    public String getMoney(){
        return money;
    }

    public String getName(){
        return name;
    }

    public String getAddr(){
        return addr;
    }

}