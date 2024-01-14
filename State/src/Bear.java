public class Bear {
  private enum State {
    SLEEPING {
      @Override
      public void attack() {
        System.out.println("Zzzzzz");
      }

      @Override
      public void sleep(Bear bear) {
        throw new RuntimeException("Already sleeping");
      }
    },
    NOT_SLEEPING {
      @Override
      public void attack() {
        System.out.println("GroaaR");
      }

      @Override
      public void wakeUp(Bear bear) {
        throw new RuntimeException("Already awake");
      }
    };

    abstract void attack();
    void sleep(Bear bear) {
      bear.setState(State.SLEEPING);
    }
    void wakeUp(Bear bear) {
      bear.setState(State.NOT_SLEEPING);
    }
  }

  private State state;

  public Bear() {
    setState(State.NOT_SLEEPING);
  }

  public void attack() {
    state.attack();
  }

  public void sleep() {
    state.sleep(this);
  }

  public void wakeUp() {
    state.wakeUp(this);
  }

  public void setState(State state) {
    this.state = state;
  }
}
