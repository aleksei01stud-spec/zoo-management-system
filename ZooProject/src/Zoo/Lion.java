package Zoo;

public class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }
    
    @Override
    public void sound() {
        System.out.println(name + " говорит: Р-р-р-р!");
    }
}
