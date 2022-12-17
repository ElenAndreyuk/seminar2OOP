public class Otter extends Animal implements Swimable, Runable, Speakable{
    public Otter(String name, int paws, String owner) {
        super(name, paws, owner);
    }

    @Override
    public int runSpeed() {
        return 6;
    }

    @Override
    public String speak() {
        return "firfir";
    }

    @Override
    public int swimSpeed() {
        return 15;
    }
}
