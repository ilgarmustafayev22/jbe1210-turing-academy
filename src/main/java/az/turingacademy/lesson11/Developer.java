package az.turingacademy.lesson11;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        double bonus = super.calculateBonus(percentage);
        return super.getSalary() + bonus;
//        double finalSalary = super.getSalary() * percentage;
//        return finalSalary;
    }

    @Override
    public double calculateBonus(double percentage) {
        return super.calculateBonus(percentage);
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", programmingLanguage: " + programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{programmingLanguage='%s'}".formatted(programmingLanguage);
    }

}
