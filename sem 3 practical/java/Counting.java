class Counting{
    public static void main(String[] args) {
        int i,count=0,count1=0,count2=0;
        double[]
        wieght={45.2,  42  ,51.2 ,30.3 ,21   ,67 ,70.2 ,20.1 ,86.6 ,70.10},
        height={123.1,176.2,160.1,170.5,176.4,150,128.6,182.1,193.2,180};  
        for(i=0;i<=9;i++){
            if(wieght[i]<50 && height[i]>170){
                count1++;
            }
            count++;
        }
        count2=count-count1;
        System.out.println("num of people with");
        System.out.println("hieght>170 and wieght <50 is "+count1 );
        System.out.println("others is "+count2);

    }
}