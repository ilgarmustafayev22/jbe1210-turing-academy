package az.turingacademy.lesson11;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        return super.calculateBonus(percentage);
    }

    @Override
    public double calculateBonus(double percentage) {
        return super.calculateBonus(percentage);
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", teamSize: " + teamSize;
    }

    @Override
    public String toString() {
        return "Manager{teamSize=%d}".formatted(teamSize);
    }

}
