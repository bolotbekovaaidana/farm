public abstract class Animals {
    private int weight;
    private int age;
    private String gender;
    private String nickname;

    public Animals() {
    }

    public Animals(int weight, int age, String gender, String nickname) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return  "\nweight=" + weight +
                ", \nage=" + age +
                ", \ngender='" + gender + '\'' +
                ", \nnickname='" + nickname + '\'' +
                '}';
    }
}
