import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Manager extends Employee {

    private List<Goal> goals;

    public Manager(String imieM, String nazwiskoM, String adresM, String mailM, String peselM, int rokzatrudnieniaM) {
        super(imieM, nazwiskoM, adresM, mailM, peselM, rokzatrudnieniaM);
        goals = new ArrayList<>();
    }

    public void addGoals(Goal g) {
        goals.add(g);
    }
    public int calculateSalary() {
        int bonus = 0;

        for(Goal goal : goals) {
            if(goal.isFinishedOnTime())  bonus += goal.getBonus();
        }

        return super.calculateSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", goals=" + goals + "}";
    }

    public List<Goal> getGoals() {
        return goals;
    }
}

