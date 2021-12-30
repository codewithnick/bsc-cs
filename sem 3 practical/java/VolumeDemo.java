//method overloading
class Volume{
    double myv(double x){
        return x*x*x;
    }
    int myv(int x,int y,int z){
        return x*y*z;
    }
    double myv(int r){
        return (4/3)*3.14*r*r*r;
    }
}
class VolumeDemo{
    public static void main(String[] args) {
        Volume v1=new Volume();
        System.out.println("volume of cube of length 5.1 is " +v1.myv(5.1));
        System.out.println("volume of cuboid of dimensions 5*5*5 is "+v1.myv(5,5,5));
        System.out.println("volume of sphere of radius 5 is "+v1.myv(5));
    }
}