package subd.repository.repository;

public class TeachersgetByTelefon {

    private Integer id;

    private String surname;

    private String name;

    private String middleName;

    private String academicSubjects;

    private String telephone;

    public TeachersgetByTelefon(Integer id, String surname, String name, String middleName, String academicSubjects, String telephone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.academicSubjects = academicSubjects;
        this.telephone = telephone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getAcademicSubjects() {
        return academicSubjects;
    }

    public void setAcademicSubjects(String academicSubjects) {
        this.academicSubjects = academicSubjects;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
