package prueba;

public class CommentDetailsResponseDto extends CommentResponseDto {

	private long id;
	private int score;
	
	public CommentDetailsResponseDto() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
