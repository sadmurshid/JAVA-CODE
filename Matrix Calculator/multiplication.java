public class multiplication{
 
 
//This is the part.
  public static int[][] multiplication(int [][] m1, int [][] m2){
    int [][] m3 = new int[m2.length][m1[0].length];
    for (int c3=0; c3<m1[0].length; ++c3){
      for (int c2=0; c2<m2.length; ++c2){
        for (int c=0; c<m1.length; ++c){
          m3[c3][c2] = m3[c3][c2] + m1[c3][c]*m2[c][c3];
        }
      }
    }
    return m3;
  }
//Until here.
 
 
  public static void main(String [] args){
    int [][] m1 = { {2,2}, {5,5} };
    int [][] m2 = { {3,3}, {4,4} };
    int [] [] a=multiplication(m1, m2);
    for(int i=0; i<a.length; i++)
    {
      for(int j=0; j<a[0].length; j++)
      {
        System.out.println(a[i][j]);
      }
    }
  }
}