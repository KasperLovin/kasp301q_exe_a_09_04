

    /*
    Write a class SportUtilityVehicle that relates to the Car class from Self-Check Problems 9 and 10 and whose
    methods have the following behavior. Whenever possible, use inheritance to reuse behavior from the superclasses.
    */

    public class ch_09_04 {
        public void m1() {
            System.out.println("car 1");
        }
        public void m2() {
            System.out.println("car 2");
        }
        public String toString() {
            return "vroom";
        }
    }
    class Truck extends ch_09_04 {
        public void m1() {
            System.out.println("truck 1");
        }
    }

class SportUtilityVehicle extends ch_09_04
{
    public static void main(String[] args)
    {
        SportUtilityVehicle Car = new SportUtilityVehicle();
        Car.m1();
        Car.m2();
        System.out.println(Car.toString());
    }
    @Override
    public void m1() {
        System.out.println("SUV 1");
    }
    @Override
    public void m2() {
        super.m1();
    }
    @Override
    public String toString() {
        return "SUV " + super.toString();
    }
}