package lupe.codewars.katas.java.coutIpAddresses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountIpAddressesTest {

    private final CountIpAddresses countIpAddresses = new CountIpAddresses();

    @Test
    public void testIPcounting() {
        assertEquals( 50, countIpAddresses.ipsBetween( "10.0.0.0", "10.0.0.50" ) );
        assertEquals( 246, countIpAddresses.ipsBetween( "20.0.0.10", "20.0.1.0" ) );
        assertEquals( (1l << 32l) - 1l, countIpAddresses.ipsBetween( "0.0.0.0", "255.255.255.255" ) );
    }
}