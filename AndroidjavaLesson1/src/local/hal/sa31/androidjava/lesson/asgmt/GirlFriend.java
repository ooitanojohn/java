package local.hal.sa31.androidjava.lesson.asgmt;

public class GirlFriend {
	/**
	 * @var string 名前を表すプロパティ
	 */
	private String name;
	/**
	 * @var int 誕生年を表すプロパティ。
	 */
	private int birthYear;
	/**
	 * @var int 誕生月を表すプロパティ。
	 */
	private int birthMonth;
	/**
	 * @var int 誕生日を表すプロパティ。
	 */
	private int birthDay;

	/**
	 * コンストラクタ
	 * 
	 *  @param string name 名前
	 *  @param int birthyear 誕生年
	 *  @param int birthMonth 誕生月
	 *  @param int birthDay 誕生日
	 */
	public GirlFriend(String _name, int _birthYear, int _birthMonth, int _birthDay) {
		name = _name;
		birthYear = _birthYear;
		birthMonth = _birthMonth;
		birthDay = _birthDay;
	}

	/**
	* 引数で渡された月が誕生付きか判断するメソッド。
	* @param int $month 判定に使われる月。
	* @return boolean 誕生月の場合はtrue、そうでない場合はfalse
	*/
	public boolean isBirthMonth(int _month) {
		if (_month == birthMonth) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 引数で渡された年に何歳になるかを計算するメソッド。
	 * @param int year 計算の基となる年。
	 * @return int 年齢。
	 */
	public int getAge(int _year) {
		return _year - birthYear;
	}

	/**
	 * @return string _name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return int _birthMonth
	 */
	public int getBirthMonth() {
		return birthMonth;
	}

	/**
	 * @return int _birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * @return int _birthDay
	 */
	public int getBirthDay() {
		return birthDay;
	}

}
