package level2.exercise1;


@JsonSerializable(directory="output/json")
public abstract class Worker {
    private String name;
    private String lastName;
    private double hourPrice;

    public Worker (String name, String lastName, double hourPrice) {
        this.name = name;
        this.lastName = lastName;
        this.hourPrice = hourPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hourPrice=" + hourPrice +
                '}';
    }

    public abstract double calculateSalary(int workedHours);

    public abstract void oldMethod(int workedHours);
}
