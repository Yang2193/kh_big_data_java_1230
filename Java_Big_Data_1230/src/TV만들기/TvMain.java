package TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TV samsungTv = new TV(); // 기본 생성자
        TV lgTv = new TV(true, 59, 15);

        lgTv.getTV();
        samsungTv.setON(true);
        samsungTv.setChannel(1223);
        samsungTv.setVolume(32);
        samsungTv.getTV();


    }
}
