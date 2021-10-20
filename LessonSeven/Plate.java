public class Plate {
  private int plateFullness=10;

    public int getPlateFullness() {
        return plateFullness;
    }

    public void plateIncrease(int food){
      if(food<10-getPlateFullness()){plateFullness+=food;}
      else System.out.println("The plate is too small");
  }
  public boolean degreaseFood(int hungry){
        if(hungry<plateFullness){plateFullness-=hungry;  return true;}
      return false;
  }
    public void setPlateFullness(int plateFullness) {
        this.plateFullness = plateFullness;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "plateFullness=" + plateFullness +
                '}';
    }
}
