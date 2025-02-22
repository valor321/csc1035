import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static class carManufacturer {
        /**
         * This class gets all the necessary requirements for the manufacture
         * This class includes a method to calculate the most expensive model
         * This class includes a method to calculate a more expensive car model for a given amount of money
         *This class includes a method to calculate the total revenue for a given manufacture
         */


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

        public static void moreExCarM(String manufacturer) {
            int money;
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter the money: ");
            money = Integer.parseInt(myObj.nextLine());

            for (carModel car : carModel.carList) {
                if (car.manufacturer.equals(manufacturer)) {
                    if (car.price > money) {
                        System.out.println("The model is a " + car.model + "with a weight of " + car.weight + " and price of "
                                + car.price + "it has sold " + car.sold + "it's type is " + car.type);


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

        /**
         * This class gets all the necessary requirements for the model which also includes the manufacture class
         * This class includes a method to retrieve the model names
         * This class collects all the cars details into a list for easier use
         * This class includes a method to get all the details necessary for the car
         */



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
        /**
         * This class includes a method to calculate the total revenue for a given type of car
         * This class includes a method to calculate the most expensive car
         * This class includes a method to calculate the most expensive car based of a certain amount of money
         */

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

        public static void moreExCar() {
            int money;
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter the money: ");
            money = Integer.parseInt(myObj.nextLine());

            for (carModel car : carModel.carList) {
                    if (car.price > money) {
                        System.out.println("The model is a " + car.model + "with a weight of " + car.weight + " and price of "
                                + car.price + "it has sold " + car.sold + "it's type is " + car.type);


                    } else {
                        System.out.println("There is no such expensive model");
                    }



            }

        }

    }

    public static class reportingIO{

        /**
         * This class gets the user input and asks all the questions necessary
         * This class has a method that asks for the manufacture
         * This class has a method that asks for the model
         * This class includes a method that displays the user menu and asks for what they want to do
         */

        public static void getManufacturer() {
            Scanner myObj = new Scanner(System.in);
            String manufacturer;

            System.out.println("Enter the manufacturer: ");
            manufacturer = myObj.nextLine();

            getCarModel(manufacturer);
            getAllManufactures();
            stats(manufacturer);
        }

        public static void getModel() {
            Scanner myObj = new Scanner(System.in);
            String model;

            System.out.println("Enter the model: ");
            model = myObj.nextLine();
        }

        public static void getCarModel(String manufacturer) {
            for (carModel car : carModel.carList) {
                if (car.manufacturer.equals(manufacturer)){
                    System.out.println("The model is a " + car.model + " with a weight of " + car.weight + " and price of "
                                        + car.price + " it has sold " + car.sold + " it's type is " + car.type);
                }
            }
        }
        public static void getAllManufactures() {
            for (carModel car : carModel.carList) {
                System.out.println("The manufactures are " + car.manufacturer);

            }
        }

        public static void stats(String manufacturer) {
            Scanner user = new Scanner(System.in);

            System.out.println("What would you like to display?");
            System.out.println("1. manufacturer with the largest revenue for cars sold of a given type");
            System.out.println("2. most expensive car model sold");
            System.out.println("3. all car models made with a price greater than a given amount of money");
            System.out.println("0. exit");



            System.out.println("Please enter a number: ");
            int userNum = user.nextInt();


            boolean repeat = true;
            do {
                switch (userNum) {
                    case 1:
                        carModel.expensiveM(manufacturer);
                        break;
                    case 2:
                        carModel.totalRev(manufacturer);
                        break;
                    case 3:
                        carModel.moreExCarM(manufacturer);
                        break;
                    case 4:
                        reporting.carModSold();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        repeat = false;


                }
            }
            while(repeat);


        }



    }


    public static void main(String[] args) {

        new carModel("coup", 12, 1200, 3200, "hatchback","bmw");
        new carModel("sedan", 17, 1100, 6050, "saloon", "bmw");
        new carModel("titanium", 17, 5600, 10000, "estate", "ford");
        new carModel("focus", 17, 1200, 56000, "hatchback", "ford");
        new carModel("mustang", 17, 10000, 40000, "saloon", "ford");
        /*
        carModel.allCars();
        carModel.expensiveM("bmw");
        carModel.totalRev("ford");
        carModel.moreExCarM("ford");
        reporting.carModSold();
        reporting.revType("saloon");
        reporting.moreExCar();
        reportingIO.getManufacturer();
        reportingIO.getModel(); */

        reportingIO.getManufacturer();
        reportingIO.getModel();


    }
}
