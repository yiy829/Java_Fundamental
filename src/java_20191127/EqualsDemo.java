package java_20191127;

class Car {
	String modelNumber;
	String color;

	Car(String modelNumber, String color) {
		this.modelNumber = modelNumber;
		this.color = color;
	}
	// alt + shift + s => Generate hashCode() & Equals() 클릭
	// -> 옵션 하나만 맞으면 맞다고 할건지, 둘다 맞으면 맞다고 할건지
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}
	
	
	//toString() 메소드의 Overriding. 이상한게 안찍히고 밑에 요구한 내용이 나옴
	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", color=" + color + "]";
	}

	// alt + shift + s => Generate toString() => 일반적으로 위에 두개만 찍음
	// 참조변수를 디버깅할때 많이 사용
	
}

public class EqualsDemo {
	public static void main(String[] args) {
		Car c1 = new Car("000001", "black");
		Car c2 = new Car("000001", "black");
		// Car c2 = c1;

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		// 이렇게 하면 reference내부의 값이 같은지를 비교할 수 있다.
		// JVM에선 객체가 다른걸 인지하고 있음.
		
		System.out.println(c1); // = System.out.println(c1.toString());
		// @뒤에 숫자는 해쉬코드 
		
		
		
	}
}
