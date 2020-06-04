package subd.repository.repository;




public class StudentRating {

    public StudentRating(String surname, String name, String middle_name, String rating) {
        this.surname = surname;
        this.name = name;
        this.middle_name = middle_name;
        this.rating = rating;
    }

    private String surname;

    private String name;

    private String middle_name;

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

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
