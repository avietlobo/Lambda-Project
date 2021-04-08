import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		 List<Employee> employees = new ArrayList<Employee>();
		 employees.add(new Employee(1,"Aviet",123));
		 employees.add(new Employee(2,"David",677));
		 employees.add(new Employee(3,"Samuel",434));
		 employees.add(new Employee(4,"Goliath",522));
		 employees.add(new Employee(5,"Henry",644));
		 
	
		 employees.sort((Employee e1,Employee e2)->e1.getEmpName().compareTo(e2.getEmpName()));
		 employees.forEach(emp->System.out.println(emp.getEmpName()));
	
		 TreeSet<Integer> set=new TreeSet<Integer>();
		 set.add(1);
		 set.add(10);
		 set.add(99);
		 set.add(44);
		 set.add(22);
		 
		 NavigableSet<Integer> treereverse = set.descendingSet();
		  
         
		 
		 treereverse.forEach(System.out::println);
		 
		 
	
	
	}

}
