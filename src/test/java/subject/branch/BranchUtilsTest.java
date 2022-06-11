package subject.branch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BranchUtilsTest {

    private static final BranchUtils branchUtils = new BranchUtils();

    @Test
    void testSign() {
        Assertions.assertEquals(1, branchUtils.sign(1));
        Assertions.assertEquals(-1, branchUtils.sign(-1));
        Assertions.assertEquals(1, branchUtils.sign(14));
        Assertions.assertEquals(-1, branchUtils.sign(-58));
        Assertions.assertEquals(1, branchUtils.sign(12345));
        Assertions.assertEquals(-1, branchUtils.sign(0));
    }

    @Test
    void testValueInInterval1() {
        Assertions.assertEquals(-1, branchUtils.valueInInterval(41));
        Assertions.assertEquals(1, branchUtils.valueInInterval(43));
        Assertions.assertEquals(1, branchUtils.valueInInterval(50));
        Assertions.assertEquals(1, branchUtils.valueInInterval(74));
        Assertions.assertEquals(-1, branchUtils.valueInInterval(75));
        Assertions.assertEquals(-1, branchUtils.valueInInterval(115));
        Assertions.assertEquals(-1, branchUtils.valueInInterval(0));
        Assertions.assertEquals(-1, branchUtils.valueInInterval(-80));
    }

    @Test
    void testValueInInterval2() {
        Assertions.assertEquals(1, branchUtils.valueInInterval(0, -1, 1));
        Assertions.assertEquals(0, branchUtils.valueInInterval(0, 1, -1));
        Assertions.assertEquals(1, branchUtils.valueInInterval(5, 4, 12));
        Assertions.assertEquals(-1, branchUtils.valueInInterval(3, 4, 12));
        Assertions.assertEquals(1, branchUtils.valueInInterval(12, 4, 12));
        Assertions.assertEquals(-1, branchUtils.valueInInterval(13, 4, 12));
        Assertions.assertEquals(1, branchUtils.valueInInterval(-12, -31, -2));
        Assertions.assertEquals(-1, branchUtils.valueInInterval(-1, -31, -2));
    }

    @Test
    void testIsEven() {
        Assertions.assertTrue(branchUtils.isEven(2));
        Assertions.assertFalse(branchUtils.isEven(1));
        Assertions.assertTrue(branchUtils.isEven(6));
        Assertions.assertFalse(branchUtils.isEven(3));
        Assertions.assertTrue(branchUtils.isEven(28));
        Assertions.assertFalse(branchUtils.isEven(71));
        Assertions.assertTrue(branchUtils.isEven(256));
    }

    @Test
    void testIsTwiceBigger() {
        Assertions.assertFalse(branchUtils.isTwiceBigger(2, 4));
        Assertions.assertTrue(branchUtils.isTwiceBigger(10, 5));
        Assertions.assertFalse(branchUtils.isTwiceBigger(8, 3));
        Assertions.assertFalse(branchUtils.isTwiceBigger(81, 40));
        Assertions.assertTrue(branchUtils.isTwiceBigger(70, 35));
        Assertions.assertFalse(branchUtils.isTwiceBigger(1, 2));
    }
}