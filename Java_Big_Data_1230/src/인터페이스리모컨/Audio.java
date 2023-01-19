package 인터페이스리모컨;

public class Audio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }

    public void getInfo(){ // 인터페이스 public abstract가 앞에 붙어있기 때문에 상속받을 때 public 접근제한자를 써서 메소드를 재정의한다.
        System.out.println("오디오 입니다.");
        System.out.println("현재 볼륨은 " + volume + "입니다.");
    }

    public void setMute(boolean mute){
        if(mute) System.out.println("TV를 무음 처리를 합니다.");
        else System.out.println("TV를 무음 해제 합니다.");

    }
}


