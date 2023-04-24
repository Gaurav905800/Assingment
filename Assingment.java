package WorkingDSA;

class Assingment1{
    void question1(){
        int arr[] = {4,3,6,7,1};
        int n = arr.length;
        int sum = 0;
    
        for(int i=0;i<n;i=i+2){
            sum += arr[i];
            
        }
        System.out.println(sum);
    }
    void question2(){
        int arr[] = {34,21,54,65,43};
        int n = arr.length;

        for(int a :arr){
          if(a%2 == 0){
            System.out.println(a);
          }
            }
            
        }
        void question3(){
            int arr[] = {34,21,54,65,43};
            int n = arr.length;
            int max = arr[0];
            for(int i = 0;i<n;i++){
                if(arr[i] > max){
                    max = arr[i];
                    System.out.println(max);
                }
            }
        }
        void question4(){
   int arr[] = {10, 20, 25, 63, 96, 57};
      int n = arr.length;

      for(int i = 0;i<n;i++){
        for(int j = i+1;j<n;j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
      }
      System.out.println("the second greatest element is :"+arr[n-2]);
        }
        void question5(){
            int arr[] = {1,3,2,6,5};
                int n = arr.length;
                int max = arr[0];
                for(int i = 0;i<n;i++){
                    if(arr[i] > max){
                        max = arr[i];
                    }
                }
                System.out.println(max);
        }
}
public class Assingment {
   public static void main(String[] args){
   
    Assingment1 as = new Assingment1();
    as.question1();
    as.question2();
    as.question3();
    as.question4();
    as.question5();
       
   }
}
