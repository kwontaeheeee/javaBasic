public abstract class Transport {
    private String vehicleId;
    private String status;

    public Transport(String vehicleId, String status) {
        this.vehicleId = vehicleId;
        this.status = status;
    }

    public String getVehicleId() {
        return this.vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void stop() {
        System.out.println("교통수단 " + vehicleId + "가 정지합니다.");
        setStatus("정지");
    }

    
    public abstract void start();
    public abstract void navigate(String destination);
}

class Bus extends Transport {
    public Bus(String vehicleId, String status) {
        super(vehicleId, status); }

    @Override
    public void start() {
        System.out.println("버스 " + getVehicleId() + "가 출발합니다.");
        setStatus("운행 중");
    }

    @Override
    public void navigate(String destination) {
        System.out.println("버스가 " + destination + "으로 이동합니다.");
    }
}

class Train extends Transport {
    public Train(String vehicleId, String status) {
        super(vehicleId, status); 
    }

    @Override
    public void start() {
        System.out.println("기차 " + getVehicleId() + "가 플랫폼을 떠납니다.");
        setStatus("운행 중");
    }

    @Override
    public void navigate(String destination) {
        System.out.println("기차가 " + destination + "행 노선으로 진입합니다.");
    }

    public void announceStations() {
        System.out.println("기차가 다음 역들을 안내합니다...");
    }
}

class Drone extends Transport {
    public Drone(String vehicleId, String status) {
        super(vehicleId, status); 
    }

    @Override
    public void start() {
        System.out.println("드론 " + getVehicleId() + "가 이륙합니다.");
        setStatus("운행 중");
    }

    @Override
    public void navigate(String destination) {
        System.out.println("드론이 항공 경로를 따라 " + destination + "으로 이동합니다.");
    }

 
    public void captureSurroundings() {
        System.out.println("드론이 주변 상황을 촬영합니다.");
    }
}

class TransportManager {
    private Transport[] transports;

    public TransportManager(Transport[] transports) {
        this.transports = transports;
    }

}
