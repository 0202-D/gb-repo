

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Ivanov Ivan  ", "Ingineer",
                "vanja@gmail.com", "89215436475", 45000, 52);
        persons[1] = new Person("Petrov Dmitriy", "Java Developer", "nevermind1979@mail.ru", "892135471290", 200000, 42);
        persons[2] = new Person("Svistunova Ekaterina", "Manager", "sweet.mail.ru", "89111234567", 55000, 28);
        persons[3] = new Person("Krutov Alexander", "Java Developer", "bigboss@mail.ru", "89049872561", 180000, 35);
        persons[4] = new Person("Zavjalova Julia", "Manager", "pretty@jandex.ru", "89111110908", 55000, 32);
        for (Person person : persons) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}

