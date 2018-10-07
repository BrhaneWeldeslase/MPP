package lab5_3;

import java.lang.reflect.InvocationTargetException;

public class VehicleFactory {
	private VehicleFactory()
	{
		
	}
	public static Vehicle getVehice(String v){
	//   Vehicle vehicle= (Vehicle) Class.forName(v).
		Vehicle vehicle=null;
		try {
			Class<?> c1=Class.forName("lab5_3." +v);
			vehicle = (Vehicle)c1.getDeclaredConstructor().newInstance();
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return vehicle;
	}
}
