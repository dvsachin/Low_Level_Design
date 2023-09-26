package Design_Patterns.B_Structural_Patterns.ProxyPattern.Example_EmployeeAcessRestriction;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Created a row in the Employee Table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted a row in the Employee Table using employeeId");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("fetched a row from the Employee Table using employeeId");
        return  new Employee();
    }
}
