public class challenge {
    public static void main (String[] args){
        int n = 5678;
      int result=0;
      while (n!=0){
          result = n%7;
          n = n/7;
      }
        System.out.println(result);
    }
}
