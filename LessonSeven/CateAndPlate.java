public class CateAndPlate {
    public static void main(String[] args) {
Cat [] cats = {new Cat("Tom",2),new Cat("Black",1),new Cat("Bad",5),
new Cat("Fat",7)};
Plate plate =new Plate();
        for (Cat value : cats) {
            value.eating(plate);
        }
        for (Cat value : cats) {
            System.out.println(value);
        }
        System.out.println(plate);
        plate.plateIncrease(7);
        System.out.println(plate);
    }
}
