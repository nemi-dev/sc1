public class Goliath extends TerranUnit {
  public Goliath() {
    super();

    size = SC1.Size.Large;
    isAir = false;
    isWorker = false;
    mineralCost = 100;
    gasCost = 50;
    maxHP = 125;
    defense = 1;
    isMachine = true;
    isBionic = false;

    groundWeapon = new Weapon("Twin Autocannons", 12, 1);
    airWeapon = new Weapon("Hellfire Missile Pack", 10, 2, 2, SC1.DamageType.Explosive);
  }
}