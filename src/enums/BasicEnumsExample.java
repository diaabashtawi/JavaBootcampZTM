package enums;

public class BasicEnumsExample {
    public static void main(String[] args) {
        for (Weekday day : Weekday.values()){
            System.out.println(day);
        }
        System.out.println("***************************************");
        for (Planet planet : Planet.values()){
            System.out.printf("%s is %.2f AU from the Sun%n" , planet.getName(), planet.getDistanceFromSun());
        }
        System.out.println("***************************************");
        for (GameStatus gameStatus : GameStatus.values()){
            System.out.println(gameStatus);
        }
        GameStatus gameStatus = GameStatus.PAUSED;
    }
}
