public abstract class Unit {
  protected String name;
  protected SC1.Race race; // T / Z / P 
  protected SC1.Size size; // Small / Medium / Large
  protected boolean isAir;
  protected boolean isWorker;
  protected int mineralCost;
  protected int gasCost;
  protected int maxHP;
  protected int defense;
  protected boolean isMachine;
  protected boolean isBionic;
  protected Weapon groundWeapon;
  protected Weapon airWeapon;

  public Unit() {
    name = this.getClass().getName();
  }

  public void showBasicInfo() {
    System.out.printf("<< %s %s >>\n", race.name(), name);

    if (isAir) System.out.println("Air Unit");
    else System.out.println("Ground Unit");

    if (gasCost > 0) System.out.printf("Cost : Mineral %d / Gas %d\n", mineralCost, gasCost);
    else if (mineralCost > 0) System.out.printf("Cost : Mineral %d\n", mineralCost, gasCost);
    System.out.printf("Hit Point : %d\n", maxHP);
    System.out.printf("Defense : %d\n", defense);
  }

  public void showSpecialInfo() { }

  public void showWeapons() {
    if (groundWeapon == null && airWeapon == null)
      System.out.println("Non-Attack Unit");
    else if (groundWeapon == airWeapon) {
      System.out.println("< Ground/Air Attack >");
      groundWeapon.describe();
    } else {
      if (groundWeapon != null) {
        System.out.println("< Ground Attack >");
        groundWeapon.describe();
      }
      if (airWeapon != null) {
        System.out.println("< Air Attack >");
        airWeapon.describe();
      }
        
    }
  }
}
