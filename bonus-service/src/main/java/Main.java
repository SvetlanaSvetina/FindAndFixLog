public class Main {

  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1_000_60;
    boolean registered = true;
    
    service.calculate(amount, registered);

  }
}

