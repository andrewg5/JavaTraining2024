package Pokemon;

public class Main {
    public static void main(String[] args) {
        String winner = "";
        String winner2 = "";

        Pokemon jigglypuff1 = new Jigglypuff();
        Pokemon jigglypuff2 = new Jigglypuff();
        
        //attack loop 1
        while(!jigglypuff1.GetIsFainted() && !jigglypuff2.GetIsFainted()){
            jigglypuff1.Attack(jigglypuff2);
            System.out.println(jigglypuff1.GetName() + " " + jigglypuff1.GetHealth());
            if(jigglypuff1.GetIsFainted()){
                winner = "jigglypuff2";
                break;
            }
            jigglypuff2.Attack(jigglypuff1);
            System.out.println(jigglypuff1.GetName() + " " + jigglypuff2.GetHealth());
            if(jigglypuff2.GetIsFainted()){
                winner = "jigglypuff1";
                break;
            }
            else if(jigglypuff1.GetIsFainted()){
                winner2 = "jigglypuff2";
                break;
            }
        }

        System.out.println(winner);

        Pokemon jigglypuff3 = new Jigglypuff(20, "a");
        Pokemon jigglypuff4 = new Jigglypuff(25, "b");

        //attack loop 2
        while(!jigglypuff3.GetIsFainted() && !jigglypuff4.GetIsFainted()){
            jigglypuff3.Attack(jigglypuff4);
            System.out.println(jigglypuff3.GetName() + " " + jigglypuff3.GetHealth());
            if(jigglypuff3.GetIsFainted()){
                winner2 = "jigglypuff4";
                break;
            }

            jigglypuff4.Attack(jigglypuff3);
            System.out.println(jigglypuff4.GetName() + " " + jigglypuff4.GetHealth());
            if(jigglypuff4.GetIsFainted()){
                winner2 = "jigglypuff3";
                break;
            }
            else if(jigglypuff3.GetIsFainted()){
                winner2 = "jigglypuff4";
                break;
            }
        }
        
        System.out.println(winner2);
    }
}