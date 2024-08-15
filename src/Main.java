public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Red Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2025 Blue Ferrari 296 GTS",
                20.1, 8);
        runRace(ferrari);

        Car tesla = new ElectricCar("2024 Red Tesla Model X", 666, 99);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2024 Red Ferrari", 666, 10, 99);
        runRace(ferrariHybrid);

    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
