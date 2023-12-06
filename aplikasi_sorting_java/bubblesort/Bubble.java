import java.util.Scanner;

public class Bubble {
    
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i<n;i++){
            for(int j=1; j< (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[];
        System.out.println("Masukan Banyak Nilai Array: ");
        Scanner myObj = new Scanner(System.in);  
        String bNilai = myObj.nextLine();  
        int bNilaix = Integer.parseInt(bNilai);
        arr= new int[bNilaix];

        for(int x=0; x < bNilaix; x++){
            System.out.println("Masukan Nilai Aray ke-[" +x+ "] ");
            String nilaiString = myObj.nextLine(); 
            arr[x] = Integer.parseInt(nilaiString);
        }
        
        System.out.println("Data Sebelum Diurutkan");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        bubbleSort(arr);
        System.out.println("Data Setelah Diurutkan");
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}