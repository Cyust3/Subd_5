package subd.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import subd.repository.entity.*;
import subd.repository.repository.*;
import subd.repository.service.serviceInterfaces.*;

import java.sql.Timestamp;
import java.util.List;

@SpringBootApplication
public class Application {

    private AcademicPerformanceRepository academicperformanceRepository;
    private AcademicgroupRepository academicgroupRepository;
    private DirectoryItemsRepository directoryitemsRepository;
    private StudentRepository studentRepository;
    private TeachersRepository teachersRepository;

    private AcademicgroupService academicgroupService;
    private AcademicPerformanceService academicPerformanceService;
    private DirectoryItemsService directoryItemsService;
    private StudentService studentService;
    private TeachersService teachersService;

    public Application() {
    }
@Autowired
    public Application(AcademicPerformanceRepository academicperformanceRepository,
                       AcademicgroupRepository academicgroupRepository,
                       DirectoryItemsRepository directoryitemsRepository,
                       StudentRepository studentRepository,
                       TeachersRepository teachersRepository,
                       AcademicgroupService academicgroupService,
                       AcademicPerformanceService academicPerformanceService,
                       DirectoryItemsService directoryItemsService,
                       StudentService studentService,
                       TeachersService teachersService) {
        this.academicperformanceRepository = academicperformanceRepository;
        this.academicgroupRepository = academicgroupRepository;
        this.directoryitemsRepository = directoryitemsRepository;
        this.studentRepository = studentRepository;
        this.teachersRepository = teachersRepository;
        this.academicgroupService = academicgroupService;
        this.academicPerformanceService = academicPerformanceService;
        this.directoryItemsService = directoryItemsService;
        this.studentService = studentService;
        this.teachersService = teachersService;
    }

    public static void main(String[] args){

        SpringApplication.run(Application.class,args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void onStart() {


        this.readAcademicgroup();
        this.readAcademicPerformance();
        this.readDirectoryItems();
        this.readStudent();
        this.readTeachers();
        //this.firstRequest();
        //this.secondRequest();
        //this.thirdRequest();

    }

    private void readAcademicgroup() {
        for (Academicgroup academicgroup : academicgroupService.getAll()) {
            System.out.println(academicgroup);
        }
    }

    private void readAcademicPerformance(){
        for(AcademicPerformance academicPerformance : academicPerformanceService.getAll()){
            System.out.println(academicPerformance);
        }
    }

    private void readDirectoryItems(){
        for (DirectoryItems directoryItems : directoryItemsService.getAll()){
            System.out.println(directoryItems);
        }
    }

    private void readStudent(){
        for(Student student : studentService.getAll()){
            System.out.println(student);
        }
    }

    private void readTeachers(){
        for(Teachers teachers : teachersService.getAll()){
            System.out.println(teachers);
        }
    }

    public void firstRequest(){
        Timestamp start = new Timestamp(System.currentTimeMillis());
        System.out.println(teachersService.getAll());
        Timestamp end = new Timestamp(System.currentTimeMillis());
        System.out.println("Request time: " + (end.getTime() - start.getTime()) + " ms");
    }

    public void secondRequest(){
        Timestamp start = new Timestamp(System.currentTimeMillis());
        List<TeachersgetByTelefon> resultFirst = teachersRepository.teachers();
        Timestamp end = new Timestamp(System.currentTimeMillis());
        System.out.println("Request time: " + (end.getTime() - start.getTime()) + " ms");

        resultFirst.forEach(TeachersgetByTelefon -> {
            System.out.print("id: " + TeachersgetByTelefon.getId() + " ");
            System.out.print("Фамилия: " + TeachersgetByTelefon.getSurname() + " ");
            System.out.print("Имя: " + TeachersgetByTelefon.getName() + " ");
            System.out.print("Отчество: " + TeachersgetByTelefon.getMiddleName() + " ");
            System.out.print("Предметы: " + TeachersgetByTelefon.getAcademicSubjects() + "  ");
            System.out.println("Телефон: " + TeachersgetByTelefon.getTelephone() + "  ");
        });
    }

    public void thirdRequest() {
		Timestamp start = new Timestamp(System.currentTimeMillis());
		List<StudentRating> resultFirst = studentRepository.studets();
		Timestamp end = new Timestamp(System.currentTimeMillis());
        System.out.println("Request time: " + (end.getTime() - start.getTime()) + " ms");

        resultFirst.forEach(StudentRating -> {
			System.out.print("Фамилия: " + StudentRating.getSurname() + " ");
			System.out.print("Имя: " + StudentRating.getName() + " ");
            System.out.print("Отчество: " + StudentRating.getMiddleName() + " ");
            System.out.println("Оценка: " + StudentRating.getRating() + "  ");
		});
	}
}
