package OOP_0315;

import java.time.LocalDate;

public class Student {
	
	// private로 지정하면 외부에서 접근할 방법이 없음
	private String name;
	private int birthYear;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthYear(int birthYear) {
		if(birthYear >= 1900) {
			this.birthYear = birthYear;
			return;
		}
	}
	
	public String getName() {
		return name;
	}
	
	// 나이 계산 메서드
	public int getAge() {
		LocalDate d = LocalDate.now();
		// 현재 시각 정보, 현재 날짜 정보 출력 
		int year = d.getYear();
		return (year - birthYear);
	}
	
	
}
