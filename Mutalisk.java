class MutaliskWeapon extends Weapon {
  public MutaliskWeapon() {
    super("Glave Wurm", 9, 1);
  }

  @Override
  public void describeMore() {
    System.out.println(" * Attack bounces three times");
  }

  public double secondHit() {
    return super.calcFullHit() / 3;
  }

  public double thirdHit() {
    return super.calcFullHit() / 9;
  }

  public int calcFullHit() {
    return (int) (super.calcFullHit() + secondHit() + thirdHit());
  }

}

public class Mutalisk extends ZergUnit {
  public Mutalisk() {
    super();

    final Weapon weapon = new MutaliskWeapon();

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
