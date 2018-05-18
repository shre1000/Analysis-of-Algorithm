

public class Employee {
	
	private String name;
	private String id;
	private int salary;
	
	public Employee(){
		name = "";
		id = "";
		salary = 0;
		
		}
		
		
		public void setName(String Name){
		name = Name;
		}
		
		public void setId(String Id){
		id = Id;
		}
		
		public void setSalary(int Salary){
		salary = Salary;
		}
		
		public String getName(){
		return name;
		}
		
		public String getId(){
		return id;
		}
		
		public int getSalary(){
		return salary;
		}
	}
