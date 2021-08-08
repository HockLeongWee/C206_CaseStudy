
public class CategoryCCA {

private String categoryName;
private int categoryID;

public CategoryCCA(String categoryName, int categordID) {
	super();
	this.categoryName = categoryName;
	this.categoryID = categordID;
}

public String getCategoryName() {
	return categoryName;
}

public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}

public int getCategordID() {
	return categoryID;
}

public void setCategordID(int categoryID) {
	this.categoryID = categoryID;
}
}