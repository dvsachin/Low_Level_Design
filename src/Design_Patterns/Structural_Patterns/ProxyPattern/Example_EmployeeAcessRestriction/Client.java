package Design_Patterns.Structural_Patterns.ProxyPattern.Example_EmployeeAcessRestriction;

public class Client {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("ADMIN", new Employee());
            System.out.println("Operation Successful");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
