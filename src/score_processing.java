import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class score_processing {
	public static void main(String args[]) throws Exception {
		System.out.println("�ȳ��ϼ��� �̸������������а���б� 3�г� ���ͷ�Ƽ��̵��� �̹̾��Դϴ�.");
		System.out.println("�ڼ���ó�����α׷���");
		
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

		for(int i = 0; i<=subjectnum; i++){
			System.out.print("������ �Է����ּ��� : ");
			subject = input.next();
			subjectsave[i] = subject;
			//System.out.println(subjectsave[i-0]);
			
			System.out.print(subject + "�� ������ �Է����ּ���. : ");
			subjectgrade = input.nextDouble();
			subgradesave[i] = subjectgrade;
			//System.out.println(subgradesave[i-0]);
			
			total +=subgradesave[i-0]; 
			System.out.print(name + "�л��� �� ������ " + total + "�� �Դϴ�." );
			
		}
	
	}

}
