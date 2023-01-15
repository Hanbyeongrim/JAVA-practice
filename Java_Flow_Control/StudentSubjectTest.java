package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Kim");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim= new Student(1001, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("영어", 80);
		studentKim.addSubject("수학", 50);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();

	}

}
