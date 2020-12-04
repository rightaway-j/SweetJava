package Assignment;

public class Snippet {
	public static void main(String[] args) {
		
		/*
		 * ======== 학생별 과목별 평균 구하기
		 * 	         국어 수학 영어 총점 평균
		 * 강호동  85 60 70
		 * 이승기  90 95 80
		 * 유재석  75 80 100
		 * 하하	80 70 95
		 * 박명수100 65 80
		 * 
		 */
		String name[] = {"강호동","이승기","유재석","하하","박명수"};
						// 0       1     2      3       4
		String sub[] = {"국어", "과학", "수학" , "총점", "평균"};
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
		
		System.out.println("======학생별 과목구하기");
		
		for(int n=0; n<sub.length; n++) {
		System.out.print("\t"+sub[n]);
		}  //과목명 출력
		System.out.println();
		
		for(int i=0; i < score.length; i++){
			// i행 j열
			// 85 60 70
			// 90 95 80
			// 75 80 10
			// 75 80 80
			//i가 돌때는 0 1 2 3 4
			
			System.out.print(name[i]+"\t"); // 학생 이름 출력
			int sum=0; //총합 처음값은 0
			
			
			for(int j=0; j < score[i].length; j++){
			//j가 돌때는 0 1 2
			sum+=score[i][j];
			
			System.out.print(score[i][j]+"\t");//과목의 점수 출력
			}
		    System.out.println(sum + "\t" + sum/score[i].length + "\t");//과목의 총점 평균
		    //출력하고 줄바꿈
		    
		    
		    
		}
	

			
		
		
			
		
		
		}


	}


