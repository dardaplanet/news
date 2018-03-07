package coms.news.bean;

public class Comment {
	private Integer commentId;// 评论编号
	private String commentContent;// 评论内容

	public Comment() {
		super();
	}

	public Integer getcommentId() {
		return commentId;
	}

	public void setcommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getcommentContent() {
		return commentContent;
	}

	public void setcommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentContent=" + commentContent + "]";
	}

}
