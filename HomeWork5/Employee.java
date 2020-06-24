import java.util.PriorityQueue;

public class Employee {
    /*
     * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * Конструктор класса должен заполнять эти поля при создании объекта;
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     * Создать массив из 5 сотрудников
     */


        private String lastname; //фамилия
        private String name; //имя
        private String patronymic; //отчество
        private String position; //должность
        private String email; //email
        private long phoneNumber; //номер телефона
        private double salary; //зарплата
        private int age; //возраст
        private int id;

    public Employee(String lastname, String name, String patronymic, String position, String email,
                    long phoneNumber, double salary, int age){
            this.lastname = lastname;
            this.name = name;
            this.patronymic = patronymic;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
            id++;
    }

    public void employeeInfo() {
            System.out.println(lastname + " " + name + " " + patronymic);
            System.out.println("Должность " + position);
            System.out.println("Электронная почта " + email);
            System.out.println("Номер телефона " + phoneNumber);
            System.out.println("Зарплата " + salary);
            System.out.println("Возраст " + age);
            System.out.println();
    }

    public String getLastname () {
            return lastname;
    }

    public String getName () {
            return name;
    }

    public String getPatronymic () {
            return patronymic;
    }

    public String getEmail () {
            return email;
    }

    public long getPhoneNumber () {
            return phoneNumber;
    }

    public double getSalary () {
            return salary;
    }

    public int getAge () {
            return age;
    }

    public int getId() {
            return id;
    }
}

