public class Main {
    public static void main(String[] args) {
        DrawCar car = new DrawCar();
        car.draw(10, new StrategySquare());
    }
}
