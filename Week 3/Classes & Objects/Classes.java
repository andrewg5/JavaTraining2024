public class Classes {
    public static void main(String[] args) {
        Me me = new Me("Andrew", 15);

        System.out.println("name: "+me.GetName() + ", age: " + me.GetAge());
    }
}

class Me{
    String name;
    int age;

    Me(String name, int age){
        this.name = name;
        this.age = age;
    }

    String GetName(){
        return name;
    }

    int GetAge(){
        return age;
    }
}
