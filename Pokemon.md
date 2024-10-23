# Let's Make Pokemon!

**Rules**
1. All classes must be in their own file

2. Must model Encapsulation in variables and methods (public and private appropriately)

3. Must have comments above each method breifly explaining what it is intended to do
  
4. Must have an abstract class “Pokemon” that all individual pokemon inherit from

   a. Must have an instance variable for health

   b. Must have an instance variable for name

   c. Must have a non-default constructor taking in parameters for initial health and name values and setting those values to the instance variables

   d. Must have defined method “take damage” that intakes an integer parameter

   e. Must have abstract method “attack” that intakes a parameter of a Pokemon object (subtype polymorphism!). Call the "take damage" method of that pokemon inside of this method

   f. Must have a getter “getIsFainted” that returns true or false for if the pokemon is dead (health <=0)


6. Must have at least 2 child classes for individual pokemon

   a. Must override the "attack" method

   b. Must have a default constructor setting the "health" and "name" variables to reasonable default values (i.e.  14, "Jigglypuff")

   c. Must have a non-default constructor that sets "health" and "name" to valeus given in the parameters

7. Within a main method, make default objects of your pokemon and have them fight!

   a. In a while loop that continues until one or both pokemon have fainted, have them take turns attacking each other

   b. Print out your winner!

8. Repeat 7, but with non-default objects of your pokemon
