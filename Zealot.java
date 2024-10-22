public class Zealot extends ProtossUnit {
  public Zealot() {
    super();

    size = SC1.Size.Small;
    isAir = false;
    isWorker = false;
    mineralCost = 100;
    gasCost = 0;
    maxHP = 100;
    maxShield = 60;
    defense = 1;
    isMachine = false;
    isBionic = true;

    groundWeapon = new Weapon("Psi Blades", 8, 1, 2);
  }
}