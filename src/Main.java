public class Main {

    public static class carModel {
        String model;
        String manufacturer;
        int weight;
        int price;
        int sold;
        String type;
    }
    static class carManufacturer extends carModel {
        String manufacturer;
        public void retrieveName(){
            System.out.println("The manufacturer is " + manufacturer);
        }
        
    }


    public static void main(String[] args) {
        carModel car1 = new carModel();
        carModel car2 = new carModel();
        car1.model = "coup";
        car1.weight = 12;
        car1.price = 1000;
        car1.sold = 3200;
        car1.type = "hatchback";
        car1.manufacturer = "bmw";
        car2.model = "sedan";
        car2.weight = 17;
        car2.price = 1000;
        car2.sold = 6050;
        car2.type = "saloon";
        car2.manufacturer = "bmw";
            }
}
