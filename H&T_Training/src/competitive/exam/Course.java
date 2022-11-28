package competitive.exam;

public class Course {
	
	private int courseId;
	private String courseName;
	private String courseTeacher;
	private double courseDuration;
	private double totalFees;
	
	
	
	public Course(int courseId, String courseName, String courseTeacher, double courseDuration, double totalFees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
		this.courseDuration = courseDuration;
		this.totalFees = totalFees;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}



	public double getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(double courseDuration) {
		this.courseDuration = courseDuration;
	}



	public double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseTeacher=" + courseTeacher
				+ ", courseDuration=" + courseDuration + ", totalFees=" + totalFees + "]";
	}

}
