import java.util.Random;
public class Cats extends Animals{
    // задаем параметры кота

    /* Без разброса ограничений каждого животного
        private int catsRun = 200;
        private int catsSwim = 0;
        private double catsJump = 2;
    */

    //С разбросом ограничений каждого животного

    Random random = new Random();
    private int catsRun = random.nextInt(100) + 150;
    private int catsSwim = 0;
    private double catsJump = random.nextDouble() +2;

    public Cats(String name){
        super(name);
        setAnimalRun(catsRun);
        setAnimalJump(catsJump);
        setAnimalSwim(catsSwim);
    }


    @Override
    public void swim(int swimDistance) {//Коты не умеют плавать
        System.out.println();
        System.out.println("К сожалению коты не умеют плавать. Ваш питомец " + getName() + " утонул :(");
    }

}
