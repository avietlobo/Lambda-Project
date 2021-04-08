
public class Employee {

	private int empId;
	private String empName;
	private int empPhone;
	public int getEmpId() {
		return empId;
	}
	public Employee(int empId, String empName, int empPhone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(int empPhone) {
		this.empPhone = empPhone;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + "]";
	}
	
	
}
