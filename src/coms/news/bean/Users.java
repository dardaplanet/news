package coms.news.bean;

import java.util.Date;

public class Users {
	private Integer usersId;// 用户编号
	private String usersName;// 用户名
	private String usersPwd;// 用户密码
	private String fullName;// 真实姓名
	private String question;// 问题
	private String answer;// 答案
	private Integer usersSex;// 性别
	private Date usersBirthday;// 出生日期
	private String usersEmail;// 电子邮箱
	private Integer logins;// 登陆次数
	private Date firstLogin;// 注册时间
	private Date lastLogin;// 上次登录时间
	private String usersCell;// 电话
	private String usersAddr;// 住址
	private Integer verify;// 审核
	private Integer forbidden;// 禁止

	public Users() {
		super();
	}

	public Integer getUsersId() {
		return usersId;
	}

	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getUsersPwd() {
		return usersPwd;
	}

	public void setUsersPwd(String usersPwd) {
		this.usersPwd = usersPwd;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getUsersSex() {
		return usersSex;
	}

	public void setUsersSex(Integer usersSex) {
		this.usersSex = usersSex;
	}

	public Date getUsersBirthday() {
		return usersBirthday;
	}

	public void setUsersBirthday(Date usersBirthday) {
		this.usersBirthday = usersBirthday;
	}

	public String getUsersEmail() {
		return usersEmail;
	}

	public void setUsersEmail(String usersEmail) {
		this.usersEmail = usersEmail;
	}

	public Integer getLogins() {
		return logins;
	}

	public void setLogins(Integer logins) {
		this.logins = logins;
	}

	public Date getFirstLogin() {
		return firstLogin;
	}

	public void setFirstLogin(Date firstLogin) {
		this.firstLogin = firstLogin;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getUsersCell() {
		return usersCell;
	}

	public void setUsersCell(String usersCell) {
		this.usersCell = usersCell;
	}

	public String getUsersAddr() {
		return usersAddr;
	}

	public void setUsersAddr(String usersAddr) {
		this.usersAddr = usersAddr;
	}

	public Integer getVerify() {
		return verify;
	}

	public void setVerify(Integer verify) {
		this.verify = verify;
	}

	public Integer getForbidden() {
		return forbidden;
	}

	public void setForbidden(Integer forbidden) {
		this.forbidden = forbidden;
	}

	@Override
	public String toString() {
		return "Users [usersId=" + usersId + ", usersName=" + usersName + ", usersPwd=" + usersPwd + ", fullName="
				+ fullName + ", question=" + question + ", answer=" + answer + ", usersSex=" + usersSex
				+ ", usersBirthday=" + usersBirthday + ", usersEmail=" + usersEmail + ", logins=" + logins
				+ ", firstLogin=" + firstLogin + ", lastLogin=" + lastLogin + ", usersCell=" + usersCell
				+ ", usersAddr=" + usersAddr + ", verify=" + verify + ", forbidden=" + forbidden + "]";
	}

}
