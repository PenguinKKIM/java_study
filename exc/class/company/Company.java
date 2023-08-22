class Employee {

	int eNum;
	String eName;
	String depart;
	int eSalary;

	Employee() {
	}

	Employee(int eNum, String eName, String depart, int eSalary) {
		eNum = this.eNum;
		eName = this.eName;
		depart = this.depart;
		eSalary = this.eSalary;
	}

	Employee(int eNum, String eName, String depart) {
		eNum = this.eNum;
		eName = this.eName;
		depart = this.depart;

	}

	Employee(int eNum, String eName) {
		eNum = this.eNum;
		eName = this.eName;

	}

	Employee(int eNum) {
		eNum = this.eNum;
	}

	int setBonuse(int bonuse) {
		eSalary += bonuse;
		return eSalary;
	}

	String info() {
		return "사번 : " + eNum + ", " + "이름 : " + eName + ", " + "부서 :  " + depart + "급여 : " + eSalary;
	}

}



//import java.util.ArrayList;

public class Company {
	Employee[] emps = new Employee[100];
	int empCnt = 0;
	
//	ArrayList<Employee> employees = new ArrayList<>();
//	
//	 void enter(Employee emp) {
//		employees.add(emp);
//		
//	}

	Employee searchByeNum(int eNum) {
		for (int i = 0; i < empCnt; i++) {
			if (emps[i].eNum == (eNum)) {
				return emps[i];
			}
		}
		return null;
	}
	



	void setBonuse(int eNum, int bonuse) {
		Employee employeeNum = searchByeNum(eNum);

		if (employeeNum == null) {
			System.out.println("그런 사람 없습니다");
			return;
		}
		employeeNum.setBonuse(bonuse);

	}

	void allEmpsInfo() {
		for (int i = 0; i < empCnt; i++) {
			System.out.println(emps[i].info());
		}
	}

	int getTotalPay() {
		int sum = 0;
		for (int i = 0; i < empCnt; i++) {
			sum += emps[i].eSalary;
		}
		return sum;
	}

	public static void main(String[] args) {
		Company com = new Company();

		Employee emp1 = new Employee(10001, "홍길동", "홍보부", 50000);
		Employee emp2 = new Employee(10002, "이펭긴", "총무부", 35000);
		Employee emp3 = new Employee(10003, "김희준", "개발부", 40000);

//		com.enter(emp1); // 사원들이 들어왔다는 뜻 ?
//		com.enter(emp2);
//		com.enter(emp3);

		com.setBonuse(10001, 10000); // 사원번호로 사원을 찾아서 그 사원의 급여에 10000원 추가

		com.allEmpsInfo();

		System.out.println("총 급여액 : " + com.getTotalPay()); // 월급 다 더하기
	}


}
