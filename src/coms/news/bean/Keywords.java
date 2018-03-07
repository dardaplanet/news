package coms.news.bean;

public class Keywords {
	private String keyId;// 关键字
	private String keyName;// 关键字编号

	public Keywords() {
		super();
	}

	public String getKeyId() {
		return keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	@Override
	public String toString() {
		return "Keywords [keyId=" + keyId + ", keyName=" + keyName + "]";
	}

}
