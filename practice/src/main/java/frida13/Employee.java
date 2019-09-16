package frida13;

public class Employee {
    //public class Fake                     this is the class
    public String name;
    public float hoursWorked;
    public double hourlyRate;

    public Employee(String name, float hoursWorked, double hourlyRate) {
        ;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }
    public void calculatePay(){
        System.out.println(hourlyRate * hoursWorked);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}