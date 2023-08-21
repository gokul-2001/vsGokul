package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * A class that implements the DiseaseControlManager interface to manage diseases and patients.
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager {

    private Disease[] diseases;
    private Patient[] patients;
    int md, me, indexd = 0, indexp = 0;

    /**
     * Constructs a DiseaseControlManagerImpl instance with maximum capacity for diseases and patients.
     *
     * @param maxDiseases The maximum number of diseases that can be stored.
     * @param maxPatient  The maximum number of patients that can be stored.
     * @throws IllegalArgumentException If maxDiseases or maxPatient is less than or equal to 0.
     */
    public DiseaseControlManagerImpl(int maxDiseases, int maxPatient) {
        try {
            if (maxDiseases <= 0 || maxPatient <= 0) {
                throw new IllegalArgumentException("Invalid Data");
            } else {
                diseases = new Disease[maxDiseases];
                patients = new Patient[maxPatient];
            }
        } catch (IllegalArgumentException e) {
            // Handle the exception if needed
        }
    }

    // ... (rest of the code)

    /**
     * Adds a disease to the collection of diseases.
     *
     * @param name       The name of the disease.
     * @param infectious Indicates if the disease is infectious.
     * @return The added Disease instance.
     * @throws IllegalStateException If the maximum number of diseases has been reached.
     */
    @Override
    public Disease addDisease(String name, boolean infectious) {
        // ... (implementation details)
    }

    /**
     * Retrieves a disease by its unique ID.
     *
     * @param diseaseId The UUID of the disease to retrieve.
     * @return The Disease instance with the given ID, or null if not found.
     */
    @Override
    public Disease getDisease(UUID diseaseId) {
        // ... (implementation details)
    }

    /**
     * Adds a patient to the collection of patients.
     *
     * @param firstName   The first name of the patient.
     * @param lastName    The last name of the patient.
     * @param maxDiseases The maximum number of diseases a patient can have.
     * @param maxExposures The maximum number of exposures a patient can have.
     * @return The added Patient instance.
     * @throws IllegalStateException If the maximum number of patients has been reached.
     */
    @Override
    public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
        // ... (implementation details)
    }

    /**
     * Retrieves a patient by their unique ID.
     *
     * @param patientId The UUID of the patient to retrieve.
     * @return The Patient instance with the given ID, or null if not found.
     */
    @Override
    public Patient getPatient(UUID patientId) {
        // ... (implementation details)
    }

    // ... (rest of the code)
}
