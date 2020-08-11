package alo;

public class Test {

    private Test(){}

    private volatile Test instance;

    public Test getInstance(){
        if (instance==null){
            synchronized (Test.class){
                if (instance==null){
                    instance = new Test();
                }
            }
        }
        return instance;
    }

}

