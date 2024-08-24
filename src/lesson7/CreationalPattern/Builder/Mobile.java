package lesson7.CreationalPattern.Builder;

public class Mobile {

    final int ram;
    final int storage;
    final int battery;
    final int camera;
    final double screenSize;
    final String processor;

    public Mobile(int ram, int storage, int battery, int camera, double screenSize, String processor) {
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
        this.camera = camera;
        this.screenSize = screenSize;
        this.processor = processor;
    }

    public Mobile(MobileBuilder mobileBuilder) {
        this.ram = mobileBuilder.ram;
        this.storage = mobileBuilder.storage;
        this.battery = mobileBuilder.battery;
        this.camera = mobileBuilder.camera;
        this.screenSize = mobileBuilder.screenSize;
        this.processor = mobileBuilder.processor;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", battery=" + battery +
                ", camera=" + camera +
                ", screenSize=" + screenSize +
                ", processor='" + processor + '\'' +
                '}';
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getBattery() {
        return battery;
    }

    public int getCamera() {
        return camera;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getProcessor() {
        return processor;
    }
}
