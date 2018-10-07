package lab5_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         figure[] figures= {new Circle(5),new Rectangle(4,5),new Triangle(3,6)};
           for(figure f: figures)
           {
        	   System.out.println("Sum of Areas "+ f.getClass().getSimpleName()+" "+f.computeArea());
           }
	}

}
