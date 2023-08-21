package edu.disease.asn3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DiseaseFileRepository {
	private String Diseasefile;
	private String Patientfile;
	public void save(Disease[] disease,Patient[] patient) throws Exception
	{
		if(Diseasefile==null||Patientfile==null)
		{
			throw new IllegalArgumentException("The path is empty");
		}
		else {
			FileOutputStream fl=new FileOutputStream(Diseasefile);
			FileOutputStream f2=new FileOutputStream(Patientfile);
			ObjectOutputStream of=new ObjectOutputStream(fl);
			of.writeObject(disease);
			ObjectOutputStream od=new ObjectOutputStream(f2);
			od.writeObject(patient);
		}
	}
	public DiseaseAndPatient init(String FolderPath) throws Exception {
		this.Diseasefile=FolderPath+"diseases.dat";
		this.Patientfile=FolderPath+"Patient.dat";
		DiseaseAndPatient dp=null;
		if(Diseasefile==null||Patientfile==null)
		{
			throw new IllegalArgumentException("The path is empty");
		}
		else {
			FileInputStream fl=new FileInputStream(Diseasefile);
			FileInputStream f2=new FileInputStream(Patientfile);
			ObjectInputStream of=new ObjectInputStream(fl);
			Disease []d=(Disease[])of.readObject();
			ObjectInputStream od=new ObjectInputStream(f2);
			Patient[] p=(Patient[])od.readObject();
			dp=new DiseaseAndPatient();
			dp.setDiseases(d);
			dp.setPatients(p);
		}
		return dp;
	}
}