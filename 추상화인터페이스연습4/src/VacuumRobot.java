public class VacuumRobot implements Cleanable {
    @Override
    public void startCleaning() {
        System.out.println("진공 청소를 시작합니다.");
    }

    @Override
    public void stopCleaning() {
        System.out.println("진공 청소를 종료합니다.");
    }
}


