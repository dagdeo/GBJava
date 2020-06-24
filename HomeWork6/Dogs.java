import java.util.Random;
public class Dogs extends Animals {
    // задаем параметры собак
    //(бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
    //плавание: кот не умеет плавать, собака 10 м.).
    /*
    private int dogsRun = 500;
    private int dogsSwim = 10;
    private double dogsJump = 0.5;
    */

    Random random = new Random();
    private int dogsRun = random.nextInt(250) + 400;
    private int dogsSwim = 10;
    private double dogsJump = random.nextDouble() * 1 + 0.5;

    public Dogs(String name){
        super(name);
        setAnimalRun(dogsRun);
        setAnimalJump(dogsJump);
        setAnimalSwim(dogsSwim);
    }
}


