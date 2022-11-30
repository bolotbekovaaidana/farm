public class Horse extends Animals{
    private String colour;

    public Horse() {
    }
    public Horse(int weight, int age, String gender, String nickname, String colour) {
        super(weight, age, gender, nickname);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "\nHorse{" +
                "colour='" + colour + '\'' +super.toString();
    }
}
