package Pokemon;

public abstract class Pokemon {
    private int health;
    private String name;

    Pokemon(int health, String name){
        this.health = health;
        this.name = name;

    }

    //takes damage
    void TakeDamage(int dmg){
        health-=dmg;
    }

    //returns if pokemon is fainted
    public boolean GetIsFainted(){
        return health <= 0;
    }

    //returns pokemon name
    public String GetName(){
        return name;
    }

    //return pokemon health
    public int GetHealth(){
        return health;
    }
    
    //attack method
    abstract void Attack(Pokemon pokemon);


}
