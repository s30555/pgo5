import java.time.Year;

public class Employee {

    protected String imie;
    protected String nazwisko;
    protected String adres;
    protected String email;
    protected String pesel;
    protected int rokzatrudnienia;

    public Employee(String imieE, String nazwiskoE, String adresE, String emailE, String peselE, int rokzatrudnieniaE) {
        this.imie = imieE;
        this.nazwisko = nazwiskoE;
        this.adres = adresE;
        this.email = emailE;
        this.pesel = peselE;
        this.rokzatrudnienia = rokzatrudnieniaE;
    }


    public int calculateSalary() {
        return 3000 + (Year.now().getValue() - rokzatrudnienia) * 1000;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres=" + adres +
                ", email='" + email + '\'' +
                ", pesel='" + pesel + '\'' +
                ", rokzatrudnienia=" + rokzatrudnienia;
    }
}

