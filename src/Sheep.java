public class Sheep extends Animals{
    public Sheep() {
    }

    public Sheep(int weight, int age, String gender, String nickname) {
        super(weight, age, gender, nickname);
    }

    @Override
    public String toString() {
        return "\nSheep"+super.toString();
    }
}
