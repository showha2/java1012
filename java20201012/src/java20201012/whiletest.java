package java20201012;

public class whiletest {

	public static void main(String[] args) {
		//=>1부터 100까지 홀수의 합을 do~while로 해결 - 2500
		//횟수를 찾아야 합니다.
		//횟수를 찾아서 반복문을 만들고 그 안에 해결할 문장을 삽입
		
		//1씩 증가하는 형태로 해결
		int i=1;
		int sum = 0;
		do{
		    sum = sum + (2*i-1);
		    i=i+1;
		}while(i<51);
		System.out.println("sum:" + sum);
		
		//2씩 증가하는 형태로 해결
//		int i=1;
//		int sum = 0;
//		do{
//		    sum = sum + i;
//		    i=i+2;
//		}while(i<101);
//		System.out.println("sum:" + sum);

	}

}
