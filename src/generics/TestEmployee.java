package generics;

public class TestEmployee {
	public static void main(String[] args) {

		Meeting<Java> m1 = new Meeting<>(new Java());
		Meeting<Tester> m2 = new Meeting<>(new Tester());
		
		ReportMeeting rm = new ReportMeeting();
		rm.printReportJava(m1);
		rm.printReportTester(m2);
		
	}

}
