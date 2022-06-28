package prueba;

public class Comment {

	private Long commentId;
	
	private User user;
	private String comment;
	private int score;
	private Book book; 

	public Comment() {
		super();
	}

	public Comment(User user, String comment, int score) {
		super();

		this.user = user;
		this.comment = comment;
		this.score = score;
	}

	public Long getId() {
		return commentId;
	}

	public void setId(Long id) {
		this.commentId = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Long getCommentId() {
		return commentId;
	}
}
