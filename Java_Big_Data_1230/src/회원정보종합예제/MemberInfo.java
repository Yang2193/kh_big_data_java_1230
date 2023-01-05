package 회원정보종합예제;

import java.util.Scanner;

// 이름, 나이, 성별, 직업 받아서 출력하기
public class MemberInfo { //필드와 메소드가 있음
    //메인이 아니므로 필드를 추가해야 됨. 필드 추가하기 : 필드란? 클래스 내부에서 사용하는 변수를 의미.(객체 생성 시 객체 갯수만큼 생성 됨.)
    String name;
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    //키보드로 입력된 값을 name 필드에 저장
    public void setName(){
        System.out.print("이름을 입력하세요. : ");
        name = sc.next(); //name 앞에 this. 이 숨어있다.
    }
    //주어진 조건에 맞는 나이를 입력 받아서 age 필드에 저장.
    public void setAge(){
        while(true) {
            System.out.print("나이를 입력하세요. : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) return; // return은 break보다 광범위한 탈출문. break는 블럭 하나를 벗어나는 효과. return은 여기서 void까지 돌아감.
            System.out.println("나이를 잘못 입력하셨습니다.");
        }
    }
    // 주어진 조건에 맞는 성별을 입력 받아서 gender 필드에 저장.
    public void setGender(){
        while(true) {
            System.out.print("성별을 입력하세요(M/F) : ");
            gender = sc.next().charAt(0); // 문자열에서 0번째, 즉 첫번째 문자를 입력 받음.
            switch(gender) {
                case 'M': case 'm': case 'F': case 'f': case '남': case '여': return;
                default :
                    System.out.println("성별을 잘못 입력하셨습니다.");
                    //continue; // 반복문의 처음으로 되돌아감.

            } //switch 케이스에서 break를 걸면 여기로 나오는데, 그러면 while문에 갇혀서 못 빠져나옴.
            //break;
        }//위에서 break 걸면 여기로 나옴. 이렇게 되면 잘못입력했을 경우에도 break로 빠져나와버림.
    }

    //주어진 조건에 맞는 직업을 입력받아서 Jobs 필드에 저장.
    public void setJobs(){
        while (true){
            System.out.print("직업을 입력하세요(1.학생, 2.회사원, 3.주부, 4.무직 : ");
            jobs = sc.nextInt();
            if(jobs > 0 && jobs < 5) return;
            System.out.println("직업을 잘못 입력하셨습니다.");
        }
    }
    public int getGenderType(){
        if(gender == 'M' || gender == 'm' ||gender ==  '남') return 1;
        else return 2;
    }

    public void viewInfo(){
        String[] genderStr = {"", "남성", "여성"};
        String[] jobStr = {"","학생","회사원","주부","무직"}; // 직업입력 숫자는 1234 지만 인덱스에서는 0부터 시작이라 0번째에 해당하는 자리를 비워놓음.
        System.out.println("====회원 정보 출력====");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]); // getGenderType이란 메소드를 만들어서 gender가 M이거나 m이면 결과값을 1로 되돌리게 설정
        // 아니면 2로 설정, 호출을 하고 나면 값이 1, 2가 된다. 그렇게 해서 반환된 값을 genderStr[]안에 1 혹은 2를 집어넣어서
        // genderStr에 할당 된 "남성", "여성"을 호출, 마찬가지로 인덱스는 0부터 시작이라 첫번째 자리를 비우고 두번째 자리부터 할당.
        System.out.println("직업 : " + jobStr[jobs]);


    }
    
}
