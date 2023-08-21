package edu.disease.asn1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.UUID;

public class PatientTest {

    @Test
    public void testGetSetFirstName() {
        Patient patient = new Patient(5, 3);
        patient.setFirstName("John");

        assertEquals("John", patient.getFirstName());
    }

    @Test
    public void testGetSetLastName() {
        Patient patient = new Patient(5, 3);
        patient.setLastName("Doe");

        assertEquals("Doe", patient.getLastName());
    }

    @Test
    public void testAddDiseaseId() {
        UUID diseaseId = UUID.randomUUID();
        Patient patient = new Patient(5, 3);
        patient.addDiseaseId(diseaseId);

        assertEquals(diseaseId, patient.diseaseIds[0]);
    }

    @Test
    public void testAddExposure() {
        Exposure exposure = new Exposure(LocalDateTime.now(), "D");
        Patient patient = new Patient(5, 3);
        patient.addExposure(exposure);

        assertEquals(exposure, patient.exposures[0]);
    }

    @Test
    public void testEqualsAndHashCode() {
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();

        Patient patient1 = new Patient(5, 3);
        patient1.patientId = uuid1;

        Patient patient2 = new Patient(5, 3);
        patient2.patientId = uuid1;

        Patient patient3 = new Patient(5, 3);
        patient3.patientId = uuid2;

        assertEquals(patient1, patient2);
        assertNotEquals(patient1, patient3);

        assertEquals(patient1.hashCode(), patient2.hashCode());
        assertNotEquals(patient1.hashCode(), patient3.hashCode());
    }
}



