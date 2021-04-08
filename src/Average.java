import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list=Arrays.asList(10,20,30,40);
		
		//Compute average using streams
		
		double d=list.stream().mapToInt(i->i).average().getAsDouble();
		System.out.println(d);
		
		List<Integer> output=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(output);
		
		//Compute average using Lambda expression
		
		AverageCalc avg= l -> {
			int sum=0;
			double average;
			for(int element:l) {
				sum=sum + element;
				
			}
			average=sum/list.size();
			System.out.println("Average is "+average);
			return (int) average;
			
		};
		
		avg.compute(list);

	}
	
	
	@FunctionalInterface
	interface AverageCalc{
		int compute(List<Integer> list);
	}


}
