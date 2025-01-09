public abstract class Animal {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    protected String name;

    public Animal(String name) {
        this.name = name;
        ++count;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
