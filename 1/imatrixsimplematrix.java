package practise;

public class imatrixsimplematrix {

	public static void main(String[] args) {
	       /*
        *
        * boolean flag=true;
        *
        * if(i==j){
        * if(arr[i][j] !=1)
        * flag=false;
        * }
        * else
        * {
        * if(arr[i][j] !=0)
        * {
        * flag2=false;
        * }
        *
        * }
        * 1 0 -1
        * 0 1 0
        * 0 0 1
        *
        */
       
       
       
       
       int [][] arr=new int[2][2];
       
       arr[0][0]=1;
       arr[0][1]=1;
       // 1 1
       arr[1][0]=0;
       arr[1][1]=1;
       // 0 1
       
       boolean zeroCheck=true;
       
       boolean oneCheck=true;
       
       
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
           {
               
               if(i==j)
               {
                   if(arr[i][j] !=1)
                   {
                       oneCheck=false;
                   }
               }
               else    
               {
                   if(arr[i][j] !=0)
                   {
                       zeroCheck=false;
                   }
               }
           }
       }
       
       
       if(oneCheck && zeroCheck)
       {
           System.out.println("I Matrix");
       }
       else
       {
           System.out.println("simple matrix");
       }
       
       

   }



	}


