public class Main {
    public static void main(String[] args) {
        Cleanable[] robots = new Cleanable[] {
            new VacuumRobot(),
            new MopRobot()
        };

        for (Cleanable robot : robots) {
            robot.startCleaning();
            robot.stopCleaning();
        }
    }
}
