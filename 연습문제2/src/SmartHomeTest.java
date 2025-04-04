    class SmartDevice {
        String name;
        boolean isOn;

    public SmartDevice(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsOn() {
        return this.isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", isOn='" + isIsOn() + "'" +
            "}";
    }
 
        void turnOn() {
            isOn = true;
            System.out.println(name + "이 켜졌습니다.");
        }
    
        void turnOff() {
            isOn = false;
            System.out.println(name + "이 꺼졌습니다.");
        }
    
        void showStatus() {
            if (isOn) {
                System.out.println(name + " 상태: ON");
            } else {
                System.out.println(name + " 상태: OFF");
            }
        }
    }
    
    class SmartLight extends SmartDevice {
        SmartLight(String name, boolean isOn) {
            super(name, isOn);
        }
    
       public void changeColor(String color) {
            if (getIsOn()) {
                System.out.println(name + " 조명이 " + color + "으로 바뀝니다.");
            } else {
                System.out.println(name + "이 꺼져 있어 색상을 변경할 수 없습니다.");
            }
        }
    }
    
    class SmartSpeaker extends SmartDevice {
        SmartSpeaker(String name, boolean isOn) {
            super(name, isOn);
        }
    
        public void playMusic(String song) {
            if (getIsOn()) {
                System.out.println(name + "에서 '" + song + "' 음악을 재생합니다.");
            } else {
                System.out.println(name + "이 꺼져 있어 음악을 재생할 수 없습니다.");
            }
        }
    }
    
    class SmartThermostat extends SmartDevice {
        SmartThermostat(String name, boolean isOn) {
            super(name, isOn);
        }
    
        public void setTemperature(int degree) {
            if (getIsOn()) {
                System.out.println(name + "의 온도를 " + degree + "도로 설정합니다.");
            } else {
                System.out.println(name + "이 꺼져 있어 온도를 설정할 수 없습니다.");
            }
        }
    }
    
    public class SmartHomeTest {
        public static void main(String[] args) {
            SmartDevice[] devices = new SmartDevice[3];
            devices[0] = new SmartLight("스마트 전등", false);
            devices[1] = new SmartSpeaker("스마트 스피커",false);
            devices[2] = new SmartThermostat("스마트 온도조절기",false);
    
            // 모든 기기 전원 켜기
            for (int i = 0; i < devices.length; i++) {
                devices[i].turnOn();
            }
    
            // 상태 출력
            for (int i = 0; i < devices.length; i++) {
                devices[i].showStatus();
            }
    
            System.out.println();
    
            // 각 기기의 고유 기능 실행 (다운캐스팅 사용)
            SmartLight light = (SmartLight) devices[0];
            light.changeColor("파란색");
    
            SmartSpeaker speaker = (SmartSpeaker) devices[1];
            speaker.playMusic("Jazz");
    
            SmartThermostat thermostat = (SmartThermostat) devices[2];
            thermostat.setTemperature(24);
        }
    }
        
     
        
     






