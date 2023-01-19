package 인터페이스리모컨;

public class Television implements RemoteControl{
        private int volume;
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }

        @Override
        public void setVolume(int volume) {
            if(volume > MAX_VOLUME) { // 같은 패키지 내에 있기 때문에 어느 위치에 존재하는지 알기 때문에 참조를 안 한것.
                this.volume = MAX_VOLUME;
            } else if(volume <MIN_VOLUME){
                this.volume = MIN_VOLUME;
            } else {
                this.volume = volume;
            }

            System.out.println("현재 TV 볼륨 : " + this.volume);
        }

        public void getInfo(){
            System.out.println("TV 입니다.");
            System.out.println("현재 볼륨은 " + volume + "입니다.");
        }
    }



