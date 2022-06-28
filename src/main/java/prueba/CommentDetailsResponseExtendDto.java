package prueba;

public class CommentDetailsResponseExtendDto extends CommentDetailsResponseDto {

	private long bookId;
	
	public CommentDetailsResponseExtendDto() {
		super();
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
}
