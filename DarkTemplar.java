public class DarkTemplar extends ProtossUnit {
  public DarkTemplar() {
    super();

    name = "Dark Templar";

    size = SC1.Size.Small;
    isAir = false;
    isWorker = false;
    mineralCost = 125;
    gasCost = 100;
    maxHP = 80;
    maxShield = 40;
    defense = 1;
    isMachine = false;
    isBionic = true;

    groundWeapon = new Weapon("Warp Blades", 40, 3);
  }

  @Override
  public void showSpecialInfo() {
    System.out.println(" * Permanently Cloaked");
  }
}