import java.util.*;
public class large3inarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int n=in.nextInt();
           int a[]= new int[n];
           for( int i=0; i<n;i++)
                                  {
                        a[i]=in.nextInt();
}
int large= a[0];
int z=0;
 for( int i=0; i<n;i++)
                                  {
for(int j=0;j<n;j++)
{
    if(a[i]>=a[j])
    {
     z=a[i];
     a[i]=a[j];
     a[j]=z;
    }
}
                        }
                        for( int i=0; i<3;i++)
                                  {
                        System.out.println(a[i]);
}
}
}
