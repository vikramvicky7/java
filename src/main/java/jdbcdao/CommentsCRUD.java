package jdbcdao;

import java.util.List;
import java.util.Scanner;

public class CommentsCRUD {

	public static void main(String[] args) {
		CommentsDAOImpl dao = new CommentsDAOImpl();

		Scanner s = new Scanner(System.in);

		int doFlag = -1;

		do {
			System.out.println("1.Insert\n2.Delete\n3.View All Comments");
			int ch = s.nextInt();
			s.nextLine();
			switch (ch) {
			case 1:

				System.out.println("Enter comments body");
				Comments com = new Comments(0, s.nextLine());

				int res = dao.insert(com);

				System.out.println("Rows inserted=" + res);

				break;

			case 2:
				System.out.println("Enter id of the comment to be deleted");
				int id = s.nextInt();
				s.nextLine();
				res = dao.delete(id);
				System.out.println("Rows deleted=" + res);
				break;

			case 3:

				List<Comments> list = dao.view();

				for (Comments comments : list) {
					System.out.println(comments);
				}

				break;
			default:
				System.out.println("Invalid Input Choice");
			}

			System.out.println("RE RUN ? 1.YES\t2.NO");
			doFlag = s.nextInt();
			s.nextLine();

		} while (doFlag == 1);

	}
}