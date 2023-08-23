package edu.disease.asn4;

import edu.disease.asn3.Exposure;
import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.Patient;

public class ContactTrace {
static Patient[] pa;
PatientZero patientobj;
	public PatientZero findPatientZero(Patient patient) {
		edu.disease.asn3.Exposure[]r=patient.getExposures();
		for(Exposure e:r) {
			if(e.getExposureType().equals("D")) {
			for(Patient p:pa) {
				if (e.getExposureType().equals("D")) {
					if (e.getDataTime().isBefore(e.getDataTime())) {
						patientobj = new PatientZero();
						patientobj.setExposureDateTime(e.getDataTime());
						patientobj.setExposed(true);
						return findPatientZero(p);

					
					}
				}
			}

		}
	}
		return patientobj;
}
	

	public ContactTrace(DiseaseControlManager diseaseControlManager) {
	this.pa = diseaseControlManager.getPatients();
		
	}
	
}