public class Inheritance {
    public static void main(String[] args) {
        Parent parent = new Parent("a", "green");
        Child child = new Child("b", "b", "green");

        System.out.println(child.getName());
        System.out.println(child.getEyeColor());
    }
    
}


class Parent {
    String lastName;
    String eyeColor;


    Parent(String lastName, String eyeColor){
        this.lastName = lastName;
        this.eyeColor = eyeColor;
    }

    String getLastName(){
        return lastName;
    }
}


class Child extends Parent{
    String firstName;

    Child(String firstName, String lastName, String eyeColor){
        super(lastName, eyeColor);
        this.firstName = firstName;
    }

    String getName(){
        return (firstName + " " +super.getLastName());
    }

    String getEyeColor(){
        return eyeColor;
    }
}

