package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public interface DiseaseControlManager {
	public Disease addDisease(String name,boolean infectious); 
	public Disease getDisease(UUID diseaseId);
	public Patient addPatient(String firstName,String lastName,int maxDiseases,int maxExposures);
	public Patient getPatient(UUID patientId);
	public void addDiseaseToPatient(UUID diseaseId  ,UUID patientId);
	public void addExposureToPatient(UUID patientId, Exposure exposure);

}
