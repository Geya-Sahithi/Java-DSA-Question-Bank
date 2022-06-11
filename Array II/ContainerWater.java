//Container with the most water problem
public class ContainerWater {
    static int containerWithMostWater(int a[]) {
        int maxArea = 0;
        int l = 0;
        int r = a.length-1;

        while(l < r) {
            int height = Math.min(a[l], a[r]);
            int dist = r-l;

            int area = height*dist;
            maxArea = Math.max(maxArea, area);

            if (a[l] < a[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        
        int a[] = {1,8,3,6,8,6,7,3,1};
        System.out.println(containerWithMostWater(a));
    }
}
