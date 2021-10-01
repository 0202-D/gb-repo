public class Cat extends Animals {
    private String name;

    static int catCounter = 0;

    public Cat(int maxRun, String name) {
        super(maxRun, -1);
        this.name = name;
        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }

    @Override
    void run(int distance) {
        if (distance <= getMaxRun()) {
            System.out.println(this.name + " пробежал " + distance + " метров");
        } else {
            System.out.println(this.name + " не побежал");
        }
    }
    @Override
    void swim(int distance) {
        System.out.println("Коты не плавают!");

    }

   public static void printCatCounter() {
        System.out.println("Котов у нас " + catCounter);

    }
}
