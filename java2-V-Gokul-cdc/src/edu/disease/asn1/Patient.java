/**
 * The `Patient` class represents a patient with a unique identifier (UUID), first name, last name,
 * an array of exposures, an array of disease IDs, and maximum limits for diseases and exposures.
 */
package edu.disease.asn1;

import java.util.Arrays;
import java.util.UUID;

public class Patient {

	/**
	 * The unique identifier (UUID) of the patient.
	 */
	UUID patientId;

	/**
	 * The first name of the patient.
	 */
	private String firstName;

	/**
	 * The last name of the patient.
	 */
	private String lastName;

	/**
	 * An array containing exposure objects associated with the patient.
	 */
	Exposure[] exposures;

	/**
	 * An array containing disease IDs associated with the patient.
	 */
	UUID[] diseaseIds;

	/**
	 * The maximum number of diseases that can be associated with the patient.
	 */
	int maxDiseases;

	/**
	 * The maximum number of exposures that can be associated with the patient.
	 */
	int maxExposures;

	/**
	 * Constructs a `Patient` object with specified limits for diseases and
	 * exposures.
	 *
	 * @param maxDiseases  The maximum number of diseases that can be associated
	 *                     with the patient.
	 * @param maxExposures The maximum number of exposures that can be associated
	 *                     with the patient.
	 */
	public Patient(int maxDiseases, int maxExposures) {
		this.maxDiseases = maxDiseases;
		this.maxExposures = maxExposures;
	}

	/**
	 * The current index for adding diseases and exposures to their respective
	 * arrays.
	 */
	int index = 0;

	/**
	 * Adds a disease ID to the array of disease IDs associated with the patient.
	 *
	 * @param diseaseId The disease ID to add.
	 * @throws IndexOutOfBoundsException If the maximum number of diseases has been
	 *                                   reached.
	 */
	public void addDiseaseId(UUID diseaseId) {
		if (index < maxDiseases) {
			diseaseIds[index++] = diseaseId;
		} else {
			throw new IndexOutOfBoundsException("Memory Full");
		}
	}

	/**
	 * Adds an exposure to the array of exposures associated with the patient.
	 *
	 * @param exposure The exposure to add.
	 * @throws IndexOutOfBoundsException If the maximum number of exposures has been
	 *                                   reached.
	 */
	public void addExposure(Exposure exposure) {
		if (index < maxExposures) {
			exposures[index++] = exposure;
		} else {
			throw new IndexOutOfBoundsException("Memory Full");
		}
	}

	/**
	 * Retrieves the first name of the patient.
	 *
	 * @return The first name of the patient.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the patient.
	 *
	 * @param firstName The first name to set for the patient.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Retrieves the last name of the patient.
	 *
	 * @return The last name of the patient.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the patient.
	 *
	 * @param lastName The last name to set for the patient.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Computes the hash code for the patient object.
	 *
	 * @return The computed hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * Checks if the patient object is equal to another object.
	 *
	 * @param obj The object to compare with.
	 * @return `true` if the objects are equal, otherwise `false`.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds)
				+ ", maxDiseases=" + maxDiseases + ", maxExposures=" + maxExposures + ", index=" + index + "]";
	}

}
