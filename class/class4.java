public class class4 {
    public static void main(String[] args) {
        System.out.println("a"+"\t"+"a^2"+"\t"+"a^3");
        int[] arr={1,2,3,4};
        for (int i = 0; i <4; i++) {
            System.out.println(arr[i]+"\t"+(int)Math.pow(arr[i],2)+"\t"
                    +(int)Math.pow(arr[i],3));
        }
    }
}
