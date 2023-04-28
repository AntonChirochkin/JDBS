public class Application {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        System.out.println(employeeDAO.getAllEmployee());
        Employee employee = new Employee(1, "Alexander", "Mirov", "man", 59, new City(1,"Moscow"));
        employeeDAO.add(employee);
        System.out.println(employeeDAO.getAllEmployee());
        System.out.println();
        employee.setFirst_name("Kirill");
        employeeDAO.updateEmployee(4, employee);
        System.out.println(employeeDAO.getById(4));
        employeeDAO.deleteEmployee(5);
        System.out.println();
        System.out.println(employeeDAO.getAllEmployee());

//        List<Employee> employees = employeeDAO.getOneEmployee();
//
//        for (Employee employee : employees) {
//            System.out.println("id: " + employee.getId());
//            System.out.println("first_name: " + employee.getFirst_name());
//            System.out.println("last_name: " + employee.getLast_name());
//            System.out.println("gender: " + employee.getGender());
//            System.out.println("age: " + employee.getAge());
//            System.out.println("city_id: " + employee.getCity());
//        }
    }
}
