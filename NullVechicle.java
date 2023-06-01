public class NullVechicle extends Vehicle
{
    //default behavior or do nothing behaviour
    //invalid type of vechicle
    //invalid property display
    public NullVechicle()
    {
        this.name = "invalid Type";
        this.seatingCap = 0;
    }

    @Override
    String getDiscription() {
        return "Not a valid vechicle type";
    }

    @Override
    int getSeatingCapacity() {
        return 0;
    }
}
