package lab8;

import java.util.function.Supplier;

public class lab8_2iii {
	 supplier a= new supplier();
    public static void main(String args[])
    {   
    	lab8_2iii b=new lab8_2iii();
       System.out.println(b.a.get());
    	
    }
    class supplier implements Supplier
    {

		@Override
		public Double get() {
			// TODO Auto-generated method stub
			return Math.random();
		}
    	
    }
}
