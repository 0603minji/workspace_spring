package spring.di.console;

import spring.di.entities.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole() {
	
	}


	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}



	@Override
	public void print() {
		System.out.println("------------------------");
		 System.out.printf("    total      avg\n");
		System.out.println("------------------------");
		 System.out.printf("    %d         %.2f\n", exam.total(), exam.avg());
		System.out.println("------------------------");
	}
}
