package d200628;

/*
 * 1�� - ����
 * �ڹ� Ŭ������ �ۼ��ϴ� ������ �غ���. 
 * ���� main() �޼ҵ带 �����Ͽ��� �� ���ÿ� ���� ��µǵ��� TV Ŭ������ �ۼ��϶�.
   public static void main(String[] args) {
   TV myTV = new TV("LG", 2017, 32); //LG���� ���� 2017�� 32��ġ
   myTV.show();
}
LG���� ���� 2017���� 32��ġ TV
 */

class TV {
	private String company;
	private int year;
	private int size;
	
	public TV(String company, int year, int size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(company + "���� ���� " + year + "���� " + size + "��ġ TV");
	}
}

public class StudyEx01 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
