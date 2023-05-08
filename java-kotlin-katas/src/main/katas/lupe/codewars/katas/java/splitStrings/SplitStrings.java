package lupe.codewars.katas.java.splitStrings;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class SplitStrings {
    public String[] solution(String s) {
        int splitLocation = 2;
        List<String> strings = Pattern.compile(".{1," + splitLocation + "}")
                .matcher(s)
                .results()
                .map(MatchResult::group)
                .map(el -> el.length() == 1 ? el + "_" : el)
                .toList();
        return s.isEmpty() ? new String[]{} : strings.toArray(new String[0]);
    }
}


// BEST PRACTICE from Codewars //

/*
public String[] solution(String s) {
    s.length() % 2 == 0 ? s : s + "_";
    return s.split("(?<=\\G.{2})");
}
*/

