package Personal_Practice;

public class Employee1 {
    // 1. Private variables (data hiding)
    private String name1;
    private int salary1;

    // 2. Getter - Read the value
    public String getName() {
        return name1;
    }

    // 3. Setter - Modify the value
    public void setName(String newName) {
        name1 = newName;
    }

    public int getSalary() {
        return salary1;
    }

    public void setSalary(int newSalary) {
        salary1 = newSalary;
    }



    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.setName("John");
        emp.setSalary(50000);

        System.out.println(emp.getName());    // John
        System.out.println(emp.getSalary());  // 50000
    }

}