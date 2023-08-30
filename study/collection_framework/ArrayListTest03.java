import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



class Account {
	String id;
	int balance;
	Account(){}
	Account(String id , int balance){
		this.id= id;
		this.balance= balance;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("계좌번호 : %s,  잔액 : %d",id, balance);
	}
}

class IdCompare implements Comparator<Account>{//

	@Override
	public int compare(Account o1, Account o2) {
		return o1.id.compareTo(o2.id);
	}
}

public class ArrayListTest03  {

	public static void main(String[] args) {
		List<Account> accs = new ArrayList<>();
		accs.add(new Account ("김희준",100));
		accs.add(new Account ("펭귄",300));
		accs.add(new Account ("달퐁이",200));
		
		Collections.sort(accs, new IdCompare());
//		for(Account acc : accs ) {
//			System.out.println(accs);
//		} //향상된 for 문 :조회만할거면..
		
//		for(int i =0; i< accs.size(); i++) {
//			System.out.println(accs.get(i));
//		} //반복문의 반복횟수를 변경하는것이있다면 체크해야함
		
		//반복자 -벡터에도 구버전이있다..
		Iterator<Account> it = accs.iterator(); //java.util.Iterator
		while(it.hasNext()) {
			//next : 리턴이오면 데이터 리턴 후 다음으로 넘어감
			//증감연산자랑 비슷, 삭제하거나 수정할거면 반복자 사용권장
			Account acc = it.next(); 
			System.out.println(acc);
		}
	}

}
