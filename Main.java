import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] results = new int[100];
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the nth term: ");
    int n = sc.nextInt();
    sc.close();
    System.out.println(trib(n, results));

  }
  public static int trib(int n, int [] results){
    if (n == 0) return 0;
    if (n == 1) return 0;
    if (n == 2) return 1;
    if (results[n] != 0){
      return results[n];
    }
    else{
      results[n] = trib(n-1, results) + trib(n-2, results)+trib(n-3, results);
      return results[n];
    }
  }

}