package local.hal.sa31.androidjava.lesson.asgmt;


public class BirthdayReminderKai {

	public static void main(String[] args) {
		GirlFriend[] girlFriends = new GirlFriend[6];
		girlFriends[0] = new GirlFriend("まゆみ", 1999, 1, 5);
		girlFriends[1] = new GirlFriend("さちこ", 2004, 5, 15);
		girlFriends[2] = new GirlFriend("まい", 1997, 5, 25);
		girlFriends[3] = new GirlFriend("なみ", 2000, 8, 3);
		girlFriends[4] = new GirlFriend("えり", 2002, 11, 19);
		girlFriends[5] = new GirlFriend("りえ", 1998, 12, 23);
		
		for (int i = 1; i <= 12; i++) {
			System.out.println("■■■■" + i + "月です");
			Boolean flag = false;
			for (GirlFriend girlFriend : girlFriends) {
				if(girlFriend.isBirthMonth(i)) {
					System.out.println(girlFriend.getName() + "ちゃんが" + girlFriend.getBirthMonth() + "月に誕生日です。" + girlFriend.getAge(2022)+ "歳になります。メッセージを送りましょう！");
					flag = true;
				}
			}
			if(!flag) {
				System.out.println("誕生日を迎える女性はいません。安心してください。");
			}
			
		}
	}
	
}
