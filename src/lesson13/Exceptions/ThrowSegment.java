package lesson13.Exceptions;

class ThrowSegment {
    void show1() throws Exception {
        throw new Exception("my.own.Exception");
    }

    void show2() throws Exception {
        show1();
    }

    void show3() {
        try {
            show2();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
    public static void main(String s[])    {
        ThrowSegment ts1 = new ThrowSegment();
        ts1.show3();
        System.out.println("Still here!");
    }
}

