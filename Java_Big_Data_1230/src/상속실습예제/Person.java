package 상속실습예제;

import java.util.Scanner;

public class Person {
    String name;
    private int age;
    private int sleep;

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setSleep(int sleep){
        this.sleep = sleep;
    }
    int getSleep(){
        return sleep;
    }

   // Person(){ 생성자를 만들어주는 경우에는 추가적으로 super를 활용해 뭔가 해야될 경우가 있기 때문에 여기서는 만들지 않음.
    //}

}

class Work extends Person{
    int workTime;



    void setWorkTime(int workTime){
        this.workTime = workTime;

    }

    int getWorkTime(){
        return workTime;
    }



    void workInfo(){
        System.out.println("나이 : " + getAge());
        System.out.println("수면시간 : " + getSleep());
        System.out.println("노동시간 : " + workTime);
    }

}

class Study extends Person {
    int study;
    String studyType;

    void setStudy(int study){
        this.study = study;
    }

    String getStudy(){
        String[] studyStr = {"","\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return studyStr[study];
      /*  if(study == 1) return "열심히 ";
        else if(study == 2) return "적당히 ";
        else return "놀면서";*/

    }

    void studyInfo(){
        System.out.println("나이 : " + getAge());
        System.out.println("수면시간 : " + getSleep());
        System.out.println("공부특성 : " + studyType +" 한다.");
    }

}
