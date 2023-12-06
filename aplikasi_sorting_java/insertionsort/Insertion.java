import java.util.Scanner;

public class Insertion {
    
    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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

        insertionSort(arr);
        System.out.println("Data Setelah Diurutkan");
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}