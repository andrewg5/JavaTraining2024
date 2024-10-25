package Pokemon;

public class Jigglypuff extends Pokemon{

    public Jigglypuff() {
        super(20, "Jigglypuff");
    }

    public Jigglypuff(int health, String name) {
        super(health, name);
    }
    
    //attack pokemon
    @Override
    public void Attack(Pokemon pokemon){
        pokemon.TakeDamage(5);
    }
}
