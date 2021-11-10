package api.lang.obj;

public class Person implements Cloneable {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름: " + this.name + "\n나이: " + this.age + "세";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(p.age == this.age) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동 실행(gc가 실행될 때)
		System.out.println(this.name + "이 소멸되었습니다");
		
	}
	
	//객체 복사 메서드
	//cloneable 인터페이스를 구현해서 사용해야 합니다.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	/*
	public void personInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
	}
	*/
	
}
