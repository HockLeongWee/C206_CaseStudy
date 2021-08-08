public class CCA extends CategoryCCA{
	private String name;
	private String description;
	private int classsize;
	private String dayoftheweek;
	private String time;
	private String venue;
	private String instructorname;

	public CCA(String name, String description, int classsize, String dayoftheweek, String time, String venue,
			String instructorname, String categoryName, int categordID) {
		super(categoryName, categordID);
		this.name = name;
		this.description = description;
		this.classsize = classsize;
		this.dayoftheweek = dayoftheweek;
		this.time = time;
		this.venue = venue;
		this.instructorname = instructorname;
	}

	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}

	public int getClasssize() {
		return classsize;
	}

	public String getDayoftheweek() {
		return dayoftheweek;
	}

	public String getTime() {
		return time;
	}

	public String getVenue() {
		return venue;
	}

	public String getInstructorname() {
		return instructorname;
	}

}
