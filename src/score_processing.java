import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class score_processing extends Frame implements WindowListener {
	GridLayout G1 = new GridLayout(3,1);

	Panel P1 = new Panel();

	Label L1 = new Label("�ȳ��ϼ���.�̸������������а���б� 3�г� �̹̾��Դϴ�.");
	Label L2 = new Label("�ڼ���ó�����α׷���");

	score_processing(){
		super("����ó�� ���α׷�");
		//P1.setLayout(G1);
		P1.add(L1);
		P1.add(L2);

		this.add(P1);
		this.addWindowListener(this);
		this.setSize(400,400);
		this.setVisible(true);
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

		System.out.println("�ȳ��ϼ��� �̸������������а���б� 3�г� ���ͷ�Ƽ��̵��� �̹̾��Դϴ�.");
		System.out.println("�ڼ���ó�����α׷���");

		score_processing s_p = new score_processing();
		/*while(true){
		Scanner input = new Scanner(System.in);

		System.out.print("�б��� �Է����ּ��� : ");
		String schoolname = input.next();
		System.out.print("�г��� �Է����ּ���.(���ڸ� �Է�) : ");
		int grade = input.nextInt();
		System.out.print("�̸��� �Է����ּ���. : ");
		String name = input.next();

		System.out.println("�ȳ��ϼ���. " + schoolname +" " + grade + "�г� " + name + "�л� �ݰ����ϴ�.");

		System.out.print("������ �Է��Ͻ� ������� �Է����ּ���. : ");
		int subjectnum =input.nextInt();

		String subject;
		String subjectsave[] = new String[subjectnum];
		double subjectgrade;
		double subgradesave[] = new double[subjectnum];
		double total = 0;
		double avg = 0;

		for(int i = 1; i<=subjectnum; i++){
			System.out.print("������ �Է����ּ��� : ");
			subject = input.next();
			subjectsave[i-1] = subject;
			//System.out.println(subjectsave[i-1]);

			System.out.print(subject + "�� ������ �Է����ּ���. : ");
			subjectgrade = input.nextDouble();
			if(subjectgrade>100){
				System.out.println("���������� 100�� �̻� ������ �� �����ϴ�. �ٽ������ּ���.");
				System.out.print(subject + "�� ������ �Է����ּ���. : ");
				subjectgrade = input.nextDouble();
			}
			else{
			subgradesave[i-1] = subjectgrade;
			//System.out.println(subgradesave[i-1]);
			}
			total +=subgradesave[i-1]; 
		}
		System.out.println(name + "�л��� �� ������ " + total + "�� �Դϴ�." );
		avg = total/subjectnum;
		String avg2 = String.format("%.2f", avg);
		System.out.println(name + "�л��� ����� " + avg2 +"�Դϴ�.");
	}*/
	}
}
