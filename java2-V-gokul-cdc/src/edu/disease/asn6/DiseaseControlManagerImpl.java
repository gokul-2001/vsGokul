package edu.disease.asn6;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Disease;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.InfectiousDisease;
import edu.disease.asn3.NonInfectiousDisease;

/**
 * Implementation of the DiseaseControlManager interface for managing diseases
 * and patients.
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager {
	private List<Disease> disease;
	private List<Patient> patient;
	int md, me, indexd = 0, indexp = 0;

	/**
	 * Constructs a DiseaseControlManagerImpl object with specified maximum limits
	 * for diseases and patients.
	 *
	 * @param maxDiseases The maximum number of diseases that can be managed.
	 * @param maxPatient  The maximum number of patients that can be managed.
	 * @throws IllegalArgumentException If either maxDiseases or maxPatient is not a
	 *                                  positive integer.
	 */
	public DiseaseControlManagerImpl() {
		disease=new ArrayList<>();
		patient=new ArrayList<>();
	}

	/**
	 * Adds a new disease to the disease management system.
	 *
	 * @param name       The name of the disease.
	 * @param infectious Whether the disease is infectious.
	 * @return The created Disease object, or null if the limit of diseases has been
	 *         reached.
	 * @throws IllegalStateException If the limit of diseases has been reached.
	 */
	@Override
	public Disease addDisease(String Name, boolean infectious) {
		if (infectious) {
			Disease d = new InfectiousDisease();
			disease.add(d);
			return d;
		} else {
			Disease d = new NonInfectiousDisease();
			disease.add(d);
			return d;
		}
	}

	/**
	 * Retrieves a disease based on its unique identifier.
	 *
	 * @param diseaseld The unique identifier of the disease.
	 * @return The Disease object if found, or null if not found.
	 */
	@Override
	public Disease getDisease(UUID diseaseld) {
		for (Disease d : disease) {
			if (d.getDiseaseId() == diseaseld) {
				return d;
			}
		}
		return null;
	}

	/**
	 * Adds a new patient to the patient management system.
	 *
	 * @param firstName    The first name of the patient.
	 * @param lastName     The last name of the patient.
	 * @param maxDiseases  The maximum number of diseases the patient can have.
	 * @param maxExposures The maximum number of exposures the patient can have.
	 * @return The created Patient object, or null if the limit of patients has been
	 *         reached.
	 * @throws IllegalStateException If the limit of patients has been reached.
	 */
	@Override
	public Patient addPatient(String firstName, String lastName) {
				Patient f = new Patient();
				f.setLastname(lastName);
				f.setFirstname(firstName);
				patient.add(f);
				return f;
	}

	/**
	 * Retrieves a patient based on their unique identifier.
	 *
	 * @param patientld The unique identifier of the patient.
	 * @return The Patient object if found, or null if not found.
	 */
	@Override
	public Patient getPatient(UUID patientld) {
		for (Patient p : patient) {
			if (p.getPatientId() == patientld) {
				return p;
			}
		}
		return null;
	}
	/**
	 * Associates a disease with a patient.
	 *
	 * @param patientld The unique identifier of the patient.
	 * @param diseaseld The unique identifier of the disease.
	 * @throws IllegalArgumentException If either the patient or disease is not
	 *                                  found.
	 */
	@Override
	public void addDiseaseToPatient(UUID patientld, UUID diseaseld) {
		Disease ds = null;
		Patient ps = null;
		int dg = 0, pg = 0;
		try {
			for (Disease d : disease) {
				if (d.getDiseaseId() == diseaseld) {
					ds = d;
					dg = 1;
					break;
				}
			}
			if (dg == 0) {
				throw new IllegalArgumentException("Disease not Found");
			}
			for (Patient p : patient) {
				if (p.getPatientId() == patientld) {
					ps = p;
					pg = 1;
					break;
				}
			}
			if (pg == 0) {
				throw new IllegalArgumentException("Patient not Found");
			}
			if (dg == 1 && pg == 1) {
				ps.addDiseaseId(ds.getDiseaseId());
			}
		} catch (IllegalArgumentException e) {

		}

	}

	/**
	 * Adds an exposure event to a patient's record.
	 *
	 * @param patientld The unique identifier of the patient.
	 * @param exposure  The Exposure object representing the exposure event.
	 * @throws IllegalArgumentException If the patient is not found.
	 */
	@Override
	public void addExposureToPatient(UUID patientld, Exposure exposure) {
		int pg = 0;
		Patient ps = null;
		try {
			for (Patient p : patient) {
				if (p.getPatientId() == patientld) {
					ps = p;
					pg = 1;
				}
			}
			if (pg == 0) {
				throw new IllegalArgumentException("Patient not Found");
			} else {
				ps.addExposure(exposure);
			}
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Get the array of Disease objects.
	 *
	 * @return An array of Disease objects stored within the container.
	 * @override The method overrides the getDisease() method defined in the
	 *           superclass or interface.
	 */
	@Override
	public List<Disease> getDisease() {
		// TODO Auto-generated method stub
		return disease;
	}

	/**
	 * Get the array of Patient objects.
	 *
	 * @return An array of Patient objects stored within the container.
	 * @override The method overrides the getPatient() method defined in the
	 *           superclass or interface.
	 */
	@Override
	public List<Patient> getPatient() {
		// TODO Auto-generated method stub
		return patient;
	}

}
