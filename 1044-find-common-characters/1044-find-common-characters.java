import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] charCount = new int[26];
            for (char c : words[i].toCharArray()) {
                charCount[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], charCount[j]);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }
}
