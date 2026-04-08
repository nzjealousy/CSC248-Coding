
/**
 * class TestFruit application class
 * to explore Arraylist to organise string type of data
 *
 * @Nicholas Langit
 * @1/4/2026
 */
import java.util.ArrayList;
public class TestFruit
{
    public static void main(String [] args){
        //create ArrayList obj with capacity 100
        ArrayList fruitBasket1 = new ArrayList(100);
        //ArrayList obj with default constructor        
        ArrayList fruitBasket2 = new ArrayList();
        
        //check current size
        System.out.println(fruitBasket1.size() + " " + fruitBasket2.size());
        
        //add elements to array
        fruitBasket1.add("apple");
        fruitBasket1.add("durian");
        fruitBasket1.add(1,"orange");
        fruitBasket1.add("apple");
        //replace item using index
        fruitBasket1.set(1,"banana");
        
        //access stirng element at index
        System.out.println(fruitBasket1.get(2));
        //check current elements array
        System.out.println(fruitBasket1);
        
        fruitBasket1.add(1);
        //check current size
        System.out.println(fruitBasket1.size() + " " + fruitBasket2.size());
        //traverse the array n display element
        for(int i = 0; i < fruitBasket1.size();i++){
            System.out.println(fruitBasket1.get(i));
        }
        
        System.out.println(fruitBasket1.indexOf("durian")+" "+fruitBasket1.indexOf("banana"));
        //remove at index in list
        System.out.println(fruitBasket1.remove(2));
        System.out.println(fruitBasket1.remove("apple"));
        System.out.println(fruitBasket1);
        //remove at index not in list
        System.out.println(fruitBasket1.remove("kiwi"));
        System.out.println(fruitBasket1);
        System.out.println(fruitBasket1.indexOf("dog"));
        
        
    }
}