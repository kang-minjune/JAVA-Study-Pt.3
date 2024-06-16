package buyerReview2;
import java.util.Scanner;

public class TestBuy2 {

	public static void main(String[] args) {
		//길이가 10인 배열을 만든다
		//사용자로부터 숫자 1이 입력하면 Tv, 2는 컴퓨터, 0을 입력하면 종료
		//사용자가 선택한 제품의 인스턴스를 만들어서 배열에 저장하시요
		Product arr[] = new Product[4];
		Scanner sc = new Scanner(System.in);
		int n=0; int index = 0;
		while(index<arr.length) {
			n = sc.nextInt();
			switch(n) {
			case 1:
				arr[index] = new Tv();
				break;
			case 2:
				arr[index] = new Computer();
				break;
			}
			index++;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		return;
		
	}

}
