public class TamGiac {
    private int a;
    private int b;
    private int c;



    public TamGiac(int a, int b, int c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        if(a<0 ||b<0||c<0){
            throw  new IllegalTriangleException("day  khong phai tam giac");
        }
        else if(a+b<c ||  a+c<b || c+b<a){
          throw  new  IllegalTriangleException("day  khong phai  tam giac");
        }

    }



}
