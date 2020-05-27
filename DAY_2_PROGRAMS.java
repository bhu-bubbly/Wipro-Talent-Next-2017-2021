
   PROGRAM -- 1

       import java.util.*;
       public class Main
   { 
         public static void main(String[] args) {
         int n,max; 
         max=0; 
         int[] a; 
         a = new int[25];
         for(int i=0;i<25;i++)
          { 
                     Scanner sc = new Scanner(System.in); 
                     n=sc.nextInt(); a[i] = n;
          }
         for(int i=0;i<25;i++) 
              if(a[i]>max)
                 max=a[i]; 
         System.out.println("max=" +max); 
    } 

=================================================

     PROGRAM -- 2

       import java.util.*;
       public class Main
    { 
             public static void main(String[] args)
            {
              int n,max,c; 
             max=0; 
             c=0;
             int[] a; 
             a = new int[10]; 
           for(int i=0;i<10;i++)
           { 
               Scanner sc = new Scanner(System.in);
               n=sc.nextInt();
              a[i] = n; 
          }     
          for(int i=0;i<10;i++)
          { 
             if(a[i]>max) 
                 max=a[i];
             if(max==a[i]) 
                 c+=1;
          } 
      System.out.println("max count=" +c); 
         }
    }
===========================================================

      PROGRAM -- 3
 
      import java.util.*;
      public class Main
   { 
       public static void main(String args[])
      { 
         int i,n,fact=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
      { 
          fact=fact*i; 
      }
        System.out.println("Factorial of "+n+" is: "+fact); 
      } 
    }
===============================================================



















































