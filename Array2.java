package WorkingDSA;
import java.util.Scanner;
class Diagonal{
    void digonal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the maxtrix");
        int n = sc.nextInt();
        System.out.println("Enter the coloums of the matrix");
        int m = sc.nextInt();
    
        int arr[][] = new int[m][n];
        System.out.println("Enter the element of the Matrix");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("------------------------ DIAGONALS OF THE ARRAY -----------------------------");
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==j ){
                    System.out.println(arr[i][j]);
                }
                if((i+j)==n-1){
                    System.out.println(arr[i][j]);
                }
            }
         }
    }
    void MaximumNumber(){
        int arr[][] = {{1,2,4,0},{2,5,7,-1},{4,2,6,9}};
        int m = arr.length;
        int n = arr[0].length;

        int max = 0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    
    }
}
public class Array2{
    public static void Question(int arr[][],int m,int n ){
       //              positive numbers
        int no= 0;
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j]>=1){
                 no++;
                }
            }
        }
        System.out.println("the positive no. in the array : "+no);
        System.out.println("-----------------------------------------------------");
        //             negative numbers
        int y = 0;
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j]<=0){
                    y++;
                }
            }
        }
        System.out.println("the negative no. in the array : "+y);
        System.out.println("----------------------------------------");
        //          odd numbers
        int x = 0;
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j]%2 < 0){
                   x++;
                }
            }
        }
        System.out.println("the odd no. in the array : "+x);
        System.out.println("----------------------------------------");
        //        even number 
        int z = 0;
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j]%2 == 0){
                   z++;
                }
            }
        }
        System.out.println("the even no. in the array : "+z);
        System.out.println("----------------------------------------");
        //        zeros in the array 
        int a = 0;
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j] == 0){
                   a++;
                }
            }
        }
        System.out.println("the zeros no. in the array : "+a);
        System.out.println("----------------------------------------");
    }
    public static void main(String[] args) {

        int arr[][] = {{1,2,-3,4},{0,0,-4,2},{1,-1,2,3},{-4,-5,-7,0}};
        int m = arr.length;
        int n = arr[0].length;
        int no = 0 ;

        Question(arr,m,n);

        Diagonal ma = new Diagonal();
        ma.digonal();
        ma.MaximumNumber();
        
    }
}
