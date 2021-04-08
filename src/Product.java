import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	
	private String name;
	private int price;
	private String category;
	private String grade;
	
	

	public Product(String name, int price, String category, String grade) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.grade = grade;
	}

	
	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getGrade() {
		return grade;
	}



	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + ", grade=" + grade + "]";
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products= Arrays.asList(new Product("Colgate",83,"Health","A"),new Product("Mobile Charger",8000,"Electronics","C"),new Product("Amway",1500,"Health","AA"));
		List<Product> output=products.stream().filter(i -> i.getPrice() > 1000).collect(Collectors.toList());
		List<Product> output2=products.stream().filter(i -> i.getCategory().equalsIgnoreCase("Electronics")).collect(Collectors.toList());
		List<String> output3=products.stream().filter(i -> i.getCategory().equalsIgnoreCase("Electronics")).filter(i -> i.getPrice() > 1000).map(i -> i.getName().toUpperCase()).collect(Collectors.toList());
		long value=products.stream().count();

		
		output.forEach(System.out::println);
		output2.forEach(System.out::println);
		output3.forEach(System.out::println);
		System.out.println(value);

	}

}
