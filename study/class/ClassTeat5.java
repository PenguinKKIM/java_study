class Account{
	String id;
	String name;
	int balance;
	
	
	int deposit(int money) {
		balance += money;
		return balance;
	}
	
	int withdraw(int money) {
		if(balance>=money)balance -= money;
		return balance;
	}

	String info() {
		return "계좌번호 : "+ id +", "+ "이름 : " + name + ", " + "잔액 : " + balance; 
	}

}

class Bank {
	Account[] accs = new Account[100];
	int accCnt; //생성된 계좌의 갯수를 관리
	
	void makeAcount(String id, String name, int money) {
		Account acc = new Account();
		acc.id =id;
		acc.name= name;
		acc.balance=money;
		accs[accCnt++] = acc;
	} //만들어서 accCnt 에 넣어야함
	
	void allAccountInfo() {
		for(int i = 0; i < accCnt; i++) {
			System.out.println(accs[i].info());
		}
	}
	void accountInfo(String id) {
		System.out.println();
	}
	
	int withdraw(int money) {
		balance -= money;
		return  balance;
	}
	
	int deposit(int money) {
		balance += money;
		return balance;
	}
	
}

public class ClassTeat5 {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.makeAcount("10001", "고길동", 1000000); //계좌번호, 이름, 잔액
		bank.makeAcount("10002", "김길동", 2000000); //계좌번호, 이름, 잔액
		
		bank.allAccountInfo();
		bank.accountInfo("10001");
		
		bank.withdraw("10001", 10000); //출금
		bank.accountInfo("10001");
		
		bank.deposit("10001", 10000); //입금
		bank.accountInfo("10001");
		
//		Account acc1 = new Account();
//		acc1.id="10001";
//		acc1.name = "고길동";
//		acc1.balance = 100000;
//		
//		System.out.println(acc1.info());
//		
//		acc1.deposit(10000); //입금
//		System.out.println(acc1.info());
//		
//		acc1.withdraw(20000); //출금
//		System.out.println(acc1.info());
		
	}
}
