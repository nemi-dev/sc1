public class Dragoon extends ProtossUnit {
  public Dragoon() {
    super();

    Weapon weapon = new Weapon("Phase Disruptor", 20, 2, SC1.DamageType.Explosive);
    size = SC1.Size.Large;
    isAir = false;
    isWorker = false;
    mineralCost = 125;
    gasCost = 50;
    maxHP = 100;
    maxShield = 80;
    defense = 1;
    isMachine = true;
    isBionic = false;

    groundWeapon = weapon;
    airWeapon = weapon;
  }
}