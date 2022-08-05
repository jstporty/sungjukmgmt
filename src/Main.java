
public class Main {
	public static void main(String[] args) {
		Student[] array = new Student[100];
		Input input = new Input(array);
		int count = input.input();
		
		Calc calc=new Calc(array);
		calc.calc(count);
		
		Sort sort=new Sort(array, count);
		sort.bubbleSort();
		
		Output output=new Output();
		output.print(array, count);
		System.out.println("성적관리 프로그램 끝");
		
	}
}
