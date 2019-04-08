package jdbcdao;

public class Comments {

	private int id;
	private String body;

	public Comments() {

	}

	public Comments(int id, String body) {
		super();
		this.id = id;
		this.body = body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + " body=" + body + "]";
	}

}
