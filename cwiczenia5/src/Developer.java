import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

    public class Developer extends Employee {

        private Set<Technology> technologies;
        public Developer(String imieD, String nazwiskoD, String adresD, String mailD, String peselD, int rokzatrudnieniaD) {
            super(imieD, nazwiskoD, adresD, mailD, peselD, rokzatrudnieniaD);
            technologies = new HashSet<>();
        }

        @Override
        public int calculateSalary () {
            int bonusSal = 0;

            for(Technology tech : technologies) {
                bonusSal += tech.getValue();
            }

            return super.calculateSalary() + bonusSal;
        }

        public void addTechnology(Technology technology) {
            technologies.add(technology);
        }

        @Override
        public String toString() {
            return super.toString() + ", technologies=" + Arrays.toString(technologies.toArray()) + "}";
        }

        public Set<Technology> getTechnologies() {
            return technologies;
        }
    }

