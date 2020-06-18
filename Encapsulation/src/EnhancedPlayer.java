public class EnhancedPlayer {
    private String name;
    private int HP = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <= 100) {
            this.HP = health;
        }
        this.weapon = weapon;
    }
    public void looseHealth (int damage) {
        this.HP = this.HP - damage;
        if (this.HP <= 0) {
            System.out.println("Player knocked out");
            // reduce nr of lifes remaining
        }
    }

    public int getHP() {
        return HP;
    }
}
