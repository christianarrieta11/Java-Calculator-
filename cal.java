import java.util.Scanner;

class cal{

         public static void main(String args []){
         
         Scanner cal = new Scanner (System.in);
         double fnum,snum,answer,thirdnum,fouthnum,fifthnum,sixnum,sevennum,eightnum;
         System.out.println("enter first num");
         fnum = cal.nextDouble();
         
         System.out.println("enter 2nd num");
         snum = cal.nextDouble();
         
         answer = fnum + snum;
         
         System.out.println(answer);
         
          
         System.out.println("enter 3rd num");
         thirdnum = cal.nextDouble();
         
         System.out.println("enter 4rd num");
         fouthnum = cal.nextDouble();
         
         answer = thirdnum * fouthnum;
         
         System.out.println(answer);
         
         
         
           System.out.println("enter fifth numbrt");
         fifthnum = cal.nextDouble();
         
         System.out.println("enter six numer");
         sixnum = cal.nextDouble();
         
         answer = fifthnum / sixnum;
         
         System.out.println(answer);
         
         
            System.out.println("enter sevennumber ");
         sevennum = cal.nextDouble();
         
         System.out.println("enter eightnumber ");
         eightnum = cal.nextDouble();
         
         answer = sevennum - eightnum;
         
         System.out.println(answer);

         


         
         }
   }