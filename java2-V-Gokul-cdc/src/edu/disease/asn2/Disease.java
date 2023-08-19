package edu.disease.asn2;

/**
 * The `Disease` class represents a disease entity with a unique identifier (UUID) and a name.
 */

import java.util.UUID;

public abstract class Disease {

    /**
     * The unique identifier (UUID) of the disease.
     */
    UUID diseaseId;

    /**
     * The name of the disease.
     */
    private String name;

    /**
     * Retrieves the unique identifier (UUID) of the disease.
     *
     * @return The disease's UUID.
     */
    public UUID getDiseaseId() {
        return diseaseId;
    }

    /**
     * Sets the unique identifier (UUID) of the disease.
     *
     * @param diseaseId The UUID to set for the disease.
     */
    public void setDiseaseId(UUID diseaseId) {
        this.diseaseId = diseaseId;
    }

    /**
     * Retrieves the name of the disease.
     *
     * @return The disease's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the disease.
     *
     * @param name The name to set for the disease.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Computes the hash code for the disease object.
     *
     * @return The computed hash code.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
        return result;
    }

    /**
     * Checks if the disease object is equal to another object.
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
        Disease other = (Disease) obj;
        if (diseaseId == null) {
            if (other.diseaseId != null)
                return false;
        } else if (!diseaseId.equals(other.diseaseId))
            return false;
        return true;
    }

    /**
     * Generates a string representation of the disease object.
     *
     * @return The string representation of the disease.
     */
    @Override
    public String toString() {
        return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
    }
    abstract String[] getExamples();
}
class InfectiousDisease extends Disease{
	@Override
	String[] getExamples() {
		String str[]= {"Dengue","Corona","Malaria","Typhoid"};
		return str;
	}
	
}
class NonInfectiousDisease extends Disease{
	@Override
	String[] getExamples() {
		String str[]= {"Diabetes","Hypertension","Cancer","Alzheimer"};
		return str;
	}
	
}