import java.util.Scanner;

public class Input {
	private Student[] array;
	private Scanner sc;

	public Input(Student[] array) {
		this.array = array;
		this.sc = new Scanner(System.in);
	}

	public int input() {
		String io = null;
		int count = 0;

		do {
			count++;
			System.out.println("hakbun"); String hakbun=this.sc.nextLine();
			System.out.println("name"); String name=this.sc.nextLine();
			System.out.println("Korean"); int kor=this.sc.nextInt();
			System.out.println("english"); int eng=this.sc.nextInt();
			System.out.println("Math"); int mat=this.sc.nextInt();
			System.out.println("EDPS"); int dep=this.sc.nextInt();
			this.sc.nextLine(); //buffer날리기
			
			this.array [count-1]=new Student(hakbun, name,kor,eng, mat, dep);
			
			System.out.println("계속(i/o)?:  ");
			io = this.sc.next();
		} while (io.equals("I") || io.equals("i"));
		return count;
	}
}
