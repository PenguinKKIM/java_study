package exc;

class Account {
	String id;
	String name;
	int balance;

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

class Bank {
	Account[] accs = new Account[100];
	int accCnt; // 생성된 계좌의 갯수를 관리

	void makeAcount(String id, String name, int money) {
		Account acc = new Account();
		acc.id = id;
		acc.name = name;
		acc.balance = money;
		accs[accCnt++] = acc;
	} // 만들어서 accCnt 에 넣어야함

	void allAccountInfo() { // id를 가지고 계좌찾기
		for (int i = 0; i < accCnt; i++) {
			System.out.println(accs[i].info());// Account 에서 가져온 메소드 임미다
		}
	}

//
	Account searchAccById(String id) {
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].id.equals(id)) {
				return accs[i];
			}
		}
		return null;
	}

	void accountInfo(String id) {
		Account account = searchAccById(id);
		if (account == null) {
			System.out.println("계좌번호가 다릅니다");
			return;
		}
		System.out.println(account.info());
	}

	void withdraw(String id, int money) {
		Account account = searchAccById(id);
		if (account == null) {
			System.out.println("계좌번호가 다릅니다");
			return;
		}
		account.withdraw(money);
	}

	void deposit(String id, int money) {
		Account account = searchAccById(id);
		if (account == null) {
			System.out.println("계좌번호가 다릅니다");
			return;
		}
		account.deposit(money);
	}

	public class ClassTeat5_1 {
		public void main(String[] args) {

			Bank bank = new Bank();
			bank.makeAcount("10001", "고길동", 1000000); // 계좌번호, 이름, 잔액
			bank.makeAcount("10002", "김길동", 2000000); // 계좌번호, 이름, 잔액

			bank.allAccountInfo();

			System.out.println();
			bank.accountInfo("10001");

			bank.withdraw("10001", 10000); // 출금
			bank.accountInfo("10001"); // 출금한 금액이 나와야함

			bank.deposit("10001", 50000); // 입금
			bank.accountInfo("10001"); // 입금한 금액이 나와야함
		}
	}
}
