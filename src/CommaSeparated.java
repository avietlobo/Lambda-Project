import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommaSeparated commaSeparated = new CommaSeparated();
		List<Integer> list = Arrays.asList(3, 44);
		commaSeparated.getString(list);

	}

	public String getString(List<Integer> list) {

		String output = list.stream().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
		System.out.println(output);
		return output;
	}

}
