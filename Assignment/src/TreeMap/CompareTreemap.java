package TreeMap;

import java.util.Comparator;

class CompareTreemap implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }

}
