import java.util.*;

class os
{
 public static void main(String kj[])
 {
   System.out.print("The 10 students whi will be attending the event are : a,b,c,d,e,f,g,h,i,j\n");
   System.out.println("------------------------------------------------------------------------");
   System.out.print("It is important to know their arrival time and their priority which is the number of gifts they have\n");
   System.out.println("---------------------------------------");
   System.out.println("Student\tAT Gifts");

   int a1, a2, b1, b2, c1, c2, d1, d2, e1, e2, f1, f2, g1, g2, h1, h2, i1, i2, j1, j2;


   Scanner sc = new Scanner(System.in);
   
   System.out.print("a\t");
   a1 = sc.nextInt();
   a2 = sc.nextInt();
   System.out.print("b\t");
   b1 = sc.nextInt();
   b2 = sc.nextInt();
   System.out.print("c\t");
   c1 = sc.nextInt();
   c2 = sc.nextInt();
   System.out.print("d\t");
   d1 = sc.nextInt();
   d2 = sc.nextInt();
   System.out.print("e\t");
   e1 = sc.nextInt();
   e2 = sc.nextInt();
   System.out.print("f\t");
   f1 = sc.nextInt();
   f2 = sc.nextInt();
   System.out.print("g\t");
   g1 = sc.nextInt();
   g2 = sc.nextInt();
   System.out.print("h\t");
   h1 = sc.nextInt();
   h2 = sc.nextInt();
   System.out.print("i\t");
   i1 = sc.nextInt();
   i2 = sc.nextInt();
   System.out.print("j\t");
   j1 = sc.nextInt();
   j2 = sc.nextInt();
   
   char names[] = {'a','b','c','d','e','f','g','h','i','j'};
   int arr[][] = {{a1,b1,c1,d2,e1,f1,g1,h1,i1,j1},{a2,b2,c2,d2,e2,f2,g2,h2,i2,j2}};

    

   System.out.print("\n\n\n");


    int n = 10;
        for (int iu = 0; iu < n-1; iu++) 
        { 

            int min_idx = iu; 
            for (int ju = iu+1; ju < n; ju++) 
                if (arr[0][ju] < arr[0][min_idx]) 
                    min_idx = ju; 
  
           
            int temp = arr[0][min_idx]; 
            arr[0][min_idx] = arr[0][iu]; 
            arr[0][iu] = temp;
            
            temp = arr[1][min_idx]; 
            arr[1][min_idx] = arr[1][iu]; 
            arr[1][iu] = temp;
        } 
    /////////////////////////////////////////////////////////////

    for(int iu=0;iu<10;iu++)
    {
        if (iu==9)
        {break;}
        int start = iu;
        int end = iu;
        int pointer = start+1;

        while(pointer<10 && arr[0][pointer]==arr[0][start])
        {
            end+=1;
            pointer+=1;
        }

    


    for (int iu1 = start; iu1 < end; iu1++) 
        { 
            int min_idx = iu1; 
            for (int ju1 = iu1+1; ju1 < end; ju1++) 
                if (arr[1][ju1] < arr[1][min_idx]) 
                    min_idx = ju1; 
  
            
            int temp = arr[1][min_idx]; 
            arr[1][min_idx] = arr[1][iu1]; 
            arr[1][iu1] = temp;
        } 
    
   

    }
    System.out.print("\n\n\n");

   


    int at,pr,t_n;

    System.out.print("\n\n----------------------------\nOrder of billed students\n----------------------------\n");

    for(int t=0;t<10;t++)
    {   

        
        at = arr[0][t];
        pr = arr[1][t];
        for(int gh =0;gh<10;gh++)
        {
            if (arr[0][gh]==at && arr[1][gh]==pr)
            {
                System.out.println("Student : "+names[gh]+" Arrival Time : "+at+" Priority : "+pr);
                break;
            }
        }



    }

  }
}
