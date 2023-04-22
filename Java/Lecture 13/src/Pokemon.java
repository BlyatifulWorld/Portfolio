import java.util.Objects;

public class Pokemon {
    private Integer id;
    private String name_english;
    private String name_chinese;
    private Double hp;
    private Double attack;
    private Double defense;
    private Double speed;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name_english=" + name_english + ", name_chinese=" + name_chinese + ", hp=" + hp + ", attack=" + attack + ", defense=" + defense + ", speed=" + speed + '}';
    }

    public Pokemon(Integer id, String name_english, String name_chinese, Double hp, Double attack, Double defense, Double speed) {
        this.id = id;
        this.name_english = name_english;
        this.name_chinese = name_chinese;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        
        this.id = id;
    }

    public String getName_english() {
        return name_english;
    }

    public void setName_english(String name_english) {
        this.name_english = name_english;
    }

    public String getName_chinese() {
        return name_chinese;
    }

    public void setName_chinese(String name_chinese) {
        this.name_chinese = name_chinese;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public Double getAttack() {
        
        
        return attack;
    }

    public void setAttack(Double attack) {
        this.attack = attack;
    }

    public Double getDefense() {
        return defense;
    }

    public void setDefense(Double defense) {
        this.defense = defense;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}
