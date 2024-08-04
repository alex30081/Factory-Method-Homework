package app;

public class Client {
    public static void main(String[] args) {
        TransportFactory carCreator = new CarFactory();
        Transport car = carCreator.createTransport();
        car.move();

        TransportFactory planeCreator = new PlaneFactory();
        Transport plane = planeCreator.createTransport();
        plane.move();
    }
}
