package ru.synergyitacademy.les8.another;

import ru.synergyitacademy.les8.A;

public class B extends A {


   public void anotherM(){
        String str = "test";
        System.out.println(str);
        m(str);
        System.out.println(str);
    }

    @Override
    protected void m(String str) {
   str = "Hello";
    }

    public void modify(D d){
       d.index++;

    }

    public void print(){
        System.out.println("Это я - класс В");
    }
}
