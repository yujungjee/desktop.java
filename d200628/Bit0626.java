package d200628;

import java.util.Scanner;

//<�п��ý���>
//1. �л����
//2. ������
//3. ��������ȸ
//4. ���ǵ��
//5. ������ȸ

public class Bit0626 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		Student[] students = new Student[3];
		
		while(true) {
			System.out.println("�п��ý���");
			System.out.println("�����ϼ���. [0.������, 1.�л����, 2.������, 3.������ ��ȸ, 4.���ǵ��, 5.������ȸ");
			num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("����");
				break;
			} else if (num == 1) {
				Student student = new Student();
				
				boolean bCar = false;
				do {
					System.out.println("�л���ȣ: ");
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
			System.out.println("�߰��� �� �����ϴ�.");
		}
	}
}