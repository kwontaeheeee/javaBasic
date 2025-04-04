public class Main {
    public static void main(String[] args) {
       
        Transport[] transports = new Transport[] {
            new Bus("BUS-001", "대기"),
            new Train("TR-202", "대기"),
            new Drone("DRN-A7", "대기")
        };

        TransportManager manager = new TransportManager(transports);

 
        for (Transport transport : transports) {
            transport.start();
            transport.navigate("서울역");
            transport.stop();

            
            if (transport instanceof Train) {
                Train train = (Train) transport;
                train.announceStations();
            } else if (transport instanceof Drone) {
                Drone drone = (Drone) transport;
                drone.captureSurroundings();
            }
        }

    }
}
