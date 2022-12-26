package NewTask1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TaskTest {
	public static void main(String[] args) {
		School school = new School();
		Scanner sc = new Scanner(System.in);
		ArrayList<Departement> departmentList = new ArrayList<Departement>();
		Stack<String> stackView = new Stack<String>();
		
		System.out.println(" Welcome to Our School System ");
		System.out.print("Enter School Name: ");
		String name = sc.next();
		school.setSchoolName(name);
		stackView.push(name);
		System.out.print("Enter School location: ");
		String location = sc.next();
		stackView.push(location);
		school.setSchoolLocation(location);
		System.out.print("Enter School ID: ");
		Integer id = sc.nextInt();
		school.setSchoolId(id);
		stackView.push(id.toString());
		

		Boolean condtion1 = true;                ////Condition of the 1st while loop(Department)
		Boolean condtion2 = true;				 ////Condition of the 2nd while loop(Teacher)
		Boolean condtion3 = true;				 ////Condition of the 3rd while loop(Student)
		Boolean condtion4 = true;				 ////Condition of the 4th while loop(Course)
		
		while (condtion1) {
			///////////////////////////Department//////////////////////////////////
			Departement department1 = new Departement();
			System.out.print("Enter Department Name: ");
			String depName = sc.next();
			department1.setDepartementName(depName);
			stackView.push(depName);
			System.out.print("Enter Department Size: ");
			Integer depSize = sc.nextInt();
			department1.setDepartementId(depSize);
			stackView.push(depSize.toString());
			
			///////////////////////////Teacher//////////////////////////////////
			while(condtion2) {
			Teacher teacherr = new Teacher();
			/////////Teacher//////////
			System.out.print("Enter Teacher Name: ");
			String teachName = sc.next();
			teacherr.setTeacherName(teachName);
			stackView.push(teachName);
			System.out.print("Enter Teacher id: ");
			Integer teacId = sc.nextInt();
			teacherr.setTeacherID(teacId);
			stackView.push(teacId.toString());
			
			
			///////////////////////////Student//////////////////////////////////
			while(condtion3) {
			Student student = new Student();
			System.out.print("Enter Student Name: ");
			student.setStudentName(sc.next());
			System.out.print("Enter Student ID: ");
			student.setStudentID(sc.nextInt());
			
			///////////////////////////Course//////////////////////////////////
			while(condtion4) {
			Course course = new Course();
			System.out.print("Enter Course Name: ");
			String courseName = sc.next();
		    course.setCourseName(courseName);
		    stackView.push(courseName);
			System.out.print("Enter Course ID: ");
			Integer courseId = sc.nextInt();
			course.setCourseID(courseId);
			stackView.push(courseId.toString());
			
			
			////****Mark****////
			System.out.print("Enter Test1 Mark: ");
			course.mark1.setMathMark(sc.nextDouble());
			System.out.print("Enter Test2 Mark: ");
			course.mark1.setArabicMark(sc.nextDouble());
			System.out.print("Enter Final Grade Mark from 100: ");
			course.mark1.setEnglishMark(sc.nextDouble());
			student.courseList.add(course);
			System.out.println("Do you want add another Course? Press (1) if yes, Press any number if No");
			int option4 = sc.nextInt();
			if(option4 != 1) {
				condtion4 = false;
				
			
			}
   }
			/////////Adding Student to arrayList of student//////////
			/////////if statement to exit the while loop//////////
			teacherr.studentList.add(student);
			System.out.println("Do you want add another Student? Press (1) if yes, Press any number if No");
			int option3 = sc.nextInt();
			if(option3 != 1) {
				condtion3 = false;
				
			}
			condtion4 = true;
   }
			/////////Adding Teacher to arrayList of teacher//////////
			/////////if statement to exit the while loop//////////
			department1.teacherList.add(teacherr);
			System.out.println("Do you want add another Teacher? Press (1) if yes, Press any number if No");
			int option2 = sc.nextInt();
			if(option2 != 1) {
				condtion2 = false;
				
			}
			condtion3 = true;
	}
			
			/////////Adding Department to arrayList of department//////////
			/////////if statement to exit the while loop//////////
			departmentList.add(department1);
			System.out.println("Do you want add another Department? Press (1) if yes, Press any number if No");
			condtion2 = true;
			condtion3 = true;
			int option = sc.nextInt();
			if (option != 1) {
				condtion1 = false;
				System.out.println("************** School Details ************** ");
				System.out.println("School location :" + school.getSchoolLocation());
				System.out.println("School Name :" + school.getSchoolName());
				System.out.println("School ID :" + school.getSchoolId());
				System.out.println("==================== Department Details ====================");
			for (Departement dept : departmentList) {
					System.out.println(" Department Name : " + dept.getDepartementName());
					System.out.println(" Department ID : " + dept.getDepartementId());
				for (Teacher teach : dept.teacherList) {
						System.out.println("==================== Teacher Details ====================");
						System.out.println(" Teacher Name : " + teach.getTeacherName());
						System.out.println(" Teacher ID : " + teach.getTeacherID());
						//System.out.println("==================== Student List ====================");
					for (Student stdn : teach.studentList) {
							System.out.println("==================== Student and Other Details ====================");
							System.out.println("Student Name : " + stdn.getStudentName());
							System.out.println(" Student ID :" + stdn.getStudentID());
							for (Course course : stdn.courseList) {
								System.out.println("==================== Course Details ====================");
								System.out.println("Course Name : " + course.getCourseName());
								System.out.println("Course ID : " + course.getCourseID());
								System.out.println("Test1 Mark : " + course.mark1.getmathMark());
								System.out.println("Test2 Mark : " + course.mark1.getArabicMark());
								System.out.println("Final Greade from 100 : " + course.mark1.getEnglishMark());

						}
					}
				}
				System.out.println("====================================================");
				}
				System.out.println(" End of the program, Thank you!");
			}
		}
		
		System.out.println(" ************** School Details **************");
		for(String s: stackView) {
			System.out.println("====================================================");
			System.out.println(s);
			
			
		}
		
		sc.close();	
	}	
}

