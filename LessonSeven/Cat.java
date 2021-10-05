public class Cat {
    private String name;
    private int hungry;
    private boolean satiety;

    public Cat(String name, int hungry) {
        this.name = name;
        this.hungry = hungry;
    }
    public void eating(Plate plate) {
        if (plate.degreaseFood(hungry)) {
            satiety = true;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", hungry=" + hungry +
                ", satiety=" + satiety +
                '}';
    }
}
