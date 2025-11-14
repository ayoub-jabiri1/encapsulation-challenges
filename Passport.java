import java.sql.Statement;

public class Passport {
    private int number;
    private String nationality;
    private String expirationDate;

    Passport(int number, String nationality, String expirationDate) {
        this.number = number;
        this.nationality = nationality;
        this.expirationDate = expirationDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String newNationality) {
        this.nationality = newNationality;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String newExpirationDate) {
        this.expirationDate = newExpirationDate;
    }
}
