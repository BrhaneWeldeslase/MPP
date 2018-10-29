package lab9;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    public static void main(String args[])
    {
    
    	System.out.println("a. Is there any Vegetarian meal available \n "+ menu.stream().anyMatch(p->p.isVegetarian()));
    	//Is there any healthy menu have calories less than 1000 ( return type boolean)
    	System.out.println("b. Is there any healthy menu have calories less than 1000 ( return type boolean)");
    	  System.out.println(menu.parallelStream().allMatch(p->p.getCalories()<1000));
    	System.out.println("c. Is there any unhealthy menu have calories greater than 1000");
    	      System.out.println(menu.stream().anyMatch(p->p.getCalories()>1000));
    	 System.out.println("d. find and return the first item for the type of MEAT");
    	  Optional<Dish> result= menu.parallelStream().filter(p->p.getType().equals(Dish.Type.MEAT)).findFirst();
    	    System.out.println(result.isPresent()?result.get():"NO MEAT");
    	   	  System.out.println("e.calculateTotalCalories() in the menu using");
    	      System.out.println(calculateTotalCalories());
    	      System.out.println("f. calculate Total CaloriesMethodReference()in the menu using MethodReferences");
    	        System.out.println(totalCaloriesMethodReference());   
    }
     static public int calculateTotalCalories()
    {
    	return menu.stream().map(p->p.getCalories()).reduce(0,(p1,p2)->(p1+p2));
    }
     static public int  totalCaloriesMethodReference()
     {
     	return (int) menu.stream().collect(Collectors.summarizingInt(Dish::getCalories)).getSum();
     }
    }
