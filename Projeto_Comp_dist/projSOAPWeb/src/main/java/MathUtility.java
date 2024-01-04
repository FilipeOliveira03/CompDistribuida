import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.jws.WebService;

@WebService(targetNamespace = "http://default_package/", portName = "MathUtilityPort", serviceName = "MathUtilityService")
public class MathUtility {

	String ip = "192.168.56.101";
	
	public Object[] valida_praia(String letra) throws RemoteException{
		try {
	    	String addServerURL = "rmi://" + ip + "/AddServer";
		      AddServerIntf addServerIntf =
		                    (AddServerIntf)Naming.lookup(addServerURL);
		      
		      return (Object[]) addServerIntf.valida_praia(letra);
		      
	        } catch (IOException e) {
	            System.out.println("Exception: " + e);
	        } catch (NotBoundException e) {
				e.printStackTrace();
			}
			return null;
	}
	
	public Object[] valida_hora(String letra) throws RemoteException{
		try {
	    	String addServerURL = "rmi://" + ip + "/AddServer";
		      AddServerIntf addServerIntf =
		                    (AddServerIntf)Naming.lookup(addServerURL);
		      
		      return (Object[]) addServerIntf.valida_hora(letra);
		      
	        } catch (IOException e) {
	            System.out.println("Exception: " + e);
	        } catch (NotBoundException e) {
				e.printStackTrace();
			}
			return null;
	}
	
	public Object[] valida_num(String num) throws RemoteException{
		try {
	    	String addServerURL = "rmi://" + ip + "/AddServer";
		      AddServerIntf addServerIntf =
		                    (AddServerIntf)Naming.lookup(addServerURL);
		      
		      return (Object[]) addServerIntf.valida_num(num);
		      
	        } catch (IOException e) {
	            System.out.println("Exception: " + e);
	        } catch (NotBoundException e) {
				e.printStackTrace();
			}
			return null;
	}
	
	public Object[] funcReservar(String letra, int idUser, String hora, int num_pessoas) throws RemoteException{
		try {
	    	String addServerURL = "rmi://" + ip + "/AddServer";
		      AddServerIntf addServerIntf =
		                    (AddServerIntf)Naming.lookup(addServerURL);
		      
		      return (Object[]) addServerIntf.funcReservar(letra, idUser, hora, num_pessoas);
		      
	        } catch (IOException e) {
	            System.out.println("Exception: " + e);
	        } catch (NotBoundException e) {
				e.printStackTrace();
			}
			return null;
	}
	
	public Object[] funcListar(String letra, int idUser, String hora) throws RemoteException{
		try {
	    	String addServerURL = "rmi://" + ip + "/AddServer";
		      AddServerIntf addServerIntf =
		                    (AddServerIntf)Naming.lookup(addServerURL);
		      
		      return (Object[]) addServerIntf.funcListar(letra, idUser, hora);
		      
	        } catch (IOException e) {
	            System.out.println("Exception: " + e);
	        } catch (NotBoundException e) {
				e.printStackTrace();
			}
			return null;
	}
	
	public Object[] funcCancelar(String letra, int idUser, String hora) throws RemoteException{
		try {
	    	String addServerURL = "rmi://" + ip + "/AddServer";
		      AddServerIntf addServerIntf =
		                    (AddServerIntf)Naming.lookup(addServerURL);
		      
		      return (Object[]) addServerIntf.funcCancelar(letra, idUser, hora);
		      
	        } catch (IOException e) {
	            System.out.println("Exception: " + e);
	        } catch (NotBoundException e) {
				e.printStackTrace();
			}
			return null;
	}
	
	
	
}
