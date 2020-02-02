package refact;
public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int year = 2020;
		int month = 2; // 月
		int days = 1; // 日

		days = MonthCheck.chkDays(year, month);
		System.out.println("その月の日数は" + days + "です");
	}

}
