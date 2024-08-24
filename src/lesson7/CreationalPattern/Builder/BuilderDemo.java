package lesson7.CreationalPattern.Builder;

public class BuilderDemo {

    public static void main(String[] args) {

        Mobile myMobileFull = new MobileBuilder()
                .with(mb -> {
                    mb.ram = 4;
                    mb.storage = 64;
                    mb.battery = 5000;
                    mb.camera = 108;
                    mb.screenSize = 6.5;
                    mb.processor = "Snapdragon 865";
                })
                .createMobile();
        System.out.println("Entire state " + myMobileFull.toString());
        Mobile myMobileEmpty = new MobileBuilder()
                .with(mb -> {
                })
                .createMobile();
        System.out.println("Empty state " +myMobileEmpty.toString());
    }
}
