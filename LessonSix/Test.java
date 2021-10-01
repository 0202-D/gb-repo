

public class Test {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cat(200, "Tom"), new Dog(500, 10, "Pluto"),
                new Dog(500, 10, "Rex")};

        for (Animals animal : animals) {
            animal.run(150);
            animal.swim(5);
        }
        Animals.printAnimalCounter();
        Dog.printDogCounter();
        Cat.printCatCounter();
    }

}
