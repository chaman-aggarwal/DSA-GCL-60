import java.util.*;
class FirstAndLastOcc{  

    private static int first = -1;
    private static int last = -1;

    private static void findOcc(String str, int idx, char target) {
        // base case
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == target) {
            if(first == -1) {
                first = idx;
                last = idx;
            } else {
                last = idx;
            }
        }
        findOcc(str, idx+1, target);
    }

    public static void main(String args[]){  
        String str = "geeks";
        findOcc(str, 0, 'e');
    }  
}  