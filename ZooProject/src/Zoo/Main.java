package Zoo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> zoo = new ArrayList<>();
        while (true) {
            System.out.println("ЗООПАРК ЛОО");
            System.out.println("1. Добавить животное");
            System.out.println("2. Показать всех животных");
            System.out.println("3. Подать голос");
            System.out.println("4. Показать животных по категориям");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            int c = sc.nextInt(); sc.nextLine();
            if (c == 0) break;
            switch (c) {
                case 1: addAnimal(sc, zoo); break;
                case 2: showAllAnimals(zoo); break;
                case 3: makeSound(zoo); break;
                case 4: showByCategory(zoo); break;
                default: System.out.println("Неверный выбор!");
            }
        }
        System.out.println("До свидания!");
    }
    
    private static void addAnimal(Scanner sc, List<Animal> zoo) {
        System.out.print("Имя животного: ");
        String name = sc.nextLine();
        System.out.println("Выберите категорию:");
        System.out.println("1. Млекопитающие");
        System.out.println("2. Птицы");
        System.out.println("3. Рептилии");
        System.out.println("4. Рыбы");
        System.out.println("5. Насекомые");
        System.out.print("Категория: ");
        int category = sc.nextInt(); sc.nextLine();
        
        switch (category) {
            case 1: 
                System.out.print("Тип (dog/cat/lion): ");
                String type = sc.nextLine().toLowerCase();
                if (type.equals("dog")) zoo.add(new Dog(name));
                else if (type.equals("cat")) zoo.add(new Cat(name));
                else if (type.equals("lion")) zoo.add(new Lion(name));
                else System.out.println("Неизвестный тип!");
                break;
            default:
                System.out.println("Другие категории можно добавить позже!");
        }
    }
    
    private static void showAllAnimals(List<Animal> zoo) {
        if (zoo.isEmpty()) {
            System.out.println("Зоопарк пуст!");
        } else {
            System.out.println("ВСЕ ЖИВОТНЫЕ В ЗООПАРКЕ ");
            for (int i = 0; i < zoo.size(); i++) {
                Animal animal = zoo.get(i);
                System.out.println((i + 1) + ". " + animal.getClass().getSimpleName() + " - " + animal.getName());
            }
        }
    }
    
    private static void makeSound(List<Animal> zoo) {
        if (zoo.isEmpty()) {
            System.out.println("Животных нет!");
        } else {
            System.out.println("ЖИВОТНЫЕ ПОДАЮТ ГОЛОС ");
            for (Animal animal : zoo) {
                animal.sound();
            }
        }
    }
    
    private static void showByCategory(List<Animal> zoo) {
        System.out.println("Эта функция в разработке!");
    }
}
