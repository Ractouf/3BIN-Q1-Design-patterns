public class Main {

  public static void main(String[] args) {
    ConcreteComponent1 component1 = new ConcreteComponent1();
    ConcreteComponent2 component2 = new ConcreteComponent2();

    System.out.println(component2.price());
    System.out.println(new ConcreteDecorator2(new ConcreteDecorator1(component2)).price());
  }
}
