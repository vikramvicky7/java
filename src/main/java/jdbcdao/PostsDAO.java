package jdbcdao;

import java.util.List;

public interface PostsDAO {
	int insert(Posts post);

	int update(Posts post);

	int delete(int id);

	List<Posts> view();

	Posts view(int id);

}
