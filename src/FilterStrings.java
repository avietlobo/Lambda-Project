import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("aviet","abc","bob","tom","ABC");
		FilterStrings filterStrings=new FilterStrings();
		filterStrings.search(list);
	}
	
	
	public List<String> search(List<String> list) {
		List<String> output=list.stream().filter(s->s.startsWith("a")&&s.length()==3).collect(Collectors.toList());
		System.out.println(output);
		return output;

	}


}
