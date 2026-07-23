package practise;

public class scalar_diagonal_simplesecond {
public static void main(String args[]) {

    int[][] arr=new int[2][2];
    
    arr[0][0]=2;
    arr[0][1]=0;
    
    arr[1][0]=0;
    arr[1][1]=3;
    
    // 1 0
    // 0 1
    boolean nonzerocheck=true;
    boolean zerocheck=true;
    
    
    
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
        
            if(i==j)
            {
                if(arr[i][j] ==0 )
                {
                    nonzerocheck=false;
                    break;
                }
            }
            else
            {
                if(arr[i][j] !=0)
                {
                    zerocheck=false;
                }
            }
        }
    }
    
    
    if(nonzerocheck && zerocheck)
    {
        System.out.println("Scalar or diagonal");
    }
    else
    {
        System.out.println("simple matrix");
    }

}
}
