public class Zergling extends ZergUnit {
  public Zergling() {
    super();

    size = SC1.Size.Small;
    isAir = false;
    isWorker = false;
    mineralCost = 50;
    gasCost = 0;
    maxHP = 35;
    defense = 0;

    groundWeapon = new Weapon("Claws", 5, 1);
  }
}
