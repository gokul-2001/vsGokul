package edu.disease.asn3;

/**
 * The `DiseaseAndPatient` class represents a container for arrays of `Disease` and `Patient` objects.
 * It allows encapsulation and management of disease and patient data.
 */
public class DiseaseAndPatient {
    /**
     * An array containing `Disease` objects.
     */
    private Disease[] diseases;

    /**
     * An array containing `Patient` objects.
     */
    private Patient[] patients;

    /**
     * Retrieves the array of `Disease` objects.
     *
     * @return The array of `Disease` objects.
     */
    public Disease[] getDiseases() {
        return diseases;
    }

    /**
     * Sets the array of `Disease` objects.
     *
     * @param diseases The array of `Disease` objects to set.
     */
    public void setDiseases(Disease[] diseases) {
        this.diseases = diseases;
    }

    /**
     * Retrieves the array of `Patient` objects.
     *
     * @return The array of `Patient` objects.
     */
    public Patient[] getPatients() {
        return patients;
    }

    /**
     * Sets the array of `Patient` objects.
     *
     * @param patients The array of `Patient` objects to set.
     */
    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
}
