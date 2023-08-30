

class Data<T> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

public class genericTest01 {
	public static void main(String[] args) {
		Data<String> d = new Data<>();
		d.setData("Kim");
		String s = d.getData();
		System.out.println(s);

		Data<Integer> d2 = new Data<>();
		d2.setData(200);
		int n = d2.getData();
		System.out.println(n);

//		Data<Person> d3 = new Data<>();
//		d3.setData("Kim", 30);
//		Person p = d3.getData();
//		System.out.println(p);

//	d2 = d //다른 타입으로생성된 객체는 동일한 클래스가 아니다
//	d3 = d4 //O,같은타입으로 생성된객체는 동일하다

	}
}
