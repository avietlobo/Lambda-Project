import java.time.LocalDate;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate yesterday= LocalDate.now().plusDays(-1);
		LocalDate input = LocalDate.of(2021, 03, 25);
		System.out.println(yesterday); 
		System.out.println(input);
		Predicate<LocalDate> predicate = i ->  i.equals(LocalDate.now().plusDays(-1));
		System.out.println(predicate.test(input));
		
		Predicate<Integer> predicateTest = i -> i%2==0;
		predicateTest.test(100);
		
		Consumer<Integer> consumer = j->System.out.println(j*j);;
		consumer.accept(10);
		
		Supplier<Integer> supplier= () -> (int)Math.random()*4999;
		supplier.get();
		
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a * b;
        
        // Implement add using apply()
        System.out.println("Cost = " + add.apply(2, 3));

		
		

	}

}
