package edu.disease.asn3;


import java.util.UUID;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Exposure implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * The unique identifier (UUID) of the patient associated with the exposure.
     */
    private UUID patientId;

    /**
     * The date and time of the exposure event.
     */
    private LocalDateTime dataTime;

    /**
     * The type of exposure ('D' for Direct, 'I' for Indirect).
     */
    private String exposureType;

    /**
     * Constructs an `Exposure` object with the provided date and time, and exposure type.
     *
     * @param dataTime The date and time of the exposure event.
     * @param exposureType The type of exposure ('D' for Direct, 'I' for Indirect).
     */
    public Exposure(LocalDateTime dataTime, String exposureType) {
        this.dataTime = dataTime;
        setExposureType(exposureType);
    }

    /**
     * Retrieves the date and time of the exposure event.
     *
     * @return The date and time of the exposure event.
     */
    public LocalDateTime getDataTime() {
        return dataTime;
    }

    /**
     * Sets the date and time of the exposure event.
     *
     * @param dataTime The date and time to set for the exposure event.
     */
    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    /**
     * Retrieves the type of exposure.
     *
     * @return The type of exposure.
     */
    public String getExposureType() {
        return exposureType;
    }

    /**
     * Sets the type of exposure.
     * Throws an IllegalArgumentException if the provided exposure type is not 'D' or 'I'.
     *
     * @param exposureType The exposure type to set ('D' for Direct, 'I' for Indirect).
     * @throws IllegalArgumentException If the exposure type is not 'D' or 'I'.
     */
    public void setExposureType(String exposureType) {
        if ("D".equalsIgnoreCase(exposureType) || "I".equalsIgnoreCase(exposureType)) {
            this.exposureType = exposureType;
        } else {
            throw new IllegalArgumentException("Enter data is wrong; kindly enter 'D' or 'I'.");
        }
    }

    /**
     * Retrieves the unique identifier (UUID) of the patient associated with the exposure.
     *
     * @return The patient's UUID.
     */
    public UUID getPatientId() {
        return patientId;
 }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataTime == null) ? 0 : dataTime.hashCode());
        result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
        return result;
    }

    /**
     * Checks if the exposure object is equal to another object.
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
        Exposure other = (Exposure) obj;
        if (dataTime == null) {
            if (other.dataTime != null)
                return false;
        } else if (!dataTime.equals(other.dataTime))
            return false;
        if (patientId == null) {
            if (other.patientId != null)
                return false;
        } else if (!patientId.equals(other.patientId))
            return false;
        return true;
    }


	@Override
	public String toString() {
		return "Exposure [patientId=" + patientId + ", dataTime=" + dataTime + ", exposureType=" + exposureType + "]";
	}
	
    
}

