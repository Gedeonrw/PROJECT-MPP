package BugReportingSystem;

import java.time.LocalDate;

public class BackLog {
	private String bugId;
	private String bugTitle;
	private String description; 
	private LocalDate createDate;
	private BugStatus bugStatus;
	private LocalDate resolvedDate;
	public BackLog(String bugId, String bugTitle, String description, LocalDate createDate, BugStatus bugStatus,
			LocalDate resolvedDate) {
		
		this.bugId = bugId;
		this.bugTitle = bugTitle;
		this.description = description;
		this.createDate = createDate;
		this.bugStatus = bugStatus;
		this.resolvedDate = resolvedDate;
	}
	public String getBugId() {
		return bugId;
	}
	public String getBugTitle() {
		return bugTitle;
	}
	public String getDescription() {
		return description;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public BugStatus getBugStatus() {
		return bugStatus;
	}
	public LocalDate getResolvedDate() {
		return resolvedDate;
	}
	@Override
	public String toString() {
		return "BackLog [bugId=" + bugId + ", bugTitle=" + bugTitle + ", description=" + description + ", createDate="
				+ createDate + ", bugStatus=" + bugStatus + ", resolvedDate=" + resolvedDate + "]";
	}

	
	
}
