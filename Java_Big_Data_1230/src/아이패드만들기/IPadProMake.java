package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

//
public class IPadProMake {
    // public 패키지 상관없이 접근 가능.
    // 앞에 아무것도 없는 default -> 같은 패키지 내에서 접근 가능.
    // private은 정해진 방법 말고는 같은 패키지 내라도 접근 불가. 같은 클래스에서는 접근가능
    private int screen; // 화면 크기 : 11인치, 12.9인치
    private int color; // 색상 : 스페이스 그레이, 실버
    private int memory; // 용량 : 128GB, 256GB, 512GB, 1TB
    private int network; // 네트워크 : Wi-Fi, Wi-Fi + Cellular
    private String name; // 각인 서비스 시 이름 저장
    private String productDate; // 제품 생산 일자
    private String serialNum; // 제품일련번호 : iPad13128C2301121
    private static int cnt = 0; // 클래스 변수 : 객체 시 생성되지 않고 클래스 생성 시 만들어짐.


    public IPadProMake(String name){
        this.name = name;
        Date now = new Date(); // 현재의 시간정보를 가져오기 위해 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now); // 시간 정보 중 "yyMMdd"에 패턴으로 시간 정보 가져옴.
        cnt++; // 생성자는 객체가 만들어 질 때 호출되므로 생성된 객체의 횟수를 확인하는 용도로 사용.
        productDate += cnt; // 연월일 + 생산대수가 결합되어있는 상태로 만들어짐.
    }

    //제품 구매에 대한 진행 여부 묻는 메뉴 만들기
    public boolean continueOrder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==== iPad Pro 구입하기 ====");
        System.out.print("구입하시려면 Yes / 종료는 Quit : ");
        String isContinue  = sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true;// 문자열을 비교할 때는 == 가 아니라 메소드 내의 equals, equalsIgnoreCase를 써야한다.
        return false;
    }

    // 화면 크기 정하기

    public void setScreen(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("디스플레이 선택 [1] 11인치, [2] 12.9 인치 : ");
            screen = sc.nextInt();
            if(screen == 1 || screen == 2) return; // 여기서 해당 메소드가 끝남
            System.out.println("디스플레이를 다시 선택하세요.");
        }
    }

    public void setColor(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("색상 선택 [1] 스페이스 그레이, [2] 실버 : ");
            color = sc.nextInt();
            if(color == 1 || color == 2) return;
            System.out.println("색상을 다시 선택하세요.");
        }

    }

    public void setMemory(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("용량 선택 [1] 128GB, [2] 256GB, [3] 512GB, [4] 1TB");
            memory = sc.nextInt();
            if(memory > 0 && memory < 5) return;
            System.out.println("옹량을 다시 선택하세요.");
        }
    }

    public void setNetwork(){
        Scanner sc = new Scanner(System.in);  // 밖으로 빼도 상관없지만 버퍼비우기를 해야할 경우가 생길 수도 있어서 안으로 넣음.
        while(true){
            System.out.println("네트워크 선택 [1] Wi-Fi [2] Wi-Fi + Cellular");
            network = sc.nextInt();
            if(network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택하세요.");
        }
    }
    public void setName(){
        Scanner sc = new Scanner(System.in);
            System.out.print("각인 서비스를 신청하시겠습니까? (Yes / No) : ");
            String service = sc.next();
            if(service.equalsIgnoreCase("yes")){
                System.out.print("이름을 입력 하세요 : ");
                name = sc.next();

        }
    }

    // 일련번호 만들기 : iPad + 11/13 + +128/256/512/1024 + W/C + 230112 + 생산댓수

    public void setSerialNum(){
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memStr[memory] + netStr + productDate;

    }
    
    // 제품구매가 완료되면 출고까지 30초 대기 이후 출고하기

    public void inProductPad() throws InterruptedException {
        int cnt = 0; // 얘는 이 메소드에서만 쓰이는 로컬변수, 위에서 선언된 클래스 변수와는 다름.
        while(true){
            sleep(300);
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%] >> ");
            System.out.print("\r"); // 케리지 리턴, 다시 문자열 처음으로 되돌림. 문자열 처음으로 돌려서 다시 출력하지만
            // 사용자가 볼 때는 cnt값만 바뀌는 것으로 보임.
            if(cnt >= 100 ) break;
        }

    }

    public void productPad(){
        final String[] scrType = {"", "11인치", "12.9인치"};
        final String[] colorType = {"", "스페이스 그레이", "실버"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType = {"", "Wi-Fi", "Wi-Fi + Cellular"};
        System.out.println("==== iPad Pro가 출고되었습니다. ====");
        System.out.println("디스플레이 : " + scrType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("각인 : " + name);
        System.out.println("일련번호(S/N) : " + serialNum);
        System.out.println("----------------------------");
    }





}
