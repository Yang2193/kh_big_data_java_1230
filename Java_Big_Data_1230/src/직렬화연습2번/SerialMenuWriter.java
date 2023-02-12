package 직렬화연습2번;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SerialMenuWriter {

    static Map<String, CoffeeMenuInfo> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
    menuWrite();
    selectMenu();
    }

    static void menuWrite() {
        map.put("Americano", new CoffeeMenuInfo("Americano", 2500, "Coffee", "기본 커피"));
        map.put("Espresso", new CoffeeMenuInfo("Espresso", 2500, "Coffee", "진한 커피"));
        map.put("Latte", new CoffeeMenuInfo("Latte", 2500, "Coffee", "우유가 들어간 커피"));

    }

    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("메뉴를 선택하세요 : ");
            System.out.print("[1] 메뉴보기, [2] 메뉴추가, [3] 종료 : ");
            int menu = sc.nextInt();
            switch (menu){
                case 1 :
                    System.out.println("==== 메뉴 보기 ====");
                    for(String e : map.keySet()){
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getGroup());
                        System.out.println("설명 : " + map.get(e).getDesc());
                        System.out.println("------------------------");
                    } break;
                case 2 :
                    System.out.print("추가 할 메뉴를 입력하세요 : ");
                    String key = sc.next();
                    if(map.containsKey(key)){
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine(); // 버퍼 비우기
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.put(key, new CoffeeMenuInfo(key, price, group, desc));

                    } break;


                case 3 :
                    System.out.println("메뉴를 종료합니다. 내용을 파일에 저장합니다.");
                    FileOutputStream fis = new FileOutputStream("D:/직렬화파일/커피메뉴.bin");
                    ObjectOutputStream oos = new ObjectOutputStream(fis);
                    oos.writeObject(map); // 객체를 직렬화해서 파일에 저장.
                    oos.flush();
                    oos.close();
                    return;
            }
        }
    }
}
