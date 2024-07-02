import java.rmi.*;
public interface TenperatureInterface extends Remote
{
public double FahrenheitToCelsius(double f) throws RemoteException;
}