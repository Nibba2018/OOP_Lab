import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager{
    ArrayList<Employee> employees = new ArrayList<Employee>();


    public void addEmployee(String id, String name, Integer salary){
        this.employees.add(new Employee(id, name, salary));
    }

    public void removeEmployee(String id){
        boolean removed = false;
        for(int i = 0; i < this.employees.size();) {
            if(this.employees.get(i).id.equals(id)){
                this.employees.remove(i);
                removed = true;
                break;
            }
        }

        if(!removed)
            System.out.println("Employee not found.");
    }

    public boolean empExists(String id){
        boolean found = false;
        for(int i = 0; i < this.employees.size(); i++) {
            if(this.employees.get(i).id.equals(id)){
                found = true;
                break;
            }
        }

        return found;
    }

    public void listEmployees(){
        for(Employee e : this.employees)
            System.out.println(e);
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        int choice;
        boolean quit = false;

        while(!quit){
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add Employee\n2. Remove Employee");
            System.out.println("3. Search Employee\n4. List Employee");
            System.out.print("5. Quit:");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:{
                    System.out.print("Enter ID:");
                    String id = sc.nextLine();
                    System.out.print("Enter Name:");
                    String name = sc.nextLine();
                    System.out.print("Enter salary:");
                    Integer salary = Integer.parseInt(sc.nextLine());

                    manager.addEmployee(id, name, salary);
                }break;

                case 2:{
                    System.out.print("Enter ID:");
                    String id = sc.nextLine();

                    manager.removeEmployee(id);
                }break;

                case 3:{
                    System.out.print("Enter ID:");
                    String id = sc.nextLine();

                    if(manager.empExists(id))
                        System.out.println("Employee exists.");
                    else
                        System.out.println("Employee does not exist.");
                }break;

                case 4:{
                    manager.listEmployees();
                }break;

                case 5:{
                    System.out.println("Exiting...");
                    quit = true;
                }break;
                default:
                    System.out.println("Invalid Input.");
            }
        }
        sc.close();
    }
}
