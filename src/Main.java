import java.util.ArrayList;

public class Main {

    public static class carManufacturer {
        String manufacturer;
        int weight;
        int price;
        int sold;
        String type;
    }
    static class carModel extends carManufacturer {
        String model;

        public static ArrayList<carModel> carList = new ArrayList<>(); //creates list to add every car to it

        public carModel(String model, int weight, int price, int sold, String type, String manufacturer) {
            this.model = model;
            this.weight = weight;
            this.price = price;
            this.sold = sold;
            this.type = type;
            this.manufacturer = manufacturer;

            carList.add(this); //auto adds the car
        }

        public void retrieveName(){
            System.out.println("The model is a " + model);
        }


    public static void printList(){
            for (carModel car : carList) {
                car.retrieveName(); //retrieves all models
            }
    }

    }


    public static void main(String[] args) {
        new carModel("coup", 12, 1000, 3200, "hatchback","bmw");
        new carModel("sedan", 17, 1000, 6050, "saloon", "bmw");
        carModel.printList();
        //carModel car2 = new carModel();
        //car1.model = "coup";
        //car1.weight = 12;
        //car1.price = 1000;
        //car1.sold = 3200;
        //car1.type = "hatchback";
        //car1.manufacturer = "bmw";
        //car2.model = "sedan";
        //car2.weight = 17;
        //car2.price = 1000;
        //car2.sold = 6050;
        //car2.type = "saloon";
        //car2.manufacturer = "bmw";
        //car1.retrieveName();
        //car2.retrieveName();
            }
}
