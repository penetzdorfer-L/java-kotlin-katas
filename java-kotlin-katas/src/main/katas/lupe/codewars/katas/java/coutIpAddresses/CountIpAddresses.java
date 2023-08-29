package lupe.codewars.katas.java.coutIpAddresses;
public class CountIpAddresses {
    public long ipsBetween(String start, String end) {
        return convertToLong(end) - convertToLong(start);
    }
    private long convertToLong(String ip) {
        long res = 0;
        for (String s : ip.split("[.]") )
            res = res * 256 + Long.parseLong(s);
        return res;
    }
}















