public class Bowl {
    private int food = 0;

    public void addFood(int x) {
        food = food + x;
    }

    boolean giveFood(int value) {
        if (food >= value) {
            food = food - value;
            return true;
        } else {
            return false;
        }
    }
}
