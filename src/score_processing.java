import java.awt.*;
import java.awt.event.*;
public class score_processing extends Frame implements WindowListener,ActionListener {
	GridLayout G1 = new GridLayout(2,1);
	GridLayout G2 = new GridLayout(5,2);
	
	Dialog D1 = new Dialog(this,"정보 입력");
	
	Frame F1 = new Frame("성적 입력");

	Panel P1 = new Panel();
	Panel P2 = new Panel();
	Panel P3 = new Panel();
	
	Button b1 = new Button("시작");
	Button b2 = new Button("끝내기");
	Button b3 = new Button("다음");
	Button b4 = new Button("뒤로");

	Label L1 = new Label("안녕하세요.미림여자정보과학고등학교 3학년 이미애입니다.");
	Label L2 = new Label("★성적처리프로그램★");
	Label L3 = new Label("학교이름을 입력해 주세요.");
	Label L4 = new Label("학년을 입력해주세요.(숫자만)");
	Label L5 = new Label("이름을 입력해주세요.");
	Label L6 = new Label("입력하실 과목 수를 입력해주세요.");
	
	TextField TF1 = new TextField();
	TextField TF2 = new TextField();
	TextField TF3 = new TextField();
	TextField TF4 = new TextField();
	
	score_processing(){
		super("성적처리 프로그램");
		P1.setLayout(G1);
		P2.add(L1);
		P2.add(L2);
		P1.add(P2);
		
		P3.add(b1);
		D1.setSize(400,200);//정보 입력
		b1.addActionListener(this);
		D1.setLayout(G2);
		D1.add(L3);
		D1.add(TF1);
		D1.add(L4);
		D1.add(TF2);
		D1.add(L5);
		D1.add(TF3);
		D1.add(L6);
		D1.add(TF4);
		b3.addActionListener(this);
		D1.add(b3);
		
		F1.setSize(500,500);
	
		b4.addActionListener(this);
		D1.add(b4);
		
		b2.addActionListener(this);
		P3.add(b2);	
		P1.add(P3);

		this.add(P1);
		this.addWindowListener(this);
		this.setSize(500,500);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		String schoolname = TF1.getText();
		String grade = TF2.getText();
		String name = TF3.getText();

		TF1.selectAll();
		TF2.selectAll();
		TF3.selectAll();
		Label L7 = new Label(schoolname + " " + grade + "학년 " + name + "학생 안녕하세요. 만나서 반갑습니다.");
		F1.add(L7);

		   if(e.getSource()==b1){// 시작 버튼
				D1.setVisible(true);
			}
		   else if(e.getSource()==b2){
				System.exit(0);
		   }
		   else if(e.getSource()==b3){// 300 *300
				F1.setVisible(true);
				F1.setResizable(false);
				D1.setVisible(false);
			}
		   else if(e.getSource()==b4){//뒤로가기
				D1.setVisible(false);
			}
	}
	public void windowDeactivated(WindowEvent e){};
	public void windowActivated(WindowEvent e){};
	public void windowClosed(WindowEvent e){};
	public void windowClosing(WindowEvent e){
		System.exit(0);
	};
	public void windowDeiconified(WindowEvent e){};
	public void windowIconified(WindowEvent e){};
	public void windowOpened(WindowEvent e){};
	public static void main(String args[]) throws Exception {

		System.out.println("안녕하세요 미림여자정보과학고등학교 3학년 인터랙티브미디어과 이미애입니다.");
		System.out.println("★성적처리프로그램★");

		score_processing s_p = new score_processing();
		/*while(true){
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
		double avg = 0;

		for(int i = 1; i<=subjectnum; i++){
			System.out.print("과목을 입력해주세요 : ");
			subject = input.next();
			subjectsave[i-1] = subject;
			//System.out.println(subjectsave[i-1]);

			System.out.print(subject + "의 점수를 입력해주세요. : ");
			subjectgrade = input.nextDouble();
			if(subjectgrade>100){
				System.out.println("과목점수는 100점 이상 적으실 수 없습니다. 다시적어주세요.");
				System.out.print(subject + "의 점수를 입력해주세요. : ");
				subjectgrade = input.nextDouble();
			}
			else{
			subgradesave[i-1] = subjectgrade;
			//System.out.println(subgradesave[i-1]);
			}
			total +=subgradesave[i-1]; 
		}
		System.out.println(name + "학생의 총 점수는 " + total + "점 입니다." );
		avg = total/subjectnum;
		String avg2 = String.format("%.2f", avg);
		System.out.println(name + "학생의 평균은 " + avg2 +"입니다.");
	}*/
	}
}