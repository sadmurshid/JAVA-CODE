import java.util.Scanner;
class self
{
  public static void main(String args[])
  {
    Scanner er=new Scanner(System.in);
    
    System.out.println("Please enter how many quiz marks you will give.");      //Take quiz array
    int qc=er.nextInt();
    double []qn=new double[qc];
    
    System.out.println("Please enter how many assignment marks will you give.");  //Take assignment array
    int ac=er.nextInt();
    double []an=new double[ac];
    
    int ate;
    double qa,aa,ata;
    double qt,at,mid,fin,tom;
    /*qa=quiz average   aa=assignment average   ate=attendence  ata=attendence average
      qt=quiz total     at=assignment total     mid=Midtarm     fin=Final  tom=total marks
    */
    for (int i=0; i<qc; i++)
    {
      System.out.println("Enter Quiz"+(i+1)+" marks.");
      qn[i]=er.nextDouble();
    }
    double temp;                                     //Sorting quiz marks
    for(int a=0; a<qc; a++)
    {
      for(int b=a+1; b<qc; b++)
      {
        if(qn[a]<qn[b])
        {
          temp=qn[a];
          qn[a]=qn[b];
          qn[b]=temp;
        }
      }
    }
    
    for(int i=0; i<ac; i++)                    //Taking assignment marks
    {
      System.out.println("Enter assignment"+(i+1)+" marks");
      an[i]= er.nextDouble();
    }
    
    //Sorting assignment marks
    for(int a=0; a<ac; a++)
    {
      for(int b=a+1; b<ac; b++)
      {
        if(an[a]<an[b])
        {
          temp=an[a];
          an[a]=an[b];
          an[b]=temp;
        }
      }
    }
    
    //Quiz total and Assignment total
    qt=qn[0]+qn[1]+qn[2];
    if (qc>10)
    {
      qt=qt+qn[3]+qn[4];
    }
    at=an[0]+an[1]+an[2];
    if(ac>10)
    {
      at=at+an[3]+an[4];
    }
    //Quiz and Assignment average
    qa=qt/3;
    if(qc>10)
    {
      qa=qt/5;
    }
    aa=at/3;
    if(ac>10)
    {
      aa=at/5;
    }
    
    System.out.println("Give the attendence of the Student in 25 classes.");
    ate=er.nextInt();
    ata=ate/5;
    System.out.println("Give the midtarm examination marks");
    mid=er.nextDouble();
    System.out.println("Give the Final Examination marks");
    fin=er.nextDouble();
    
    tom=qa+aa+ata+mid+fin;
    System.out.println("Total marks : "+tom);
  }
}
