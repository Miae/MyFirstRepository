import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class score_processing extends Frame implements WindowListener,ActionListener {
	GridLayout G1 = new GridLayout(2,1);
	GridLayout G2 = new GridLayout(4,2);
	
	Dialog D1 = new Dialog(this,"���� �Է�");

	Panel P1 = new Panel();
	Panel P2 = new Panel();
	Panel P3 = new Panel();
	
	Button b1 = new Button("����");
	Button b2 = new Button("������");
	Button b3 = new Button("����");
	Button b4 = new Button("�ڷ�");

	Label L1 = new Label("�ȳ��ϼ���.�̸������������а���б� 3�г� �̹̾��Դϴ�.");
	Label L2 = new Label("�ڼ���ó�����α׷���");
	Label L3 = new Label("�б��̸��� �Է��� �ּ���.");
	Label L4 = new Label("�г��� �Է����ּ���.(���ڸ�)");
	Label L5 = new Label("�̸��� �Է����ּ���.");
	
	TextField TF1 = new TextField();
	TextField TF2 = new TextField();
	TextField TF3 = new TextField();
	
	score_processing(){
		super("����ó�� ���α׷�");
		P1.setLayout(G1);
		P2.add(L1);
		P2.add(L2);
		P1.add(P2);
		
		P3.add(b1);
		D1.setSize(400,200);//���� �Է�
		b1.addActionListener(this);
		D1.setLayout(G2);
		D1.add(L3);
		D1.add(TF1);
		D1.add(L4);
		D1.add(TF2);
		D1.add(L5);
		D1.add(TF3);
		D1.add(b3);
		b4.addActionListener(this);
		D1.add(b4);
		
		P3.add(b2);
		P1.add(P3);

		this.add(P1);
		this.addWindowListener(this);
		this.setSize(400,400);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		   if(e.getSource()==b1){// ���� ��ư
				D1.setVisible(true);
			}
		   else if(e.getSource()==b4){//�ڷΰ���
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
