package jdbcdao;

import java.util.List;
import java.util.Scanner;

public class PostCRUD {
	public static void main(String[] args) {

		PostsDAOImpl dao = new PostsDAOImpl();

		Scanner s = new Scanner(System.in);

		int doFlag = -1;

		do {
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.View All Posts\n5.Search a Post");
			int ch = s.nextInt();
			s.nextLine();
			switch (ch) {
			case 1:

				System.out.println("Enter Post title and body");
				Posts post = new Posts(0, s.nextLine(), s.nextLine());

				int res = dao.insert(post);

				System.out.println("Rows inserted=" + res);

				break;

			case 2:
				System.out.println("Enter id of the Post to be updated");
				int id = s.nextInt();
				s.nextLine();
				System.out.println("Enter new title and body of the Post to be updated");

				res = dao.update(new Posts(id, s.nextLine(), s.nextLine()));

				System.out.println("Rows updated=" + res);
				break;

			case 3:
				System.out.println("Enter id of the Post to be deleted");
				id = s.nextInt();
				s.nextLine();
				res = dao.delete(id);
				System.out.println("Rows deleted=" + res);
				break;

			case 4:

				List<Posts> list = dao.view();

				for (Posts p : list) {
					System.out.println(p);
				}

				break;

			case 5:
				System.out.println("Enter id of the Post to be searched");
				id = s.nextInt();
				s.nextLine();
				post = dao.view(id);
				System.out.println(post);
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
