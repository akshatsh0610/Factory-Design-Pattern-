// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
          Vehicle hondacity = VehicleFactory.getVehicle("Car",5,"hondacity");
          System.out.println(hondacity.getSeatingCapacity());
          System.out.println(hondacity.getDiscription());
          System.out.println();
          Vehicle cycle=VehicleFactory.getVehicle("Cycle",2,"Bicycle");
          System.out.println(cycle.getSeatingCapacity());
          System.out.println(cycle.getDiscription());
    }
}