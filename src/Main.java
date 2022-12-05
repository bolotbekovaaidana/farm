public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(172, 4, "male", "Tor");
        Cow cow1 = new Cow(163, 5, "female", "Dasha");
        Cow cow2 = new Cow(152, 6, "male", "Leo");
        Cow cow3 = new Cow(242, 7, "female", "Masha");
        Cow cow4 = new Cow(128, 5, "female", "Sasha");
        Cow[] cows = {cow, cow1, cow2, cow3, cow4};
        Cow[] cows1 = {cow};
        Horse horse = new Horse(158, 7, "male", "Tulpar", "black");
        Horse horse1 = new Horse(128, 4, "female", "Gulpar", "white");
        Horse[] horses = {horse, horse1};
        Horse[] horses1 = {horse1};
        Sheep sheep = new Sheep(54, 4, "female", "Koy");
        Sheep sheep1 = new Sheep(44, 3, "female", "Joy");
        Sheep sheep2 = new Sheep(51, 5, "female", "Hoy");
        Sheep[] sheeps = {sheep, sheep1, sheep2};
        Sheep[] sheep3 = {sheep1};
        Farm farm = new Farm(" Seleksionnyi ", " Seleksionnyi aiyly ", cows, horses, sheeps);
        Farm farm1 = new Farm(" KIMCHI ", " Kok-Jar ", cows1, horses1, sheep3);
        System.out.println(farm1);
        System.out.println(farm);
    }
}