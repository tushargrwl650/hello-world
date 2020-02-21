public class Main  {
    public static void main(String[] args) {
      Scanner ob = new Scanner(System.in);
        int n1 =3, m1=4;
        int n2=4, m2=3;
        
        /*System.out.println(" Enter size of 1st matrix: ");
        n1 =  ob.nextInt();
        m1 =  ob.nextInt();*/
       
        int A[][] = new int[n1][m1];
       
        System.out.println(" Enter elements of 1st matrix: ");
        for(int i=0;i<n1;i++)
        {
          for(int j=0;j<m1;j++)
          {
            A[i][j] = ob.nextInt();
          }
        }
       
       /* System.out.println(" Enter size of 2nd matrix: ");
        n2 =  ob.nextInt();
        m2 =  ob.nextInt();*/
       
        if(m1 != n2)
        System.out.println("Matix muliplicaton can't be perfomed");
        else
        {
            int[][] B = new int[n2][m2];
            int newM[][] = new int[n1][m2];
       
         System.out.println(" Enter elements of 2nd matrix: ");
        for(int i=0;i<n1;i++)
        {
          for(int j=0;j<m1;j++)
          {
            B[j][j] = ob.nextInt();
          }
        }
        int prod =0;
       
        for(int i=0;i<n1;i++)
        {
          for(int j=0;j<m2;j++)
          {
            for(int k=0;k<n2;k++)
            {
              prod += A[i][k]*B[k][j];
              newM[i][j] = prod ;
              prod =0;
            }
          }
        }
        System.out.println(" Matrix Multiplication: \n");
 
      for (int i = 0; i < n1; i++) {
        for (int j = 0; j < m2; j++)
          System.out.print(newM[i][j]+"\t");
 
        System.out.print("\n");
        }
       
        
 
       
      }}}