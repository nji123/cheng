package Big;

public class MSA {
    public static void Calc(int[]a,int length){
        int max=-100;
        int start=0;
        int end=7;
        for (int i = 0; i < length; i++) {
            int sum=0;
            for (int j = i; j <length ; j++) {
                sum=sum+a[j];
                if(max<sum){
                    max=sum;
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println("最大子数组和为："+max);
        System.out.println("起点位置："+start);
        System.out.println("结束位置："+end);
    }

}
