import java.io.BufferedReader;
import java.io.InputStreamReader;


public class score_processing {
	public static void main(String args[]) throws Exception {
		System.out.println("�ȳ��ϼ��� �̸������������а���б� 3�г� ���ͷ�Ƽ��̵��� �̹̾��Դϴ�.");
		System.out.println("�ڼ���ó�����α׷���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.print("�б��� �Է����ּ��� : ");
		String schoolname = br.readLine();
		System.out.print("�г��� �Է����ּ���.(���ڸ� �Է�) : ");
		int grade = Integer.parseInt(br.readLine());
		System.out.print("�̸��� �Է����ּ���. : ");
		String name = br.readLine();
		
		System.out.println("�ȳ��ϼ���. " + schoolname +" " + grade + "�г� " + name + "�л� �ݰ����ϴ�.");
		
		System.out.print("������ �Է��Ͻ� ������� �Է����ּ���. : ");
		int subjectnum = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=subjectnum; i++){
			System.out.print("������ �Է����ּ��� : ");
			String subject = br.readLine();	
		}
	
	}

}
