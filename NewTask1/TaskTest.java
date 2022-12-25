//package NewTask1;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class TaskTest {
//
//	public static void main(String[] args) {
//		
//	///////////////////////////////School Object//////////////////////////////////////
//		School school = new School();
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Departement> departemnt = new ArrayList<Departement>();
//		
//		System.out.print("Enter The Name Of The School: ");
//		String SchlName = sc.next();
//		
//		System.out.print("Enter School Location: ");
//		String SchlLocation = sc.next();
//		
//		System.out.print("Enter School Id: ");
//		int SchlId = sc.nextInt();
//		
//		
//		school.setSchoolName(SchlName);
//		school.setSchoolLocation(SchlLocation);
//		school.setSchoolId(SchlId);
//
//	///////////////////////////////////Department Object///////////////////////////////
//		
//		boolean choice = true;
//		
//		while (choice) {
//			Departement newDepartment = new Departement();
//			System.out.print("Enter Department Name: ");
//			newDepartment.setDepartementName(sc.next());
//		//	System.out.println(" List of Departemnt " + newDepartment.getDepartementName());
//			System.out.println("Enter Departement Id: ");
//			newDepartment.setDepartementId(sc.nextInt());
//		//	System.out.println(" Department Id: " + newDepartment.getDepartementId());
//
//		/////////////////////////////////////Teacher Object/////////////////////////////////
//		Teacher teacher = new Teacher();
//		//Scanner sc2 = new Scanner(System.in);
//		
//		System.out.print("Enter Teacher Name: ");
//		String teacherName = sc.next();
//		
//		System.out.print("Enter Teacher Id: ");
//		int teacherId = sc.nextInt();
//		
//
//		teacher.setTeacherName(teacherName);
//		teacher.setTeacherID(teacherId);
//
//		
//	//	System.out.println(" Teacher Name: " + teacher.getTeacherName());
//	//	System.out.println(" Teacher Id: " + teacher.getTeacherID());
//		
//		/////////////////////////////////////Student Object/////////////////////////////////
//		Student student = new Student();
//		//Scanner sc3 = new Scanner(System.in);
//		
//		System.out.print("Enter Student Name: ");
//		String studentName = sc.next();
//		
//		System.out.print("Enter Student Id: ");
//		int studentId = sc.nextInt();
//		
//		System.out.print("Enter Student Course: ");
//		String studentCourse = sc.next();
//		
//		student.setStudentName(studentName);
//		student.setStudentID(studentId);
//		student.setStudentCourses(studentCourse);
//
//	
//	//	System.out.println(" Student Name: " + student.getStudentName());
//	//	System.out.println(" Student Id: " + student.getStudentID());
//	//	System.out.println(" Student Course: " + student.getStudentCourses());
//		
//		/////////////////////////////////////Course Object/////////////////////////////////
//		Course course = new Course();
//		//Scanner sc4 = new Scanner(System.in);
//			
//		System.out.print("Enter Course Id: ");
//		int CourseId = sc.nextInt();
//		
//		course.setCourseID(CourseId);
//	//	System.out.println(" Course Id: " + course.getCourseID());
//
//		
//		/////////////////////////////////////Marks Object/////////////////////////////////
//		Mark mark = new Mark();
//		//Scanner sc5 = new Scanner(System.in);
//		
//		System.out.print("Enter Math Mark: ");
//		int mathMark = sc.nextInt();
//		
//		System.out.print("Enter Arabic Mark: ");
//		int arabicMark = sc.nextInt();
//		
//		mark.setMathMark(mathMark);
//		mark.setArabicMark(arabicMark);
//
//		
//		
//		//System.out.println(" Math Mark: " + mark.getmathMark());
//		//System.out.println(" Arabic Mark: " + mark.getArabicMark());
//		
//	///////////////////////////Output///////////////////////////////////////////
//		departemnt.add(newDepartment);
//
//	//	System.out.println(" School Name: " + school.getSchoolName());
//	//	System.out.println(" School Location: " + school.getSchoolLocation());
//	//	System.out.println(" School Id: " + school.getSchoolId());
//	//	System.out.println(" Departemnt Name: " + newDepartment.getDepartementName());
//	//	System.out.println(" Department Id: " + newDepartment.getDepartementId());
//	//	System.out.println(" Teacher Name: " + teacher.getTeacherName());
//	//	System.out.println(" Teacher Id: " + teacher.getTeacherID());
//	//	System.out.println(" Student Name: " + student.getStudentName());
//	//	System.out.println(" Student Id: " + student.getStudentID());
//	//	System.out.println(" Student Course: " + student.getStudentCourses());
//	//	System.out.println(" Course Id: " + course.getCourseID());
////	System.out.println(" Math Mark: " + mark.getmathMark());
////	System.out.println(" Arabic Mark: " + mark.getArabicMark());
//	
//		
//	
//		
////		boolean choice = true;
////		int userChoice;
////		Scanner sc = new Scanner(System.in);
////		while (choice) {
////			System.out.println("**** Menu ****");
////			System.out.println(" 1 - Object Chaining ");
////			System.out.println(" 2 - Exit ");
////			System.out.print(" Please Select Your Choice: ");
////			userChoice = sc.nextInt();
////
////			if (userChoice == 1) {
////
////				System.out.println(" You Are In Object Chaining! ");
////			} else if (userChoice == 2) {
////				choice = false;
////				System.out.println(" Quit Program ");
////			} else if (userChoice > 2) {
////				choice = false;
////				System.out.println(" Wrong Option! ");
////			}
////
////		}
//		System.out.println("Do you want add another Department 1 if yes");
//		int option = sc.nextInt();
//		if (option !=1) {
//		choice = false;
//			System.out.println(" School Name: " + school.getSchoolName());
//			System.out.println(" School Location: " + school.getSchoolLocation());
//			System.out.println(" School Id: " + school.getSchoolId());
//		for(Departement dept : departemnt) {
//			System.out.println(" Departemnt Name: " + newDepartment.getDepartementName());
//			System.out.println(" Department Id: " + newDepartment.getDepartementId());
//			System.out.println(" Teacher Name: " + teacher.getTeacherName());
//			System.out.println(" Teacher Id: " + teacher.getTeacherID());
//			System.out.println(" Student Name: " + student.getStudentName());
//			System.out.println(" Student Id: " + student.getStudentID());
//			System.out.println(" Student Course: " + student.getStudentCourses());
//			System.out.println(" Course Id: " + course.getCourseID());
//			System.out.println(" Math Mark: " + mark.getmathMark());
//			System.out.println(" Arabic Mark: " + mark.getArabicMark());
//
//		}
//		System.out.println("Thank you!");
//	}
//		
//}
//		sc.close();
//		
//	}
//}
package NewTask1;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskTest {
	public static void main(String[] args) {
		School school = new School();
		Scanner sc = new Scanner(System.in);
		ArrayList<Departement> departmentList = new ArrayList<Departement>();
		System.out.println(" Welcome to Our School System ");
		System.out.print("Enter School Name: ");
		String name = sc.next();
		school.setSchoolName(name);
		System.out.print("Enter School location: ");
		String location = sc.next();
		school.setSchoolLocation(location);
		System.out.print("Enter School ID: ");
		int id = sc.nextInt();
		school.setSchoolId(id);
		

		Boolean condtion1 = true;                ////Condition of the 1st while loop(Department)
		Boolean condtion2 = true;				 ////Condition of the 2nd while loop(Teacher)
		Boolean condtion3 = true;				 ////Condition of the 3rd while loop(Student)
		Boolean condtion4 = true;				 ////Condition of the 4th while loop(Course)
		
		while (condtion1) {
			///////////////////////////Department//////////////////////////////////
			Departement department1 = new Departement();
			System.out.print("Enter Department Name: ");
			department1.setDepartementName(sc.next());
			System.out.print("Enter Department Size: ");
			department1.setDepartementId(sc.nextInt());
			
			///////////////////////////Teacher//////////////////////////////////
			while(condtion2) {
			Teacher teacherr = new Teacher();
			/////////Teacher//////////
			System.out.print("Enter Teacher Name: ");
			teacherr.setTeacherName(sc.next());
			System.out.print("Enter Teacher id: ");
			teacherr.setTeacherID(sc.nextInt());
			
			
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
		    course.setCourseName(sc.next());
			System.out.print("Enter Course ID: ");
			course.setCourseID(sc.nextInt());
			////****Mark****////
			System.out.print("Enter Test1 Mark: ");
			course.mark1.setMathMark(sc.nextInt());
			System.out.print("Enter Test2 Mark: ");
			course.mark1.setArabicMark(sc.nextInt());
			System.out.print("Enter Final Grade Mark from 100: ");
			course.mark1.setEnglishMark(sc.nextInt());
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
		sc.close();	
	}	
}

