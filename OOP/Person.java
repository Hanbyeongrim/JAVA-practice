package ch08;

public class Person {
	public String personName;
	public int age;
	public int tall;
	public int weight;
	
	//기본 생성자
	public Person() {
		
	}
	//추가 생성자 - 생성자 작성하면 기본생성자는 제공하지 않으므로, 필요할 경우 기본생성자 추가
	public Person(String personName, int age, int tall, int weight) {
		this.personName = personName;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
	}
	
	public String showPersonInfo() {
		
		return "키가 " + tall + "이고 몸무게가" + weight +
				"킬로인 남성이 있습니다. 이름은 " + personName + "이고 나이는 " + age + "세입니다";
	}
}
