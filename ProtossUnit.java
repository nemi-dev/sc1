public class ProtossUnit extends Unit {

  protected int maxShield;

  public ProtossUnit() {
    super();
    this.race = SC1.Race.Protoss;
  }

  @Override
  public void showBasicInfo() {
    super.showBasicInfo();
    System.out.printf("Shield: %d\n", this.maxShield);
  }

  
}
