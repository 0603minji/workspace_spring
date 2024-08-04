package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	private Exam exam;

	// 기본 생성자
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}

	// 생성자
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d\navg is %.2f\n", exam.total(), exam.avg());

	}

	//	setter
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
