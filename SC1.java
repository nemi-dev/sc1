public class SC1 {
  public enum Race {
    Terran,
    Zerg,
    Protoss
  };

  public enum Size {
    Small,
    Medium,
    Large
  };

  public enum DamageType {
    Concussive,
    Explosive,
    Normal
  };


  public static void main(String[] args) {
      Unit[] units = {
        new Marine(),
        new Vulture(),
        new SpiderMine(),
        new SiegeTank(),
        new SiegeTankMode(),
        new Goliath(),
        new Zergling(),
        new Hydralisk(),
        new Mutalisk(),
        new Zealot(),
        new Dragoon(),
        new DarkTemplar()
      };

      for (Unit unit : units) {
        unit.showBasicInfo();
        unit.showSpecialInfo();
        unit.showWeapons();
        System.out.println("\n");
      }
  }
}
