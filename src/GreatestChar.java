public class GreatestChar {
    public static void main(String[] args) {
        //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        char[] letters = {'c','f','j'};
        char target='d';
        System.out.println(nextGreatestLetter(letters, target));
        System.out.println(nGrTargt(letters,target));
    }
    static char nextGreatestLetter(char[] letters,char target){
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>mid){
                start=mid+1;
            } else if (target < mid) {
                end=mid-1;
            }
        }
        return letters[start%letters.length];
    }

    static char nGrTargt(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            } else if (target > letters[mid]) {
                start =mid+1;
            }
        }
        return letters[start%letters.length];
    }
}


