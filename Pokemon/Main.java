package Pokemon;

public class Main {
    public static void main(String[] args) {
        String winner = "";
        String winner2 = "";

        Pokemon jigglypuff1 = new Jigglypuff(10, "a");
        Pokemon jigglypuff2 = new Jigglypuff(15, "b");
        
        //attack loop 1
        while(!jigglypuff1.GetIsFainted() && !jigglypuff2.GetIsFainted()){
            jigglypuff1.Attack(jigglypuff2);
            System.out.println(jigglypuff2.GetName() + " " + jigglypuff1.GetHealth());
            
            jigglypuff2.Attack(jigglypuff1);
            System.out.println(jigglypuff1.GetName() + " " + jigglypuff2.GetHealth());
           
        }
        if(jigglypuff1.GetIsFainted()){
            winner = jigglypuff2.GetName();
        }
        else{
            winner = jigglypuff1.GetName();
        }

        System.out.println(winner);

    }
}