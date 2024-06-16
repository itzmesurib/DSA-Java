import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int element;

        System.out.print("Enter the length of the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter the elements one by one : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            element = sc.nextInt();
            arr[i] = element;
        }

        System.out.print("Enter the element you want to search : ");
        int searchElement = sc.nextInt();

        if(isFound(arr, searchElement)) {
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not Found");
        }

        sc.close();
    }

    static boolean isFound(int[] arr, int ele) {
        for(int i=0; i<arr.length; i++) {                   //Funtion to search the element in array
            if(arr[i] == ele) {
                return true;
            }
        }
        return false;
    }
}