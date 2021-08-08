import java.lang.*;
import java.math.BigInteger;
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
 
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        // ���� 1�� ��Ÿ���� ���� ������
        int start = 1;
        int end = N;
        for(int i = 0; i < M; i++){
            a = a.multiply(new BigInteger(String.valueOf(end--)));
            b = b.multiply(new BigInteger(String.valueOf(start++)));
            // ū ������ ������ �� �� �ڹٿ����� BigInteger�� ����Ѵ�.
            // BigInteger�� ���ڿ��� �Է� ������ ������ �Ѵ�. 
        }
        BigInteger ans = a.divide(b);
        bw.write(ans + "\n");

        bw.flush();
        br.close();
        bw.close();
 
    }
}
