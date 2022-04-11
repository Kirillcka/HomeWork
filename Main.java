import com.sun.org.apache.xalan.internal.xsltc.dom.MultiValuedNodeHeapIterator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(
                "Ivanov",
                "Ivan",
                "Ivanovich",
                "ivan@mulo.by",
                37533555,
                1000,
                "Engineer",
                41
        );

        Employee employee2 = new Employee(
                "Pupkin",
                "Igor",
                "Ivanovich",
                "pupkin@mulo.by",
                3753355,
                1200,
                "Engineer",
                40
        );

        Employee employee3 = new Employee(
                "Makarov",
                "Stas",
                "Ivanovich",
                "makarov@mulo.by",
                3753333,
                1300,
                "Engineer tehnolog",
                32
        );

        Employee employee4 = new Employee(
                "Titov",
                "Kirill",
                "Ivanovich",
                "titov@mulo.by",
                3753355,
                3000,
                "Engineer",
                25
        );

        Employee employee5 = new Employee(
                "Piterskiy",
                "Oleg",
                "Stepanovich",
                "piterskiy@mulo.by",
                3753355,
                1100,
                "Engineer tehnolog1",
                45
        );
        System.out.println("Сотрудник1 : " + employee1.getFamilyName() + " " + employee1.getName() + " " + employee1.getPatronymic() + " " + employee1.getEmail() + " " + employee1.getPhoneNum() + " " + employee1.getSalary() + " " + employee1.getProfession() + " " + employee1.getAge());
        System.out.println("Сотрудник2 : " + employee2.getFamilyName() + " " + employee2.getName() + " " + employee2.getPatronymic() + " " + employee2.getEmail() + " " + employee2.getPhoneNum() + " " + employee2.getSalary() + " " + employee2.getProfession() + " " + employee2.getAge());
        System.out.println("Сотрудник3 : " + employee3.getFamilyName() + " " + employee3.getName() + " " + employee3.getPatronymic() + " " + employee3.getEmail() + " " + employee3.getPhoneNum() + " " + employee3.getSalary() + " " + employee3.getProfession() + " " + employee3.getAge());
        System.out.println("Сотрудник4 : " + employee4.getFamilyName() + " " + employee4.getName() + " " + employee4.getPatronymic() + " " + employee4.getEmail() + " " + employee4.getPhoneNum() + " " + employee4.getSalary() + " " + employee4.getProfession() + " " + employee4.getAge());
        System.out.println("Сотрудник5 : " + employee5.getFamilyName() + " " + employee5.getName() + " " + employee5.getPatronymic() + " " + employee5.getEmail() + " " + employee5.getPhoneNum() + " " + employee5.getSalary() + " " + employee5.getProfession() + " " + employee5.getAge());
        System.out.println(" ");
        System.out.println("Сотрудники старше 40: ");
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40)
                System.out.println(employees[i].getFamilyName() + " " + employees[i].getName() + " " + employees[i].getPatronymic() + " " + employees[i].getEmail() + " " + employees[i].getPhoneNum() + " " + employees[i].getSalary() + " " + employees[i].getProfession() + " " + employees[i].getAge());
        }
    }
}


