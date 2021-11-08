package inter.basic2;

//클래스의 사용 방법을 정의해 놓는 클래스의 틀 역할을 한다.
public interface Printer {

	void turnOn();
	void turnOff();
	void print(String document);
	void colorPrint(String document, String color);
	int copy(int n);
	
	
}
