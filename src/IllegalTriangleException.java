public class IllegalTriangleException extends Exception {
    private String errMess;
    public IllegalTriangleException(){}
    public  IllegalTriangleException(String errMess){
        this.errMess= errMess;
    }
    public  void getMess(){
        System.out.println(errMess);
    }

}
