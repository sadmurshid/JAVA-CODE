/********************************************************************************************************************
  *    Programmer        : Sa'dmurshid Khan Adon
  *             BRAC University
  *    ID                : 14301101
  *    Problem           : Process Scheduling
  *    Input Style       :      
  ******************************************************************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class jobScheduling
{
  static BufferedReader br;
  public static void main(String[]args) throws IOException
  {
    Scanner er=new Scanner(System.in);
    boolean boo=true;
    try
    {
      System.out.println("Please enter the path of txt file");
      FileReader fr=new FileReader(er.next());
      br=new BufferedReader(fr);
    }
    catch(Exception e)
    {
      System.out.println("File not found");
      boo=false;
    }
    if(boo)
    {
      int noOfJob=Integer.parseInt(br.readLine());
      int [] [] job=new int [noOfJob][4];                        //0=Process No, 1=burst Time, 2=arrival time; 3=priority
      for(int i=0; i<noOfJob; i++)
      {
        String string=br.readLine();
        String[] parts = string.split(" ");
        job[i][0]=Integer.parseInt(parts[0]);
        job[i][1]=Integer.parseInt(parts[1]);
        job[i][2]=Integer.parseInt(parts[2]);
        job[i][3]=Integer.parseInt(parts[3]);
      }
      
      System.out.println("Please enter the following");
      System.out.println("1. Round Robin                 2.Priority");
      System.out.println("3. First Come First Serve      4.Short Job First");
      System.out.println("5. SJF(Preemptive)");
      
      int algo=er.nextInt();
      if(algo==1)                                                                  //Round Robin***
      {
        System.out.println("Please enter the time quantum.");                      //Taking time quantum
        int quantum=er.nextInt();
        
        int [] queue=new int [job.length];                                         //making a matrix queue
        int inQueue=0;                                                             //Total # of job in queue
        
        job=sortArrival(job);                                                      //sort by Arrival time
        int remainingJob = job.length;
        int remainingTime = quantum;                                               //remaining time for quantum
        int count=0;                                                               //counting seconds
        int jobCount=0;
        if(job[0][2]==0)
        {
          queue[0]=0;
          inQueue=1;
          jobCount++;
        }
        
        while(remainingJob!=0)                                                     //Do till a job left
        {
          if((job[queue[0]][1]!=0) && (remainingTime!=0))
          {
//          System.out.println("job no "+job[queue[0]][0]+" time "+count);
            job[queue[0]][1]--;
            remainingTime--;
            count++;
            if((jobCount<job.length))
            {
              if(job[jobCount][2]==count)
              {
                queue[inQueue]=jobCount;                                             //Add the Job in queue
                inQueue++;                                                           //Increse #of job in queue
                jobCount++;
                for(int k=0; k<queue.length; k++)
                {
                  System.out.print("["+queue[k]+"]");
                }
                System.out.println("time "+count);
              }
            }
          }
          else if((job[queue[0]][1]==0))                                           //end of a job
          {
            System.out.println("job no "+job[queue[0]][0]+" ending time "+count);
            for(int i=0; i<queue.length-1; i++)                                    
            {
              queue[i]=queue[i+1];
            }
            queue[inQueue-1]=0;
            remainingJob--;
            remainingTime=quantum;
            inQueue--;
            for(int k=0; k<queue.length; k++)
            {
              System.out.print("["+queue[k]+"]");
            }
            System.out.println();
          }
          else if(remainingTime==0)                                                //end of time quantum rearrange queue
          {
            int temp=queue[0];
            for(int i=0; i<queue.length-1; i++)                                    
            {
              queue[i]=queue[i+1];
            }
            queue[inQueue-1]=temp;
            remainingTime=quantum;                                                 //reset the remaining time
            
            for(int k=0; k<queue.length; k++)
            {
              System.out.print("["+queue[k]+"]");
            }
            System.out.println("time "+count);
          }
          
        }
        
        
        
      }
      else if(algo==2)                                                             //Priority  
      {
        int sum=0;
        job=sortArrival(job);
        job=sortPriority(job);
        for(int i=0; i<job.length; i++)
        {
          sum+=job[i][1];
          System.out.println("job no "+job[i][0]+" ending time "+sum+" Priority "+job[i][3]);
        }
      }
      else if(algo==3)                                                             //FCFS
      {
        int sum=0;
        job=sortArrival(job);
        for(int i=0; i<job.length; i++)
        {
          sum+=job[i][1];
          System.out.println("job no "+job[i][0]+" ending time "+sum);
        }
      }
      else if(algo==4)                                                             //SJF
      {
        int sum=0;
        job=sortArrival(job);
        job=sortBurstTime(job);
        for(int i=0; i<job.length; i++)
        {
          sum+=job[i][1];
          System.out.println("job no "+job[i][0]+" ending time "+sum);
        }
      }
      else if(algo==5)                                                             //SJF(Preemtive)
      {
        job=sortArrival(job);
        int remainingJob = job.length;
        int count=0;                                                               //counting seconds
        int jobCount=0;
        int [] queue=new int [job.length];                                         //making a matrix queue
        int inQueue=0;                                                             //Total # of job in queue
        int [][] jobInQueue=new int [job.length][4];
        for(int i=0; i<job.length; i++)
        {
          jobInQueue[i][0]=999;
          jobInQueue[i][1]=999;
          jobInQueue[i][2]=999;
          jobInQueue[i][3]=999;
        }
        
        if(job[0][2]==0)
        {
          queue[0]=job[0][0];
          inQueue=1;
          jobInQueue[0]=job[0];
          jobCount++;
//          for(int k=0; k<queue.length; k++)
//          {
//            System.out.print("["+queue[k]+"]");
//          }
//          System.out.println("jC"+jobCount+"jIQ"+jobInQueue[0][0]+jobInQueue[0][1]+jobInQueue[0][2]);
        }
        
        while(remainingJob!=0)
        {
          jobInQueue=sortBurstTime(jobInQueue);
          for(int i=0; i<job.length; i++)
          {
            queue[i]=jobInQueue[i][0];
//            System.out.print(queue[i]);
          }
          jobInQueue[0][1]--;
          count++;
          System.out.println("Time: "+count+" Process No: "+jobInQueue[0][0]+" Remaining Time: "+jobInQueue[0][1]);
          
          if(jobCount<job.length)
          {
            if(job[jobCount][2]==count)
            {
              jobInQueue[inQueue]=job[jobCount];
              queue[inQueue]=job[jobCount][0];                                     //Add the Job in queue
              inQueue++;                                                           //Increse #of job in queue
              jobCount++;
              for(int k=0; k<queue.length; k++)
              {
                System.out.print("["+queue[k]+"]");
              }
              System.out.println("time "+count);
              
              
            }
          }
          if(jobInQueue[0][1]==0)
          {
            System.out.println("job no "+jobInQueue[0][0]+" ending time "+count);
            for(int i=0; i<queue.length-1; i++)                                    
            {
              queue[i]=queue[i+1];
              jobInQueue[i]=jobInQueue[i+1];
            }
            queue[inQueue-1]=999;
            jobInQueue[inQueue][0]=999;
            jobInQueue[inQueue][1]=999;
            jobInQueue[inQueue][2]=999;
            jobInQueue[inQueue][3]=999;
            remainingJob--;
            inQueue--;
            for(int k=0; k<queue.length; k++)
            {
              System.out.print("["+queue[k]+"]");
            }
            System.out.println();
          }
          
          
        }
        
      }
    }
    else
    {
      String [] a=new String[3];
      main(a);
    }
  }
  
  static int[][] sortArrival( int [] [] job)
  {
    int temp;
    int temp1;
    int temp2;
    int temp3;
    for(int i=0; i<job.length; i++)                                    //Sorting by bubble sorting
    {
      for(int j=0; j<job.length; j++)
      {
        if(job[i][2]<job[j][2])
        {
          temp=job[i][0];
          temp1=job[i][1];
          temp2=job[i][2];
          temp3=job[i][3];
          job[i][0]=job[j][0];
          job[i][1]=job[j][1];
          job[i][2]=job[j][2];
          job[i][3]=job[j][3];
          job[j][0]=temp;
          job[j][1]=temp1;
          job[j][2]=temp2;
          job[j][3]=temp3;
        }
      }
    }
    return job;
  }
  
  static int[][] sortBurstTime( int [] [] job)
  {
    int temp;
    int temp1;
    int temp2;
    int temp3;
    for(int i=0; i<job.length; i++)                                    //Sorting by bubble sorting
    {
      for(int j=0; j<job.length; j++)
      {
        if((job[i][1]<job[j][1]))
        {
          temp=job[i][0];
          temp1=job[i][1];
          temp2=job[i][2];
          temp3=job[i][3];
          job[i][0]=job[j][0];
          job[i][1]=job[j][1];
          job[i][2]=job[j][2];
          job[i][3]=job[j][3];
          job[j][0]=temp;
          job[j][1]=temp1;
          job[j][2]=temp2;
          job[j][3]=temp3;
        }
      }
    }
    return job;
  }
  static int[][] sortPriority( int [] [] job)
  {
    int temp;
    int temp1;
    int temp2;
    int temp3;
    for(int i=0; i<job.length; i++)                                    //Sorting by bubble sorting
    {
      for(int j=0; j<job.length; j++)
      {
        if((job[i][3]<job[j][3])&&(job[i][2]==job[j][2]))
        {
          temp=job[i][0];
          temp1=job[i][1];
          temp2=job[i][2];
          temp3=job[i][3];
          job[i][0]=job[j][0];
          job[i][1]=job[j][1];
          job[i][2]=job[j][2];
          job[i][3]=job[j][3];
          job[j][0]=temp;
          job[j][1]=temp1;
          job[j][2]=temp2;
          job[j][3]=temp3;
        }
      }
    }
    return job;
  }
  
  
  static void sleep()
  {
    try 
    {
      Thread.sleep(1000, 1000);
    }
    catch (InterruptedException e){
      e.printStackTrace();
    }
  }
}