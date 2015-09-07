// containersindepth/IndividualTest.java
// �2015 MindView LLC: see Copyright.txt
import containers.MapOfList;
import typeinfo.pets.*;
import java.util.*;

public class IndividualTest {
  public static void main(String[] args) {
    Set<Individual> pets = new TreeSet<>();
    for(List<? extends Pet> lp :
        MapOfList.petPeople.values())
      for(Pet p : lp)
        pets.add(p);
    System.out.println(pets);
  }
}
/* Output:
[Cat Elsie May, Cat Pinkola, Cat Shackleton, Cat Stanford
aka Stinky el Negro, Cymric Molly, Dog Margrett, Mutt Spot,
Pug Louie aka Louis Snorkelstein Dupree, Rat Fizzy, Rat
Freckly, Rat Fuzzy]
*/
