package 아이패드만들기;

public class IPadProMain {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            IPadProMake iPad = new IPadProMake("iPad Pro");
            if(!iPad.continueOrder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProductPad();
            iPad.productPad();

          //  System.out.println(iPad.serialNum); // 정해진 메소드를 통하지 않고 바로 접근해서 에러.


        }
    }
}
