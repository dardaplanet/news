package coms.news.bean;

public class Column {
	private Integer columnId;// 栏目ID
	private String columnName;// 栏目名称

	public Column() {
		super();
	}

	public Integer getcolumnId() {
		return columnId;
	}

	public void setcolumnId(Integer columnId) {
		this.columnId = columnId;
	}

	public String getcolumnName() {
		return columnName;
	}

	public void setcolumnName(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public String toString() {
		return "Column [columnId=" + columnId + ", columnName=" + columnName + "]";
	}

}
