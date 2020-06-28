package d200628;

import java.util.Scanner;

//<학원시스템>
//1. 학생등록
//2. 강사등록
//3. 관련자조회
//4. 강의등록
//5. 강의조회

public class Bit0626 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		Student[] students = new Student[3];
		
		while(true) {
			System.out.println("학원시스템");
			System.out.println("선택하세요. [0.나가기, 1.학생등록, 2.강사등록, 3.관련자 조회, 4.강의등록, 5.강의조회");
			num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("종료");
				break;
			} else if (num == 1) {
				Student student = new Student();
				
				boolean bCar = false;
				do {
					System.out.println("학생번호: ");
					c.number = Integer.parselnt(scanner.nextLine());
				}
				
				
			} else if (num == 2) {
				
			} else if (num == 3) {
				
			} else if (num == 4) {
				
			} else if (num == 5) {
				
			}
		}
	}
}

class Student {
	public int number;
	public String name;
}

class Teacher {
	public int number;
	public String name;
}

class Lecture {
	public int number;
	public Teacher t;
	public int stuIndex;
	public Student[] students = new Student[10];
	
	public void addStudent(Student s) {
		if(stuIndex <= 10) {
			students[stuIndex++] = s;
		} else {
			System.out.println("추가할 수 없습니다.");
		}
	}
}