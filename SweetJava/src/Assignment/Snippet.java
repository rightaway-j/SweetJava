package Assignment;

public class Snippet {
	public static void main(String[] args) {
		
		/*
		 * ======== �л��� ���� ��� ���ϱ�
		 * 	         ���� ���� ���� ���� ���
		 * ��ȣ��  85 60 70
		 * �̽±�  90 95 80
		 * ���缮  75 80 100
		 * ����	80 70 95
		 * �ڸ��100 65 80
		 * 
		 */
		String name[] = {"��ȣ��","�̽±�","���缮","����","�ڸ��"};
						// 0       1     2      3       4
		String sub[] = {"����", "����", "����" , "����", "���"};
						//0     1     2      3       4
		int score[][] = { {85,60,70},
		//		 4  2	   00 01 02
				          {90,95,80},
				        // 10 11 12  
				          {75,80,100},
				        // 20 21 22
				          {75,80,95},
				        // 30 31 32
				          {100,65,80}
				        // 40 41 42  
				        };
		
		int[] total = new int[3];
		
		System.out.println("======�л��� �����ϱ�");
		
		for(int n=0; n<sub.length; n++) {
		System.out.print("\t"+sub[n]);
		}  //����� ���
		System.out.println();
		
		for(int i=0; i < score.length; i++){
			// i�� j��
			// 85 60 70
			// 90 95 80
			// 75 80 10
			// 75 80 80
			//i�� ������ 0 1 2 3 4
			
			System.out.print(name[i]+"\t"); // �л� �̸� ���
			int sum=0; //���� ó������ 0
			
			
			for(int j=0; j < score[i].length; j++){
			//j�� ������ 0 1 2
			sum+=score[i][j];
			
			System.out.print(score[i][j]+"\t");//������ ���� ���
			}
		    System.out.println(sum + "\t" + sum/score[i].length + "\t");//������ ���� ���
		    //����ϰ� �ٹٲ�
		    
		    
		    
		}
	

			
		
		
			
		
		
		}


	}


