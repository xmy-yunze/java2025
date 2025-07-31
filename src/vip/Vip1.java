package vip;
//String 

public class Vip1 implements VideoVIP {

    @Override
    public int lookVideo() {
        return 5;
    }

    @Override
    public String getName() {
        return "Vip1";
    }
}
