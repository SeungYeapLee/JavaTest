import java.util.Scanner;

public class enumTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			int inp, cnt = 0;
			do {
				inp = scanner.nextInt();
				if (inp == 0)
					break;
				if (!((inp % 3 == 0) || (inp % 5 == 0))) {
					cnt++;
				}
			} while (true);
			System.out.println(cnt);
		} finally {
			if (scanner != null)
				scanner.close();
		}
		System.out.println("나는 이승엽입니다");
	}
}
