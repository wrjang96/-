import java.util.Scanner;

public class BJ1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String [] arr = a.split(" "); 

		// + �Է� �ȵ��� ��� ����ó�� ����
		// ó�� ���ϸ� ArrayIndexOutOfBounds ���� �� 
		if(arr.length > 0) {
			if(arr[0].equals("")) {
				System.out.println((arr.length - 1));
			}
			else {
				System.out.println((arr.length));
			}
		}
		else {
			System.out.println("0");	
		}
	}
}
