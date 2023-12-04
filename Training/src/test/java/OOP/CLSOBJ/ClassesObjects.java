package OOP.CLSOBJ;

public class ClassesObjects {
    public static class Car {
        String model;
        int year;

        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        public void start() {
            System.out.println("The car is starting.");
        }
    }
    public class Main {
        public static void main(String[] args) {
            Car myCar = new Car("Toyota Camry", 2022);

            System.out.println("Model: " + myCar.model);
            System.out.println("Year: " + myCar.year);
            myCar.start();
        }
    }
}
