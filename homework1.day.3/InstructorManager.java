package kodluyoruzioHomework3;

public class InstructorManager  extends User{
	
	public void addInstructorCourse(Instructor user){
		System.out.println(user.getInstructorCourse()+" adl� kurs " + user.getInstructorId()+" kullan�c� idsi ile eklenmi�tir.");
	}

}
