package nadal_7.harjutus_7;

import java.util.Set;
import java.util.Map.Entry;

import nadal_7.harjutus_7.harjutuse_klassid.Dictionary;

public class harjutus_7_3 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");
    
        Set<Entry<String, String>> translations = dictionary.translationList();
        for(Entry<String, String> translation: translations) {
            System.out.println(translation);
        }
    }
}
