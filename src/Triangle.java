public class Triangle {
    int a;
    int b;
    int c;
    public void area(){
        int s = a+b+c;
        int q = s/2;
        int d = q * (q - a) * (q - b) * (q - c);
        System.out.println(a+"+"+b+"+"+c+"="+s);
        System.out.println(s+"/2="+q);
        System.out.println(d);
        System.out.println(Math.sqrt(d));
    }

}
