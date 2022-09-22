package nadal_7.harjutus_7.harjutuse_klassid;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Dictionary {
    HashMap<String, String> dictionary = new HashMap<String, String>();
    private String Word;
    private String WordTranslated;

    //constructor
    public void add(String word, String wordTranslated) {
        this.Word = word;
        this.WordTranslated = wordTranslated;
        dictionary.put(Word, WordTranslated);
    }

    //methods
    public String translate(String translatableWord) {
        String translatedWord = dictionary.get(translatableWord);
        return translatedWord;
    }

    public int amountOfWords() {
        int wordAmount = dictionary.size();
        return wordAmount;
    }

    public Set<Entry<String, String>> translationList() {
        return dictionary.entrySet();
    }

}
