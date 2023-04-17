package lupe.codewars.katas.java.maskify;
public class Maskify {
    public String maskify(String str) {
        return str.length() < 4 ? str
                : str.replaceAll(".", "#")
                .substring(0, str.length() - 4)
                + str.substring(str.length() - 4);
    }
}
