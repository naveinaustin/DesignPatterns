package transport;

public enum Vehicles
{
    BUS, TRAIN, PLANE;

    public static Vehicles parse(int action)
    {
        Vehicles vehicleSelected = BUS;
        try
        {
            vehicleSelected = values()[action];
        }
        catch(ArrayIndexOutOfBoundsException aibe)
        {
            //Don't do anything.
        }
        return vehicleSelected;
    }
}
