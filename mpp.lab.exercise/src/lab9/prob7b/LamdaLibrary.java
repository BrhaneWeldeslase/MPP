package lab9.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LamdaLibrary {
	public static final TriFunction<List<Employee>,Integer,Character,List<String>>  firstLast=
		   //	list.stream().filter(p->p.getSalary()>num)
			(list,num,letter)->list.stream().filter(p->p.getSalary()>num)
			                                .filter(p->(p.getLastName().charAt(0)>letter))
			                                .map(q->q.getFirstName()+" "+q.getLastName())
			                                .sorted()
			                                .collect(Collectors.toList());
                         
			
			
		                                
	
                                         
}
