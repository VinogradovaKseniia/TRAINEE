public class Cat extends Animal {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    boolean fullness = false;
    int appetit;

    public Cat(String name) {
        super(name);
        ++count;

        appetit = (int) (10 + Math.random() * 20);
    }

    @Override
    public void run(int distance) {
        distance = Math.min(distance, 200);
        System.out.println(name + " пробежал(а) " + distance + "м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public void printInfo() {
        System.out.println(name + ":" + " аппетит " + appetit);
        if (!fullness) {
            System.out.println(name + ":" + " голоден");
        } else {
            System.out.println(name + ":" + " сыт");
        }
    }

    public void eat(Bowl bowl) {
        boolean result = bowl.giveFood(appetit);
        if (result) {
            fullness = true;
        }
    }
}
