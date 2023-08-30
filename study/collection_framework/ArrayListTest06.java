import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest06 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(nums);
		//3의 나머지가 0인 수를 지워라
		nums.removeIf(n -> (n%3) == 0); //n -> (n%3) == 0   -> 뒤값이 참이면 (n%3) 의 값을 삭제하라는것
		//람다식 : Arrow f. 랑 비슷한거인듯
		System.out.println(nums);
	}
}
