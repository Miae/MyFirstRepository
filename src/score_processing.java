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
		//System.out.println(name")
		System.out.println(name + "�л��� �� ������ " + total + "�� �Դϴ�." );
		avg = total/subjectnum;
		String avg2 = String.format("%.2f", avg);
		System.out.println(name + "�л��� ����� " + avg2 +"�Դϴ�.");
	}

}
