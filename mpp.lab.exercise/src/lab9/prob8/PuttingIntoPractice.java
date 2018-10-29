package lab9.prob8;


//import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;



public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		             Function<Transaction, Integer> byValue = e -> e.getValue();
		      //  Comparator<Transaction> e=(e1, e2)->Integer.compare(e1.getValue(),e2.getValue());
                   transactions.stream().filter(p->p.getYear()==2011)
                                        .sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList())
                                        .forEach(System.out::println);
        
        // Query 2: What are all the unique cities where the traders work?
              String a= transactions.stream().map(p->p.getTrader().getCity())
                                        .distinct()
                                         .collect(Collectors.joining(","));
                      System.out.println(a);
        // Query 3: Find all traders from Cambridge and sort them by name.
                   Function<Trader,String> byName=p->p.getName();
                         transactions.stream() .filter(p->p.getTrader().getCity().equals("Cambridge"))
                                               .map(p->p.getTrader())
                                              .sorted(Comparator.comparing(Trader::getName))
                                              .distinct()
                                              .collect(Collectors.toList())
                                              .forEach(System.out::println);
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
                       //  Function<Trader,String> byName=p->p.getName();
                     String tradersName= transactions.stream().map(p->p.getTrader())
                                          .sorted(Comparator.comparing(Trader::getName))
                                          .distinct()
                                          .map(p->p.getName()).collect(Collectors.joining(","));
                     System.out.println(tradersName);
        // Query 5: Are there any trader based in Milan?
                      Optional<Transaction> t= transactions.stream()
                    		                               .filter(p->p.getTrader().getCity().equals("Milan"))
                    		                               .findFirst();
                           
                           System.out.println(t.isPresent()?t.get():"No");
                         //  t.ifPresent(System.out::println);
          // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
                     
            transactions.stream().map(p->p.getTrader())
                                 .filter(p->p.getCity().equals("Milan"))
                                 .map(PuttingIntoPractice::UpDateCity)
                                 .forEach(System.out::println);                                                    
        // Query 7: What's the highest value in all the transactions?
                    System.out.println(transactions.stream().
                    		           max(Comparator.comparing(Transaction::getValue))
                    		           .get());
    }

	private static Trader UpDateCity(Trader t) {
		t.setCity("Cambridge");
		return t;
	}
  
}
