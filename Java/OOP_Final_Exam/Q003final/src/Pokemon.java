import java.util.Objects;


public class Pokemon {
    private Integer id;
    private String name_english;
    private Double attack;
    private Double defense;
    private Double spAttack;
    private Double spDefense;

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

    public Double getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(Double spAttack) {
        this.spAttack = spAttack;
    }

    public Double getSpDefense() {
        return spDefense;
    }

    public void setSpDefense(Double spDefense) {
        this.spDefense = spDefense;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name_english=" + name_english + ", attack=" + attack + ", defense=" + defense + ", spAttack=" + spAttack + ", spDefense=" + spDefense + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
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

    public Pokemon(Integer id, String name_english, Double attack, Double defense, Double spAttack, Double spDefense) {
        this.id = id;
        this.name_english = name_english;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
    }

    
}