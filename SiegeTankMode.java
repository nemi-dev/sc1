public class SiegeTankMode extends TerranUnit {
  public SiegeTankMode() {
    super();

    name = "Siege Tank (Siege Mode)";
    size = SC1.Size.Large;
    isAir = false;
    isWorker = false;
    mineralCost = 150;
    gasCost = 100;
    maxHP = 150;
    defense = 1;
    isMachine = true;
    isBionic = false;

    groundWeapon = new Weapon("Arclite Shock Cannon", 70, 5, SC1.DamageType.Explosive);
  }
}

class SiegeModeWeapon extends Weapon {
  public SiegeModeWeapon() {
    super("Arclite Shock Cannon", 70, 5, SC1.DamageType.Explosive);
  }

  @Override
  public void describeMore() {
    System.out.println("* Splash damage (can injure ally units)");
  }
}