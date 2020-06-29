package d200628;

/*
 * 1번 - 문제
 * 자바 클래스를 작성하는 연습을 해보자. 
 * 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
	   public static void main(String[] args) {
	   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
	   myTV.show();
	}
	LG에서 만든 2017년형 32인치 TV
 */

class TV {
	public String company;
	public int year;
	public int size;

	public TV(String company, int year, int size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}

	public void TvPrint() {
		System.out.println(company + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
}

public class StudyEx01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.TvPrint();
	}
}
