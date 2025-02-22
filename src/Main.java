import java.util.ArrayList;

public class Main {

    public static class carManufacturer {
        String manufacturer;
        int weight;
        int price;
        int sold;
        String type;

        public static void expensiveM(String manufacturer) {
            int price1 = 0;
            String model = "";
            for (carModel car : carModel.carList) {
                if (car.manufacturer.equals(manufacturer)) {
                    if (car.price > price1) {
                        price1 = car.price;
                        model = car.model;
                    }


                }

            }
            System.out.println("The most expensive model made for a " + manufacturer + " is a " + model);

        }

        public static void moreExCarM(String manufacturer, int money) {
            String model;
            for (carModel car : carModel.carList) {
                if (car.manufacturer.equals(manufacturer)) {
                    if (car.price > money) {
                        model = car.model;
                        System.out.println("The model higher than the money for a " + manufacturer + " is a " + model);


                    } else {
                        System.out.println("There is no such expensive model for the " + manufacturer);
                    }


                }
            }

        }

        public static void totalRev(String manufacturer) {
            int price1 = 0;
            String model = "";
            for (carModel car : carModel.carList) {
                if (car.manufacturer.equals(manufacturer)) {
                    if ((car.price * car.sold) > price1) {
                        price1 = car.price * car.sold;
                        model = car.model;
                    }


                }
            }
            System.out.println("The model for highest revenue made for a " + manufacturer + " is a " + model);
            System.out.println("Total revenue made for a " + manufacturer + " is a " + model);
        }



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

    public static void allCars(){
            for (carModel car : carList) {
                car.retrieveName(); //retrieves all models
            }
    }

    }


    public static class reporting{

        public static void carModSold() {
            int expensive = 0;
            String model = "";
            for (carModel car : carModel.carList) {
                if (car.price > expensive) {
                    expensive = car.price;
                    model = car.model;
                }
            }
            System.out.println("Most expensive model is " + model);
        }

        public static void revType(String type) {
            int expensive = 0;
            String manufacturer = "";
            for (carModel car : carModel.carList) {
                if (car.type.equals(type)) {
                    if (car.price * car.sold < expensive) {
                        expensive = car.price * car.sold;
                        manufacturer = car.manufacturer;
                    }
                }
            }
            System.out.println("Most revenue made by a " + type + "is a " + manufacturer);
        }

        public static void moreExCar(int money) {
            String model;
            for (carModel car : carModel.carList) {
                    if (car.price > money) {
                        model = car.model;
                        System.out.println("The model higher than the money is a " + model);


                    } else {
                        System.out.println("There is no such expensive model");
                    }



            }

        }

    }


    public static void main(String[] args) {
        new carModel("coup", 12, 1200, 3200, "hatchback","bmw");
        new carModel("sedan", 17, 1100, 6050, "saloon", "bmw");
        new carModel("titanium", 17, 5600, 10000, "estate", "ford");
        new carModel("focus", 17, 1200, 56000, "hatchback", "ford");
        new carModel("mustang", 17, 10000, 40000, "saloon", "ford");
        carModel.allCars();
        carModel.expensiveM("bmw");
        carModel.totalRev("ford");
        carModel.moreExCarM("ford", 1200);
        reporting.carModSold();
        reporting.revType("saloon");
        reporting.moreExCar(1200);
    }
}
