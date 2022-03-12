
public class Animal {

    String food;
    String location;


    public Animal(String food, String location) {

        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Какой звук издает ");
    }

    public void eat() {
        System.out.println("Чем питается");
    }

    public void sleep() {
        System.out.println("Где находится");
    }
}


class Dog extends Animal {
    String name;
    public Dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }


    public void makeNoise() {
        System.out.println("Гав");
    }


    public void eat() {
        System.out.println("Кости");
    }
}
class Cat extends Animal {
    String name;
    public Cat(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }


    public void makeNoise() {
        System.out.println("Мяу");
    }


    public void eat() {
        System.out.println("Мышей");
    }
}
class Horse extends Animal {
    String name;
    public Horse(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }


    public void makeNoise() {
        System.out.println("Иго-го");
    }


    public void eat() {
        System.out.println("Сено");
    }
}
class Veterian {
    void treatAnimal(Animal animal) {
        System.out.print(animal.food + " ");
        System.out.println(animal.location);
    }
}
class Main {
    public static void main(String[] msi) {
        Veterian vet = new Veterian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Тузик", "Кости", "На улице");
        animals[1] = new Cat("Мурка", "Мышей", "Дома");
        animals[2] = new Horse("Яблочко", "Сено", "Конюшня");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}