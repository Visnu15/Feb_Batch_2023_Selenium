package week5.day5.w5d5assignment;

public class Students {
    public void getStudentInfo(int id) {
    	System.out.println("Id: " + id);
    }
    public void getStudentInfo(int id, String name) {
    	System.out.println("Id: " + id + ", " + "Name: " + name);
    }
    public void getStudentInfo(String email, long phoneNumber) {
    	System.out.println("Email: " + email);
    	System.out.println("Phone: " + phoneNumber);
    }
    
    public static void main(String[] args) {
		Students student = new Students();
		student.getStudentInfo(54162);
		student.getStudentInfo(54162, "Visnu");
		student.getStudentInfo("abc@gmail.com", 9874012365l);
	}
}
