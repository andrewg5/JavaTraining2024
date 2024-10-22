public class Pokemon {
    String name;
    int level;
    void Attack(){
        System.out.println(name+"attack!");
    }

    Pokemon(){
        level = 1;
    }

    Pokemon(String name, int level){
        this.name = name;
        this.level = level;
    }


    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Eevee", 25);
        System.out.println(p1.level);
    }
}
