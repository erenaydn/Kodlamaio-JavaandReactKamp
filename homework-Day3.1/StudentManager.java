package kodluyoruzioHomework3;

public class StudentManager {
	public void studentWorkDone(Student user) {
		
		System.out.println(user.getStudentId()+"  ��renci idsi olan ��renci "+user.getStudentWork()+" adl�  �devi tamamlad�");
		
		
	}
	public void addStudentWork(Student user) {
		System.out.println(user.getFirstName()+" adl� ��renci "+user.getStudentWork() +" adl� �devi ekledi.");
	}

}
