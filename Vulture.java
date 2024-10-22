public class Vulture extends TerranUnit {
  public Vulture() {
    super();

    size = SC1.Size.Medium;
    isAir = false;
    isWorker = false;
    mineralCost = 75;
    gasCost = 0;
    maxHP = 80;
    defense = 0;
    isMachine = true;
    isBionic = false;

    groundWeapon = new Weapon("Fragmentation Grenade", 20, 2, SC1.DamageType.Concussive);
  }
}