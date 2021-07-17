import java.util.
Scanner;
class AptitudeTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ques = new String[20];
		int inp = 0;
		int n = 0;
		int wn = 0;
		int skip = 0;

		System.out.println(" Welcome to the Quiz ");

		System.out.println("Enter Any Numaric Number to Start the Quiz ");
		int next = sc.nextInt();

		ques[0] =" Q1 : Who is PrimeMinister of India ? ";
		String[] opt1 = new String[4];
		opt1[0] ="1> Rahul Gandhi"; opt1[1]="2> Manmohan Singh "; opt1[2] = "3> Narendra Modi "; opt1[3] = "4> Atal Bihari Bajapai";

		ques[1] =" Q2 : Who is President of India ? ";
		String[] opt2 = new String[4];
		opt2[0] ="1> Ram Nath Kovind "; opt2[1]="2> Manmohan Singh "; opt2[2] = "3> Pranav Mukaharji"; opt2[3] = "4> Atal Bihari Bajapai";

		ques[2] =" Q3 : Who is Chief Minister of Uttar Pradesh ? ";
		String[] opt3 = new String[4];
		opt3[0] ="1> Naredra Modi"; opt3[1]="2> Yogi Aditya Nath "; opt3[2] = "3> Pranav Mukaharji"; opt3[3] = "4> Atal Bihari Bajapai";

		ques[3] =" Q4 : How many days in a year ? ";
		String[] opt4 = new String[4];
		opt4[0] ="1> 300 "; opt4[1]="2> 346 "; opt4[2] = "3> 369 "; opt4[3] = "4> 365 ";

		ques[4] =" Q5 : Which place is known as the roof of the world ? ";
		String[] opt5 = new String[4];
		opt5[0] ="1> Maldives "; opt5[1]="2> Nepal "; opt5[2] = "3> tibet "; opt5[3] = "4> Bhutan ";

		ques[5] =" Q6 : Which is the longest river on the earth ? ";
		String[] opt6 = new String[4];
		opt6[0] ="1> Nile "; opt6[1]="2> Ganga "; opt6[2] = "3> Sindhu "; opt6[3] = "4> Jhelam ";

		ques[6] =" Q7 : Which is the smallest continent ? ";
		String[] opt7 = new String[4];
		opt7[0] ="1> Asia "; opt7[1]="2> Australia "; opt7[2] = "3> Europe "; opt7[3] = "4> Africa ";

		ques[7] =" Q8 : Which is the fastest animal on the earth ? ";
		String[] opt8 = new String[4];
		opt8[0] ="1> Lion "; opt8[1]="2> Tiger "; opt8[2] = "3> Cheeta "; opt8[3] = "4> Jaguars ";

		ques[8] =" Q9 : Largest Democracy in the world ? ";
		String[] opt9 = new String[4];
		opt9[0] ="1> India "; opt9[1]="2> Australia "; opt9[2] = "3> America "; opt9[3] = "4> Africa ";

		ques[9] =" Q10 : Which is the largest State in india(By area) ? ";
		String[] opt10 = new String[4];
		opt10[0] ="1> Uttar Pradesh "; opt10[1]="2> Bihar "; opt10[2] = "3> Karnataka "; opt10[3] = "4> Rajsthan ";

		ques[10] =" Q11 : What is the most popular Sport througnt the world ? ";
		String[] opt11 = new String[4];
		opt11[0] ="1> Football "; opt11[1]="2> Cricket "; opt11[2] = "3> Soccer "; opt11[3] = "4> Vollyball ";

		ques[11] =" Q12 : What is hotest continent on the Earth ? ";
		String[] opt12 = new String[4];
		opt12[0] ="1> Asia "; opt12[1]="2> Europe "; opt12[2] = "3> Africa "; opt12[3] = "4> South America "; // 3

		ques[12] =" Q13 : What type of tree do dates grow on ? ";
		String[] opt13 = new String[4];
		opt13[0] ="1> Coconut "; opt13[1]="2> Pine "; opt13[2] = "3> Palm "; opt13[3] = "4> Birch ";//3

		ques[13] =" Q14 : Which is not among Seven Wonder of the world ? ";
		String[] opt14 = new String[4];
		opt14[0] ="1> Mecca Madina "; opt14[1]="2> Statue of Liberity "; opt14[2] = "3> Taj Mahal "; opt14[3] = "4> The Greate Wall of China ";

		ques[14] =" Q15 : Who was the first Indian in space ? ";
		String[] opt15 = new String[4];
		opt15[0] ="1> Vikaram Ambalal "; opt15[1]="2> Ravish Malhotra "; opt15[2] = "3> Rakesh Sharma "; opt15[3] = "4> Nagapathi Bhat ";

		ques[15] =" Q16 : Who build the Jama Masjid ? ";
		String[] opt16 = new String[4];
		opt16[0] ="1> Jahagir "; opt16[1]="2> Akabar "; opt16[2] = "3> Imam Bhukhari "; opt16[3] = "4> Shah Jahan ";

		ques[16] =" Q17 : Who was the first Indian scientist to win a Nobal Prize ? ";
		String[] opt17 = new String[4];
		opt17[0] ="1> CV Raman "; opt17[1]="2> Amartya Sen "; opt17[2] = "3> Hargobind Khorana "; opt17[3] = "4> Subramanian Chandrasekhar ";

		ques[17] =" Q18 : Who was the first Indian woman to win Miss World Title ? ";
		String[] opt18 = new String[4];
		opt18[0] ="1> Ashwarya Rai "; opt18[1]="2> Shusmita Sen  "; opt18[2] = "3> Diya Mirza "; opt18[3] = "4> Reita Faria ";//4

		ques[18] =" Q19 : Who was the first Indian to win the Booker Prize ? ";
		String[] opt19 = new String[4];
		opt19[0] ="1> Dhan Gopal Mukerji "; opt19[1]="2> Nirad C. Chaudhuri "; opt19[2] = "3> Arundhati Roy "; opt19[3] = "4> Arvind Adiga ";//3

		ques[19] =" Q20 : What is the state flower of Haryana ? ";
		String[] opt20 = new String[4];
		opt20[0] ="1> Lotus "; opt20[1]="2> Golden Shower "; opt20[2] = "3> Rhododendron "; opt20[3] = "4> Not Declared ";
		
		int[] q = new int[20];
		 q[0] = 3;
		 q[1] = 1;
		 q[2] = 2;
		 q[3] = 4;
		 q[4] = 3;
		 q[5] = 1;
		 q[6] = 2;
		 q[7] = 3;
		 q[8] = 1;
		 q[9] = 4;
		 q[10] = 3;
		 q[11] = 3;
		 q[12] = 3;
		 q[13] = 1;
		 q[14] = 3;
		 q[15] = 4;
		 q[16] = 1;
		 q[17] = 4;
		 q[18] = 3;
		 q[19] = 1;
		
		for (int i = 0 ; i < ques.length ; i++) {
			System.out.println("===================================================");
			System.out.println(ques[i]);
			if (i==0 ) {

			  for(int j = 0 ; j < opt1.length ; j++){
				System.out.println(opt1[j]+"  ");
			   }
			}   
			else if(i==1){
			  	for (int j = 0 ; j < opt2.length ; j++) {
			  		System.out.println(opt2[j]+"  ");
			  	}

			}else if (i==2) {
				for (int j = 0 ; j < opt3.length ; j++) {
			  		System.out.println(opt3[j]+"  ");
			  	}
				
			}else if (i==3) {
				for (int j = 0 ; j < opt4.length ; j++) {
			  		System.out.println(opt4[j]+"  ");
			  	}
				
			}else if (i==4) {
				for (int j = 0 ; j < opt5.length ; j++) {
			  		System.out.println(opt5[j]+"  ");
			  	}
				
			}else if (i==5) {
				for (int j = 0 ; j < opt6.length ; j++) {
			  		System.out.println(opt6[j]+"  ");
			  	}
				
			}else if (i==6) {
				for (int j = 0 ; j < opt7.length ; j++) {
			  		System.out.println(opt7[j]+"  ");
			  	}
				
			}else if (i==7) {
				for (int j = 0 ; j < opt8.length ; j++) {
			  		System.out.println(opt8[j]+"  ");
			  	}
				
			}else if (i==8) {
				for (int j = 0 ; j < opt9.length ; j++) {
			  		System.out.println(opt9[j]+"  ");
			  	}
				
			}else if (i==9) {
				for (int j = 0 ; j < opt10.length ; j++) {
			  		System.out.println(opt10[j]+"  ");
			  	}
				
			}else if (i==10) {
				for (int j = 0 ; j < opt11.length ; j++) {
			  		System.out.println(opt11[j]+"  ");
			  	}
				
			}else if (i==11) {
				for (int j = 0 ; j < opt12.length ; j++) {
			  		System.out.println(opt12[j]+"  ");
			  	}
				
			}else if (i==12) {
				for (int j = 0 ; j < opt13.length ; j++) {
			  		System.out.println(opt13[j]+"  ");
			  	}
				
			}else if (i==13) {
				for (int j = 0 ; j < opt14.length ; j++) {
			  		System.out.println(opt14[j]+"  ");
			  	}
				
			}else if (i==14) {
				for (int j = 0 ; j < opt15.length ; j++) {
			  		System.out.println(opt15[j]+"  ");
			  	}
				
			}else if (i==15) {
				for (int j = 0 ; j < opt16.length ; j++) {
			  		System.out.println(opt16[j]+"  ");
			  	}
				
			}else if (i==16) {
				for (int j = 0 ; j < opt17.length ; j++) {
			  		System.out.println(opt17[j]+"  ");
			  	}
				
			}else if (i==17) {
				for (int j = 0 ; j < opt18.length ; j++) {
			  		System.out.println(opt18[j]+"  ");
			  	}
				
			}else if (i==18) {
				for (int j = 0 ; j < opt19.length ; j++) {
			  		System.out.println(opt19[j]+"  ");
			  	}
				
			}else if (i==19) {
				for (int j = 0 ; j < opt20.length ; j++) {
			  		System.out.println(opt20[j]+"  ");
			  	}
				
			}

			System.out.println("Enter Your Answer your or press 0 to skip your Question ");
			inp = sc.nextInt();

			if(inp== 0){

				skip++;
				continue;
			}


			
			  if(inp >= 1 && inp <= 4){


			    for (int k = 0 ; k < q.length ; k++) {
			      if (q[i] == inp) {
				  n++;
			       System.out.println("Correct Answer");
			      break;				
			    }else{
			    	System.out.println("Wrong Answer");
			    	wn++;
			    	break;
			    }
			}
		  }else{
		  	System.out.println(" Please enter the Valid Input ");
		  	inp = sc.nextInt();
		  }
		
			System.out.println();
		}
		System.out.println("========================================");

		if(n >= 19){
			System.out.println(" Well Done ! You Done Greate Job");
			System.out.println("Your AptitudeTest Number is : "+n);
		}else if (n < 19 && n > 12) {
			System.out.println("Good ! But you need to Improve");
			System.out.println("Your AptitudeTest Number is : "+n);
		}else if (n < 12 && n > 7) {
			System.out.println("Just Pass ! Need to Work Hard ");
			System.out.println("Your AptitudeTest Number is : "+n);
		}else if (n < 7) {
			System.out.println("Fail ! Better luck next time");
			System.out.println("Your AptitudeTest Number is : "+n);		
		}

		System.out.println("Your Skip the Question "+skip);

		System.out.println("Total Numbers of wrong answer is : "+wn);

	}
}