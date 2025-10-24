public class Doctor {
    private String name;
    private double salary;

    public Doctor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public void applyBonus() {
        salary += calculateBonus();
    }

    public void displayInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
