import java.util.Arrays;

public class Farm{
    private String address;
    private String ownerName;
    private Cow[] cow;
    private Horse[] horse;
    private Sheep[] sheep;

    public Farm(String address, String ownerName, Cow[] cow, Horse[] horse, Sheep[] sheep) {
        this.address = address;
        this.ownerName = ownerName;
        this.cow = cow;
        this.horse = horse;
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "\naddress='" + address + '\'' +
                ", \nownerName='" + ownerName + '\'' +
                ", \n" + Arrays.toString(cow) +
                ", \n" + Arrays.toString(horse) +
                ", \n" + Arrays.toString(sheep) +
                '}';
    }
}
