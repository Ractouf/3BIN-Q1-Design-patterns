public abstract class Decorator implements IComponent {
  IComponent component;

  public Decorator(IComponent component) {
    this.component = component;
  }

  public abstract int price();
}
