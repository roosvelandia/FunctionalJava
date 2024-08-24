package lesson7.CreationalPattern.Builder;

import lesson6.Techniques.Chaining.Consumer;

public class MobileBuilder {

     int ram;
     int storage;
     int battery;
     int camera;
     double screenSize;
     String processor;

     public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
            buildFields.accept(this);
            return this;
     }

     public Mobile createMobile() {
         return new Mobile(this);
     }
}
