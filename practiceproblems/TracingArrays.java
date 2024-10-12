package practiceproblems;

public class TracingArrays {
    public static void main(String[] args) {
    traceArray();
    }
    public static void traceArray(){
        int a[] ={1,2,3,4,5,6,7};
        System.out.println(a.length-1);

        for (int i = 0; i<=a.length-1; i++){
            System.out.println(a[i]);
        }
    }
}
