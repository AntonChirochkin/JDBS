import java.util.List;

public interface EmployeeDAO {
    // добавить сущность
    void add(Employee employee);

    // получить сущность по id
    Employee getById(int id);

    // обновить данные из таблицы
    void updateEmployee(int id, Employee employee);

    // удалить сущность по id
    void deleteEmployee(int id);

    // получить всю инфу из таблицы
    List<Employee> getAllEmployee();
}
