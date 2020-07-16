package src.com.udemy.collections;

import java.util.HashMap;
import java.util.Map;

public class MapPorgram {
    public static void main(String[] args) {

        // defined our map with generic values, key is a String and value is also a String
        Map<String, String> languageMap = new HashMap<>();

        //languageMap.put("Java", " A compiled high level, object-oriented, platform independent language");
        languageMap.put("Python", " An interpreted, object-oriented, high level programing language with dynamic semantics");
        languageMap.put("Algol", " An algorithmic language");
        languageMap.put("Basic", " Beginners all purpose symbolic construction code");
        languageMap.put("Lisp", " Therein lies madness");
        // .get("Java") gets the value of java, not the word java included.
        // keys are unique, old value gets overridden. no error given.

        if (languageMap.containsKey("Java")) {
            System.out.println("Java is already on the map");
        } else {
            languageMap.putIfAbsent("Java", "This is the new java if no key of 'Java' is in the map"); //
        }
        System.out.println(languageMap.get("Java"));
        // languageMap.put("Java", " new definition of java");
        System.out.println(languageMap.put("Java", " Java key with ,put method"));
        // notice now when calling .get("Java"); we get the new definition.
        // to bypass this error we can use .put("Java"); to check if it has been added before.
        // we still get both outputs, one with put and one with get. get does not show the if the key is changed.


        System.out.println("===========");

        //       languageMap.remove("Algol");
        if (languageMap.remove("Algol", " An algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key value/pair not found");
        }

        if (languageMap.replace("Lisp", " Therein lies madness","a functional programing language, with imperative features")){
            System.out.println("Lisp was changed");
        } else {
            System.out.println("Lisp was not changed.");
        }
        //System.out.println(languageMap.replace("Scala", "This will not be added"));
        for (String key : languageMap.keySet()) {
            System.out.println(key + " : " + languageMap.get(key));
        }

    }

}
