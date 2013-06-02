import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class score_processing {
	public static void main(String args[]) throws Exception {
		System.out.println("안녕하세요 미림여자정보과학고등학교 3학년 인터랙티브미디어과 이미애입니다.");
		System.out.println("★성적처리프로그램★");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("학교를 입력해주세요 : ");
		String schoolname = input.next();
		System.out.print("학년을 입력해주세요.(숫자만 입력) : ");
		int grade = input.nextInt();
		System.out.print("이름을 입력해주세요. : ");
		String name = input.next();
		
		System.out.println("안녕하세요. " + schoolname +" " + grade + "학년 " + name + "학생 반갑습니다.");
		
		System.out.print("점수를 입력하실 과목수를 입력해주세요. : ");
		int subjectnum =input.nextInt();
		
		String subject;
		String subjectsave[] = new String[subjectnum];
		double subjectgrade;
		double subgradesave[] = new double[subjectnum];
		double total = 0;

		for(int i = 0; i<=subjectnum; i++){
			System.out.print("과목을 입력해주세요 : ");
			subject = input.next();
			subjectsave[i] = subject;
			//System.out.println(subjectsave[i-0]);
			
			System.out.print(subject + "의 점수를 입력해주세요. : ");
			subjectgrade = input.nextDouble();
			subgradesave[i] = subjectgrade;
			//System.out.println(subgradesave[i-0]);
			
			total +=subgradesave[i-0]; 
			System.out.print(name + "학생의 총 점수는 " + total + "점 입니다." );
			
		}
	
	}

}
