package BugReportingSystem;

import java.util.List;

public class Project {

	private String projectName;
	private String projectId;
	
	List<Developer> developers;
	List<Tester> testers;
	
	public Project(String projectName, String projectId) {
		
		this.projectName = projectName;
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public String getProjectId() {
		return projectId;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", projectId=" + projectId + "]";
	}
	
	
}
