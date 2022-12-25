package NewTask1;
import java.util.ArrayList;


public class School {
	private String schoolName;
	private String schoolLocation;
	private int schoolId;
	
	ArrayList<Departement> Dep = new ArrayList<Departement>();
	
	/////School Name/////
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolName() {
		return schoolName;
	}

	/////School Location/////
	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}
	public String getSchoolLocation() {
		return schoolLocation;
	}
	
	/////School ID/////
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public int getSchoolId() {
		return schoolId;
	}
	
	
	
	void addDepartement(String departementName) {
		Departement newDepartment = new Departement();
		newDepartment.setDepartementName(departementName);
		Dep.add(newDepartment);
	}
	
	
	
	
}