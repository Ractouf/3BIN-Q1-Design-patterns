public class ConcreteDecorator1 extends Decorator {
  public ConcreteDecorator1(IComponent component) {
    super(component);
  }

  @Override
  public int price() {
    return this.component.price() + 1;
  }
}
