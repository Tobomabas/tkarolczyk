package tkarolczyk.lambdaTest;
public class Main {
    public static void main(String[] args) {
        Flyable flyable =() -> System.out.println("spierdalaj chuju");
        Zapierdalajaacy zapierdalajaacy = (distance, predkosc) -> System.out.println("o co chodzi ?");
        zapierdalajaacy.zapierdalac(25,2.22);
        flyable.fly();
    }
}