package OOP_0602;

import java.util.*;

public class CollectionTest2 {

	public static void main(String[] args) {
		HashMap<String, Integer> nameAge = new HashMap<>();
		nameAge.put("배석민", 23);		// 키와 값의 쌍으로 데이터를 저장
		int age = nameAge.get("배석민");	// 키의 값으로 그에 대응되는 값을 인출
		System.out.println("배석민의 나이 : " + age);
		
		// HashMap 방법
		nameAge.put("일지매", 30);
		nameAge.put("박문수", 40);
		
		age = nameAge.get("박문수");
		System.out.println("박문수의 나이 : " + age);
		
		// 우리반의 조가 6개조가 있다.
		// 각 조의 조원들 이름을 HashMap을 이요해서 저장하고자 한다.
		// 즉, "4조" : ["정승민", "김지훈", "이민혁", "유재경", "배석민"] ...
		
		HashMap<String, ArrayList<String>> teams = new HashMap<>();
		ArrayList<String> team1 = new ArrayList<>();
		team1.add("이재일");
		team1.add("김지훈");
		team1.add("이주현");
		team1.add("하현진");
		team1.add("임서연");
		team1.add("장준호");
		
		ArrayList<String> team2 = new ArrayList<>();
		team2.add("김일곤");
		team2.add("김범창");
		team2.add("박수헌");
		team2.add("김건우");
		
		ArrayList<String> team3 = new ArrayList<>();
		team3.add("강주원");
		team3.add("김규민");
		team3.add("김동준");
		team3.add("박정민");
		team3.add("석진석");

		ArrayList<String> team4 = new ArrayList<>();
		team4.add("정승민");
		team4.add("김지훈");
		team4.add("이민혁");
		team4.add("유재경");
		team4.add("배석민");
		
		teams.put("1조", team1);
		teams.put("2조", team2);
		teams.put("3조", team3);
		teams.put("4조", team4);
		
		printTeamMember("4조", teams);
	}

	public static void printTeamMember(String teamName, HashMap<String, ArrayList<String>> teams) {
		ArrayList<String> members = teams.get(teamName);
		System.out.println(teamName + "의 멤버들");
		for (String member : members) {
			System.out.println(member);
		}
		System.err.println();
	}
}
