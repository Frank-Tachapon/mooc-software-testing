package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    // เทสที่ 1: อันนี้มีให้อยู่แล้ว (ทดสอบ 20+5 = 25)
    @Test
    public void addFiveToTwenty() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25, result);
    }

    // เทสที่ 2: เติมเลขให้สมบูรณ์ (ทดสอบ 0+5 = 5)
    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    // เทสที่ 3: เขียนเองทั้งหมด (ทดสอบ -20+5 = -15)
    @Test
    public void addFiveToMinusTwenty() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }
}