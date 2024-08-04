package spring.di;

import spring.di.console.ExamConsole;
import spring.di.console.GridExamConsole;
import spring.di.entities.Exam;
import spring.di.entities.NewlecExam;

public class Program {

	public static void main(String[] args) {

		/*
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole();
		console.setExam(exam);
		console.print();
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/beans.xml");
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();

	
	
	}

}
