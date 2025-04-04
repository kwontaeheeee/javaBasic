import kr.hossam.helpers.FileHelper;

public class Ex02_Helper테스트2 {

    public static void main(String[] args) {
        String filePath = "./helper테스트2.txt";
        String content = "이것은 테스트입니다.";

        try{
            FileHelper.getInstance(). writeString(filePath, content);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            String read = FileHelper.getInstance().readString(filePath);
            System.out.println(read);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            String read = FileHelper.getInstance().readString(filePath);
            System.out.println(read);
        } catch(Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
