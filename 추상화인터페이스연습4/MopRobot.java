public class MopRobot implements Cleanable{
    @Override
    public void startCleaning() {
        System.out.println("MopRobot cleaning started.");
    }

    @Override
    public void stopCleaning() {
        System.out.println("MopRobot cleaning stopped.");
    }
}
