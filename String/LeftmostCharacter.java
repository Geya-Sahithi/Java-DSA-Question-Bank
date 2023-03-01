public class LeftmostCharacter {
    static final int CHAR = 256;
    public static int leftMostn(String s) {
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<s.length();j++) {
                if(s.charAt(i) == s.charAt(j))
                return i;
            }
        }
        return -1;
    }
    
    public static int leftMostBetter(String s) {
        int[] count = new int[CHAR];
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++) {
            if(count[s.charAt(i)]>1)
            return i;
        }
        return -1;
    }

    public static int leftMostE(String s) {
        boolean visited[] = new boolean[CHAR];
        int res = -1;
        for(int i=s.length()-1;i>=0;i--) {
            if(visited[s.charAt(i)])
            res = i;
            else
            visited[s.charAt(i)] = true;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "wewehsgdj";

        System.out.println(leftMostn(s));
        System.out.println(leftMostBetter(s));
        System.out.println(leftMostE(s));
    }
}
