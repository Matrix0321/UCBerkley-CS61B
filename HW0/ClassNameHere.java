package yousaywhy;

public class ClassNameHere {
    public static int max(int[] m) {
        int max = m[0];
        int i;
        for (i = 0;i < m.length;i++){
            if (m[i] > max){
                max = m[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
