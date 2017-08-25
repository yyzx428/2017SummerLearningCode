import java.io.IOException;
import java.util.Scanner;

public class example {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n=in.nextInt();
			int sum=0;
			int num=0;;
			for(int i=0;i<n;i++) {
				num|=in.nextInt();
			}
			
			while(num!=0) {
				sum+=num&1;
				num>>=1;
			}
			
			System.out.println(sum);
		}
	}
}
