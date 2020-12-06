public class Employee {
    String id, name;
    Integer salary;

    public Employee(String id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "\nID: "+this.id+"\nName: "+this.name+"\nSalary: "+this.salary;
    }
}
