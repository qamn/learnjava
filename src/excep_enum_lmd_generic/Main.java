package excep_enum_lmd_generic;

public class Main {

    static class MyException extends Exception{
        public MyException(String message) {
            super(message);
        }
    }

    public static int testExcep(int x){
        int i=0;
        try {
            if(x>2) {
                i++;
                throw new MyException("shit exception");
            }
            return i;
        }catch (MyException e){
            System.out.println("process: "+i);
            return i;
        }finally {
            return 3;
        }
    }


    public static void main(String[] args) {
        System.out.println("result: "+testExcep(3));
    }
}
