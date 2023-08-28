import java.util.Scanner;

public class NumberGame {
    public void guessnumber()
    {
        Scanner sc=new Scanner(System.in);
        int number1= 1 + (int)(100 * Math.random());
        int number2= 1 + (int)(100 * Math.random());
       
        int guess_nr,score=0;
        int L=2,T=5;
        System.out.println("The number should between 1 to 100.");
        System.out.println("YOu have 2 level and  5 Trails.");
         

        for(int i=1;i<=L;i++)
        {
           System.out.println("Level:"+i);
           System.out.println();

            for(int j=0;j<T;j++)
            {

             System.out.println("Enter the guess number:");
             guess_nr=sc.nextInt();
             
              if(guess_nr==number1)
              {
              System.out.println("you won the "+i+" Level.");
              score+=i;
              break;
              }
              
              else if(guess_nr>number1 && j!=T)
              System.out.println("The Guesed the Number is Greater.");
              else if(guess_nr<number1 && j!=T)
              System.out.println("The Guesed the Number is Smaller.");
              
  
            }

            System.out.println("..........................................");
            System.out.println("The level "+i+" is Over.");
            System.out.println();
              System.out.println("The Actual Number is:"+number1);
            System.out.println("..........................................");
          
            //take diffeent number for different level
            number1=number2;


        }
            
           //disply score in percentage
         System.out.println("Yours score :"+((score/4)*100)+"%.");


    }
    public static void main(String[] args) {
        NumberGame obj=new NumberGame();
        obj.guessnumber();
    }
}
