package models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("Pokemon")
public class Pokemon {
    @Id
    private String id;
    private String name ;
    private String type ;
    private int total ;
    private int attack ;
    private int defence ;
    private int spattack ;
    private int spdefence ;
    private int speed ;
    private boolean legendary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpattack() {
        return spattack;
    }

    public void setSpattack(int spattack) {
        this.spattack = spattack;
    }

    public int getSpdefence() {
        return spdefence;
    }

    public void setSpdefence(int spdefence) {
        this.spdefence = spdefence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public void setLegendary(boolean legendary) {
        this.legendary = legendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", total=" + total +
                ", attack=" + attack +
                ", defence=" + defence +
                ", spattack=" + spattack +
                ", spdefence=" + spdefence +
                ", speed=" + speed +
                ", legendary=" + legendary +
                '}';
    }
}
