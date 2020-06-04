package subd.repository.repository;

public class TeachersgetByTelefon {

    private Integer id;

    private String surname;

    private String name;

    private String middle_name;

    private String academic_subjects;

    private String telephone;

    public TeachersgetByTelefon(Integer id, String surname, String name, String middle_name, String academic_subjects, String telephone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middle_name = middle_name;
        this.academic_subjects = academic_subjects;
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

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getAcademic_subjects() {
        return academic_subjects;
    }

    public void setAcademic_subjects(String academic_subjects) {
        this.academic_subjects = academic_subjects;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
