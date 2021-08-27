import java.util.Scanner;

public class BinarySearch {

    boolean bsearch(int A[], int num) {
        int start = 0;
        int end = A.length - 1;
        int mid;
        while(start<=end) {
            mid = (start+end)/2;
            if(A[mid] == num) //element found 
                return true;
            else if (A[mid] > num)
               end = mid-1;
            else
               start = mid + 1;
        }
        return false;
    }

    int bsearchIndex(int A[], int num) {
        int start = 0;
        int end = A.length;
        int mid;
        while(start<=end) {
            mid = (start+end)/2;
            if(A[mid] == num) //element found 
                return 1;
            else if (A[mid] > num)
               end = mid-1;
            else
               start = mid + 1;
        }
        return 0;
    }

    public static void main(String args[]) {
        int a[] = {8,9,10, 17, 25, 30}; //array has to be sorted
        BinarySearch obj = new BinarySearch();
        int num, t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0) {
            num = sc.nextInt();
            boolean result = obj.bsearch(a, num);
            System.out.println(result);
            t--;
        }
        sc.close();
    }
}
