public class Dog extends Animal {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Dog(String name) {
        super(name);
        ++count;
    }

    @Override
    public void run(int distance) {
        distance = Math.min(distance, 500);
        System.out.println(name + " пробежал(а) " + distance + "м.");
    }

    @Override
    public void swim(int distance) {
        distance = Math.min(distance, 10);
        System.out.println(name + " проплыл(а) " + distance + "м.");

    }
}
