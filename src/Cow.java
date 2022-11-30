public class Cow extends Animals{
    public Cow() {
    }

    public Cow(int weight, int age, String gender, String nickname) {
        super(weight, age, gender, nickname);
    }

    @Override
    public String toString() {
        return "\nCow"+super.toString();
    }
}
