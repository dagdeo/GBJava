

public class Main {

    public static void main(String[] args) {
        Animals cat1 = new Cats("Барсик");
        Animals dog1 = new Dogs("Рэкс");
        Animals dog2 = new Dogs("Кусь");
        Animals cat2 = new Cats("Пушистик");
        Animals cat3 = new Cats("Блохастик");
        Animals dog3 = new Dogs("Чемпион");

        //(бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
        //плавание: кот не умеет плавать, собака 10 м.)

        cat1.jump(1);
        cat1.swim(20);
        cat1.run(100);
        dog1.jump(0.9);
        dog1.run(400);
        dog3.jump(0.4);
        cat3.jump(0.1);
        cat2.jump(3.1);
        dog2.swim(300);
    }
}
