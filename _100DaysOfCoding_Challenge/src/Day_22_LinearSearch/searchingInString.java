package Day_22_LinearSearch;

public class searchingInString {
    public static void main(String[] args) {
        String name = "Shaikh Anis";
        char target = 'k';
        System.out.println(search(name,target));
        System.out.println(search1(name,'u'));
    }
    static boolean search(String name, char target){
        for (int i=0; i<name.length(); i++){
            if(target== name.charAt(i))
                return true;
        }
        return false;
    }
    static boolean search1(String name, char target){
        for (char ch : name.toCharArray()){
            if(ch == target)
                return true;
        }
        return false;
    }
}
