package frida13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 =new Employee("shonah", 40.0f, 20.00);
        employee1.calculatePay();
        Employee employee2  =new Employee("chad", 50.0f, 20.00);
        employee1.calculatePay();


        System.out.println(employee1);
        System.out.println(employee2);
    }
}
