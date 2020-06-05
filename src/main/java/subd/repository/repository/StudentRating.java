package subd.repository.repository;




public class StudentRating {

    public StudentRating(String surname, String name, String middleName, String rating) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.rating = rating;
    }

    private String surname;

    private String name;

    private String middleName;

    private String rating;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
