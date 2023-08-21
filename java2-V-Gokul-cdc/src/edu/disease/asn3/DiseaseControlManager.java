package edu.disease.asn3;

import java.util.UUID;

/**
 * The `DiseaseControlManager` interface provides a contract for managing diseases and patients.
 * It defines methods to add and retrieve diseases, patients, and associated data.
 */
public interface DiseaseControlManager {
    /**
     * Adds a new disease with the given name and infectious status.
     *
     * @param name       The name of the disease.
     * @param infectious `true` if the disease is infectious, `false` otherwise.
     * @return The created `Disease` object.
     */
    Disease addDisease(String name, boolean infectious);

    /**
     * Retrieves a disease by its unique identifier.
     *
     * @param diseaseId The unique identifier of the disease to retrieve.
     * @return The retrieved `Disease` object, or `null` if not found.
     */
    Disease getDisease(UUID diseaseId);

    /**
     * Adds a new patient with the given first name, last name, maximum diseases, and maximum exposures.
     *
     * @param firstName    The first name of the patient.
     * @param lastName     The last name of the patient.
     * @param maxDiseases  The maximum number of diseases that can be associated with the patient.
     * @param maxExposures The maximum number of exposures that can be associated with the patient.
     * @return The created `Patient` object.
     */
    Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

    /**
     * Retrieves a patient by their unique identifier.
     *
     * @param patientId The unique identifier of the patient to retrieve.
     * @return The retrieved `Patient` object, or `null` if not found.
     */
    Patient getPatient(UUID patientId);

    /**
     * Associates a disease with a patient.
     *
     * @param diseaseId The unique identifier of the disease to associate.
     * @param patientId The unique identifier of the patient to associate.
     */
    void addDiseaseToPatient(UUID diseaseId, UUID patientId);

    /**
     * Associates an exposure with a patient.
     *
     * @param patientId The unique identifier of the patient to associate the exposure with.
     * @param exposure  The `Exposure` object to associate with the patient.
     */
    void addExposureToPatient(UUID patientId, Exposure exposure);
}

