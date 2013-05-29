import java.io.BufferedReader;
import java.io.InputStreamReader;


public class score_processing {
	public static void main(String args[]) throws Exception {
		System.out.println("안녕하세요 미림여자정보과학고등학교 3학년 인터랙티브미디어과 이미애입니다.");
		System.out.println("★성적처리프로그램★");
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.print("학교를 입력해주세요 : ");
		String schoolname = br.readLine();
		System.out.print("학년을 입력해주세요.(숫자만 입력) : ");
		int grade = Integer.parseInt(br.readLine());
		System.out.print("이름을 입력해주세요. : ");
		String name = br.readLine();
		
		System.out.println("안녕하세요. " + schoolname +" " + grade + "학년 " + name + "학생 반갑습니다.");
		
		System.out.print("점수를 입력하실 과목수를 입력해주세요. : ");
		int subjectnum = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=subjectnum; i++){
			System.out.print("과목을 입력해주세요 : ");
			String subject = br.readLine();	
		}
	
	}

}
