public class Animals {
    /*
    1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу
 передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
(Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м.,
у другой 600 м.
     */

    private String name;
    private int animalRun;
    private int animalSwim;
    private double animalJump;

    public String getName() {
        return name;
    }

    public void setAnimalRun(int animalRun) {
        this.animalRun = animalRun;
    }

    public void setAnimalSwim(int animalSwim) {
        this.animalSwim = animalSwim;
    }

    public void setAnimalJump(double animalJump) {
        this.animalJump = animalJump;
    }

    public Animals(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Кличка животного = " + name+ " Дистанция бега = " + animalRun + " Дистанция плавания = " + animalSwim + " Высота прыжка = "
        + animalJump);
    }

    public void jump(double jumpHight){//Животное прыгает
        System.out.println();
        if (jumpHight <= animalJump){
            System.out.println("Животное " + name + " перепрыгнуло препятствие высотой " + jumpHight + " м");
        } else {
            System.out.println("Животное " + name + " не преодолело препятствие и сошло с дистанции");
        }
    //для вывода true или false необходим метод с return(jumpHight <= animalJump);
    }

    public void swim(int swimDistance){//животное плывет
        System.out.println();
        if (swimDistance <= animalSwim){
            System.out.println("Животное " + name + " переплыло препятствие длиной" + swimDistance + " м");
        } else {
            System.out.println("Животное " + name + " не преодолело препятствие и сошло с дистанции");
        }
    }

    public void run(int runDistance){//животное плывет
        System.out.println();
        if (runDistance <= animalRun){
            System.out.println("Животное " + name + " успешно пробежало " + runDistance + " м");
        } else {
            System.out.println("Животное " + name + " не преодолело препятствие и сошло с дистанции");
        }
    }
}
