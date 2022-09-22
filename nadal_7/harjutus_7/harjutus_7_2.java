package nadal_7.harjutus_7;

import nadal_7.harjutus_7.harjutuse_klassid.Dictionary;

public class harjutus_7_2 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        System.out.println(dictionary.amountOfWords());
    
        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());
    }
}
