package bankProj;

class Account {
	String id;
	String name;
	int balance;

	Account(String id, String name, int balance) { //가장 가까운 지역변수를 먼저 인식하기때문에 이름이 달라야한다
		id = this.id;
		name =  this.name;
		balance =  this.balance;
	}

	Account(String id, String pName) {
		id = this.id;
		name = pName;
	}

	Account(String pId) {
		id = pId;
	}

	int deposit(int money) {
		balance += money;
		return balance;
	}

	int withdraw(int money) {
		if (balance >= money)
			balance -= money;
		return balance;
	}

	String info() {
		return "계좌번호 : " + id + ", " + "이름 : " + name + ", " + "잔액 : " + balance;
	}

}