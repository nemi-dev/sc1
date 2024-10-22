public class Hydralisk extends ZergUnit {
  public Hydralisk() {
    super();

    final Weapon weapon = new Weapon("Needle Spines", 10, 1, SC1.DamageType.Explosive);

    size = SC1.Size.Medium;
    isAir = false;
    isWorker = false;
    mineralCost = 75;
    gasCost = 25;
    maxHP = 80;
    defense = 0;

    groundWeapon = weapon;
    airWeapon = weapon;
  }
}
