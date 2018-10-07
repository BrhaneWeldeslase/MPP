package test.lab5_3;

import java.lang.reflect.InvocationTargetException;

import lab5_3.VehicleFactory;

public class Main {
   public static void main(String args[])
   {
	   VehicleFactory.getVehice("Bus").startEngine();
   }
}
