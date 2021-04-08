import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] array= {"hello","ai","end"};
		Stream<String> stream=Arrays.stream(array);
//		List<String> listSortedLengthAsc=stream.sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());
//		List<String> list=stream.sorted((s1,s2)->s1.charAt(0)-s2.charAt(0)).collect(Collectors.toList());
//		List<String> list=stream.sorted(Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1))).collect(Collectors.toList());

		String[] sorted = Arrays.stream(array)
		        .collect(Collectors.groupingBy
		                (w -> w.startsWith("e") ? 0 : 1))
		        .values().stream().flatMap(List::stream)
		        .toArray(String[]::new);

		for (String s: sorted) {
		  System.out.println(s);
		}
		
		
//		stream.close();
//		Stream<String> stream1=Arrays.stream(array);
//		List<String> listSortedLengthDesc=stream1.sorted((s1,s2)->s2.length()-s1.length()).collect(Collectors.toList());
//		stream.close();
//		System.out.println(list);		
//		System.out.println(listSortedLengthDesc);

		
		

	}

}
