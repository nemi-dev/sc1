public class SiegeTank extends TerranUnit {
  public SiegeTank() {
    super();

    name = "Siege Tank";
    size = SC1.Size.Large;
    isAir = false;
    isWorker = false;
    mineralCost = 150;
    gasCost = 100;
    maxHP = 150;
    defense = 1;
    isMachine = true;
    isBionic = false;

    groundWeapon = new Weapon("Arclite Cannon", 30, 3, SC1.DamageType.Explosive);
  }
}