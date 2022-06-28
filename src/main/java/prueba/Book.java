package prueba;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private Long id;
	private String title;
	private String summary;
	private String author;
	private String editorial;
	private int publicationYear;
	
	private List<Comment> comments = new ArrayList<>();

	public Book() {
		super();
	}

	public Book(long id, String title) {
		super();
		this.title = title;
		this.id = id;
	}
	
	public Book(String title, String summary, String author, String editorial, int publicationYear) {
		super();
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.editorial = editorial;
		this.publicationYear = publicationYear;
	}

	public Book(String title, long id, String summary, String author, String editorial, int publicationYear) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.editorial = editorial;
		this.publicationYear = publicationYear;
	}
	

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment comment) {
        comments.add(comment);
    } 
	
    public void removeComment(Comment comment) {
        comments.removeIf(c -> c.getId() == comment.getId());
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
