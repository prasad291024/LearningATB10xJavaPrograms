package Personal_Practice;

public class Employee {
    // 1. Private variables (data hiding)
    private String name;
    private int salary;

    // 2. Getter - Read the value
    public String getName() {
        return name;
    }

    // 3. Setter - Modify the value
    public void setName(String newName) {
        name = newName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        if(newSalary > 0) {
            salary = newSalary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }



    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setSalary(50000);

        System.out.println(emp.getName());    // John
        System.out.println(emp.getSalary());  // 50000
    }

}