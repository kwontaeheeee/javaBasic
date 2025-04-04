 package kr.hossam.helper;

public class UtilHelper {
    public static UtilHelper current;
    public static UtilHelper getInstance(){
        if(current ==null) {
            current = new UtilHelper();
        }
        return current;
    }
    private UtilHelper(){
        super();
    }
    public int random(int min, int max){
        int num = (int)((Math.random() * (max - min +1)) + min);
        return num;
    }
    
}