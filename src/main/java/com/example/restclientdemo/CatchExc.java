package com.example.restclientdemo;

public class CatchExc {
    private Notify notify;
    private RestTemplateDemo demo;

    public void count(){
        try{
            int a = 5/0;
        }catch (ArithmeticException e){
            notify = new Notify(e.getMessage());
            demo = new RestTemplateDemo();
            demo.getTemplate(notify);
        }
    }

    public void countTwo(){
        try{
            int b = 6/0;
        }catch (ArithmeticException e){
            notify = new Notify(e.getMessage());
            demo = new RestTemplateDemo();
            demo.getTemplate(notify);
        }
    }
}
