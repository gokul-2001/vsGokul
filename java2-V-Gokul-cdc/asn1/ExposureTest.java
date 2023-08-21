package edu.disease.asn1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.UUID;

public class ExposureTest {

    @Test
    public void testGetSetPatientId() {
        UUID testUUID = UUID.randomUUID();
        Exposure exposure = new Exposure(LocalDateTime.now(), "D");
        exposure.setPatientId(testUUID);

        assertEquals(testUUID, exposure.getPatientId());
    }

    @Test
    public void testGetSetDateTime() {
        LocalDateTime testDateTime = LocalDateTime.of(2023, 8, 21, 10, 0);
        Exposure exposure = new Exposure(LocalDateTime.now(), "D");
        exposure.setDateTime(testDateTime);

        assertEquals(testDateTime, exposure.getDateTime());
    }

    @Test
    public void testGetSetExposureType() {
        Exposure exposure = new Exposure(LocalDateTime.now(), "D");
        exposure.setExposureType("I");

        assertEquals("I", exposure.getExposureType());
    }

    @Test
    public void testEqualsAndHashCode() {
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();

        LocalDateTime dateTime1 = LocalDateTime.of(2023, 8, 21, 12, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 8, 21, 14, 0);

        Exposure exposure1 = new Exposure(dateTime1, "D");
        exposure1.setPatientId(uuid1);

        Exposure exposure2 = new Exposure(dateTime1, "D");
        exposure2.setPatientId(uuid1);

        Exposure exposure3 = new Exposure(dateTime2, "I");
        exposure3.setPatientId(uuid2);

        assertEquals(exposure1, exposure2);
        assertNotEquals(exposure1, exposure3);

        assertEquals(exposure1.hashCode(), exposure2.hashCode());
        assertNotEquals(exposure1.hashCode(), exposure3.hashCode());
    }
}
