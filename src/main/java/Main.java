import java.util.Comparator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Employee employee1 = new Employee("naila", "Quddus", "nailaquddus@gmail.com");
        Employee employee2 = new Employee("Ajmal", "jameel", "ajmalsaeed@yahoo.com");
        Employee employee3 = new Employee("SAAD", "saadi", "saadi_56@yahoo.com");
        Employee employee4 = new Employee("Hassan", "wajahi", "hassan-23@yahoo.com");
        Employee employee5 = new Employee("Ali", "ghulam", "alighulam@gmail.com");
        Employee employee6 = new Employee("John", "Murtaza", "johan@hotmail.com");
        Employee employee7 = new Employee("Asghar", "Gul", "gul@yahoo.com");
        dao.addEmployee(employee1);
        dao.addEmployee(employee2);
        dao.addEmployee(employee3);
        dao.addEmployee(employee4);
        dao.addEmployee(employee5);
        dao.addEmployee(employee6);
        dao.addEmployee(employee7);
        //dao.deleteEmployee();
       // dao.updateEmployeeById( );
        Optional<Employee>employee=dao.getEmployeeById(1);
        if(employee.isPresent()) {
            System.out.println("Employee found: " + employee.get());
        }else
        {
            System.out.println("Employee not found ");
        }
        System.out.println("************* List of all Employees **********************");
        dao.updateEmployeeById(2,new Employee("Ajmal","jameel","ajmalsaeed@yahoo.com"));
        dao.getAllEmployees().stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);




    }
}
