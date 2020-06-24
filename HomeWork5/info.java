public class info {

    public static void main(String[] args) {

        Employee CEO;


        //Заводим сотрудников через конструктор
        //(String lastname, String name, String patronymic, String position, String email,
        //int phoneNumber, double salary, int age)

        CEO = new Employee("Ахмедов", "Дауд", "Идрисович", "Генеральный директор",
                "adi@company.com", 123456789, 900550.98, 35);


        CEO.employeeInfo();

        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Магомедов", "Магомед", "Магомедович", "Системный администратор",
                "mmm@company.com", 123450505, 100550.98, 45);
        persArray[1] = new Employee("Вагабова", "Джамиля", "Арcеновна", "Дизайнер",
                "vda@company.com", 123451010, 500550.98, 35);
        persArray[2] = new Employee("Максудов", "Шамсудтин", "Альбертович", "Управляющий",
                "msha@company.com", 123452020, 400550.98, 47);
        persArray[3] = new Employee("Шамиль", "Мусаев", "Ибрагимович", "Программист", "shmi@company.com",
                123455555, 400080.95, 28);
        persArray[4] = new Employee("Мурадов", "Марат", "Ахмедович", "Главный инженер",
                "mma@company.com", 123459999, 300550.98, 35);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].employeeInfo();
            }
        }

    }
}
