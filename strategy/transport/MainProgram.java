package transport;

public class MainProgram
{
    Vehicle vehicle;

    private void setVehicle(Vehicles vehicleType)
    {
        this.vehicle = getVehicle(vehicleType);
    }

    public void move()
    {
       vehicle.move();
    }

    public static void main(String ...args)
    {
        MainProgram mp = new MainProgram();
        mp.setVehicle(Vehicles.BUS);
        mp.move();

        mp.setVehicle(Vehicles.TRAIN);
        mp.move();

        mp.setVehicle(Vehicles.PLANE);
        mp.move();
    }

    public static Vehicle getVehicle(Vehicles vehicleType)
    {
        Vehicle vehicle = new Bus();
        switch (vehicleType)
        {
            case BUS:
            {
                vehicle = new Bus();
                break;
            }
            case PLANE:
            {
                vehicle = new Plane();
                break;
            }
            case TRAIN:
            {
                vehicle = new Train();
                break;
            }
        }
        return vehicle;
    }
}