class StringDemo{
    
    public static void main(String[] args) {
        String s1="nikhil singh",s2="SYCS 45";
        System.out.println("strings s1 = "+s1+" s2 = "+s2);
        System.out.println("conversion to uppercase: "+s1.toUpperCase());
        System.out.println("conversion to lowercase: "+s2.toLowerCase());
        System.out.println("s1==s2 ? "+s1.equals(s2));
        System.out.println("s1==s2 ignore casing ? "+s1.equalsIgnoreCase(s2));
        System.out.println("s1+s2 ="+s1.concat(s2));
        System.out.println("s1 compare s2 ?"+s1.compareTo(s2));
        System.out.println("s1 charat index 5 :"+s1.charAt(5));
        System.out.println("s1 substring from 3 to 5 :"+s1.substring(3,5));
        System.out.println("s1 valueof 12 :"+s1.valueOf(12));
        System.out.println("s2 index of C :"+s2.indexOf("C"));
        System.out.println("s1 trim :"+s1.trim());
        System.out.println("s1 replace i with z :"+s1.replace('i','z'));
        System.out.println("s1 length:"+s1.length());
        System.out.println("s2 length:"+s2.length());
        //string buffer
        StringBuffer sb=new StringBuffer(s1);
        int pos =sb.indexOf("s");
        System.out.println("string buffer: "+sb);
        sb.insert(pos,s2);
        System.out.println("insert s2 at s "+sb);
        sb.setCharAt(5,'-');
        System.out.println("stcharat 5 as - :"+sb);
        sb.append("hii");
        System.out.println("append hii :"+sb);
        sb.setLength(30);
        System.out.println("updated length:"+sb.length());
    }
}