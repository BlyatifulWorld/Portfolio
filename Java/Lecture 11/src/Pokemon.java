
import java.util.Objects;

public class Pokemon {
    private String name_english;
    private String name_japanese;
    private double hp;
    private double attack;
    private double defense;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name_english);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (!Objects.equals(this.name_english, other.name_english)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "name_english=" + name_english + ", name_japanese=" + name_japanese + ", hp=" + hp + ", attack=" + attack + ", defense=" + defense + '}';
    }

    public Pokemon(String name_english, String name_japanese, double hp, double attack, double defense) {
        this.name_english = name_english;
        this.name_japanese = name_japanese;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }
    
    public String getName_english() {
        return name_english;
    }

    public void setName_english(String name_english) {
        this.name_english = name_english;
    }

    public String getName_japanese() {
        return name_japanese;
    }

    public void setName_japanese(String name_japanese) {
        this.name_japanese = name_japanese;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

}
