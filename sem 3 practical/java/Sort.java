class Sort{
    int number[]={55,65,23,45,66};
    int n=number.length;
    void display(){
        for(int i=0;i<n;i++){
            System.out.println(" "+number[i]);
        }
    }
    //sorting
    void sort(){
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(number[j]<number[i]){
                    int temp= number[i];
                    number[i]=number[j];
                    number[j]=number[i];
                }
            }
        }
    }
    public static void main(String[] args) {
        Sort s1=new Sort();
        System.out.println("given list");
        s1.display();
        s1.sort();
        System.out.println("sorted list");
        s1.display();
    }
}