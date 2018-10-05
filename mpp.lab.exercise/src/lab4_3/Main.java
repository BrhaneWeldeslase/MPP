package lab4_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        double totalNetEmployeeSalary = 0;

        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Hourly("1", 50.0, 40.0);
        Employee employee2 = new Salaried("2", 10000);



        List<Order> orders1 = new ArrayList<>();
        Order order1 = new Order(1, LocalDate.of(2018, 10, 2), 20000);
        Order order2 = new Order(1,LocalDate.of(2018, 10, 3) , 30000);
        orders1.add(order1);
        orders1.add(order2);
        Employee employee3 = new Commissioned("3",10, 2000, orders1);


        List<Order> orders2 = new ArrayList<>();
        Order order3 = new Order(1, LocalDate.of(2018, 10, 1), 1200);
        Order order4 = new Order(1, LocalDate.of(2018, 10, 4), 2000);
        orders2.add(order3);
        orders2.add(order4);
        Employee employee4 = new Commissioned("4", 15, 25000, orders2);


        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
         Double getNetPay=0.0;
        for(Employee employee : employees) {

           employee.print();
         
          
        }

     

	}

}
