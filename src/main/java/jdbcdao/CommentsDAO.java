package jdbcdao;

import java.util.List;

public interface CommentsDAO {

	int insert(Comments com);

	int delete(int id);

	List<Comments> view();

	Comments view(int id);

}
