public abstract class ZergUnit extends Unit {
  public ZergUnit() {
    super();
    this.race = SC1.Race.Zerg;
    this.isBionic = true;
    this.isMachine = false;
  }
}
