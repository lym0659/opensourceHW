import java.util.*;
public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		    String correct_pw = "hyin";
		    String input_pw;
		    
		    Scanner scan = new Scanner(System.in);
		    
		    // �ڵ带 �ۼ��ϼ���.
		    int i = 1;
		    
		    
		    while (i < 4) {
		      System.out.println("��ȣ�� �Է��ϼ���.");
		      input_pw = scan.nextLine();
		      if (input_pw.equals(correct_pw)) {
		        System.out.println("ȯ���մϴ�.");
		        break;
		      }
		      else {
		        i++;
		        System.out.println("��ȣ�� Ʋ���ϴ�.");
		      }
		      while (i == 4) {
		        System.out.println("������ �ź��մϴ�.");
		        break;
		      }    
		    }
		  
		
	}

}
