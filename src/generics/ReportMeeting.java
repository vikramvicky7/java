package generics;

public class ReportMeeting {
	
	public void printReportJava(Meeting<? super Java> mj) {
		System.out.println("Print report  for java");
		mj.printH();
		
	}
	public void printReportTester(Meeting<? extends Tester> mt) {
		System.out.println("Print report for Tester");
		mt.printH();
		
	}
}
