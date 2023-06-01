import java.util.Objects;

public class VehicleFactory
{
    public static Vehicle getVehicle(String Type,int Cap,String name)
    {
        if(Objects.equals(Type, "Bike"))
            return new Bike(name,Cap);
        else if (Objects.equals(Type, "Car"))
            return new Car(name,Cap);
        else if(Objects.equals(Type, "Bus"))
            return new Bus(name,Cap);
        return new NullVechicle();
    }
}
