public class SpiderMine extends TerranUnit {
  public SpiderMine() {
    super();

    name = "Spider Mine";
    size = SC1.Size.Small;
    isAir = false;
    isWorker = false;
    mineralCost = 0;
    gasCost = 0;
    maxHP = 20;
    defense = 0;
    isMachine = true;
    isBionic = false;

    groundWeapon = new Weapon("Spider Mines", 125, 0, SC1.DamageType.Explosive);
  }
}