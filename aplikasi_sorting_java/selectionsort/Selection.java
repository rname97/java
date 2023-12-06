import java.util.Scanner;

public class Selection {
    
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                } 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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