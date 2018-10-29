package lab8;

import java.util.function.Predicate;

public class MyClass {
	//Predicate<MyClass> p=(c1)->this.equals(c1);
	//Predicate<MyClass> p=this::equals;
     int x;
     String name;
     MyClass(int x,String name)
     {
    	 this.x=x;
    	 this.name=name;
     }
     void myMethod(MyClass c1)
     {
    	 
    	 Predicate<MyClass> p=this::equals;
    	System.out.println(p.test(c1));
    	//System.out.println(this.equals(c1));
    	
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyClass ob1=new MyClass(10,"java");
         MyClass ob2=new MyClass(10,"java");
         ob1.myMethod(ob2);
         
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + x;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (x != other.x)
			return false;
		return true;
	}

}
