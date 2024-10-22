public class Marine extends TerranUnit {
  public Marine() {
    super();

    final Weapon weapon = new Weapon("Gauss Rifle", 6, 1);

    size = SC1.Size.Small;
    isAir = false;
    isWorker = false;
    mineralCost = 50;
    gasCost = 0;
    maxHP = 40;
    defense = 0;
    isMachine = false;
    isBionic = true;

    groundWeapon = weapon;
    airWeapon = weapon;
  }
}