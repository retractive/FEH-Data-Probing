public class Character {
    private String name;
    private Color color;
    private int[] stats;

    public Character(String n, String c, int[] s){
        this.name = n;
        this.color = null;
    }

    public Character(){

    }

    public int[] getStats(){
        return this.stats;
    }
}
