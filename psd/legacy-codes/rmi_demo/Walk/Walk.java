import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Walk extends UnicastRemoteObject implements IWalk {
	
	private static final long serialVersionUID = 1L;
	
	int nsteps = 0;
	
	public Walk() throws RemoteException {
	}
	
	public void move(int n) {
		System.out.println("registrado movimento de " + n + " passos!");
		nsteps += n;
	}
	
	public String total() {
		String returnString = "total de " + nsteps + " passos já realizados!\n";
		return(returnString);
	}
}
