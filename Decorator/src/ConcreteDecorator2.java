public class ConcreteDecorator2 extends Decorator {
  public ConcreteDecorator2(IComponent component) {
    super(component);
  }

  @Override
  public int price() {
    return this.component.price() + 2;
  }
}
