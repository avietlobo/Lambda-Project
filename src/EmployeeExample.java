import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeExample {

	private String name;
	private int account;
	private int salary;

	public EmployeeExample(String name, int account, int salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeExample [name=" + name + ", account=" + account + ", salary=" + salary + "]";
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeeExample> list=new ArrayList<>();
		list.add(new EmployeeExample("Aviet", 101, 10000));
		list.add(new EmployeeExample("Ashton", 102, 40000));
		list.add(new EmployeeExample("Simon", 108, 46784));
		list.add(new EmployeeExample("Rahul", 111, 5775));
		
		String[] array=list.stream().map(EmployeeExample::getName).toArray(String[]::new);
		System.out.println(Arrays.asList(array));


	}

}
