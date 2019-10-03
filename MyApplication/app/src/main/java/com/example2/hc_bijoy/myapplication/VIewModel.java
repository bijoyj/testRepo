package com.example2.hc_bijoy.myapplication;

import java.util.ArrayList;

public class VIewModel {

    ArrayList<String> test;

    VIewModel(ArrayList a){
        test = a;
    }

    public int BusinessLogic1(){
        return test.size();
    }

    public String BusinessLogic2(int index){

      /*  try {
            String a = null;
            if (a.equalsIgnoreCase(test.get(index))){
                return a;
            }

        } catch (Exception e){
            return null;
        }*/

        return test.get(index);

    }

}
