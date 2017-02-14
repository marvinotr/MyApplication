package com.example.user.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Add(3,'f');
        setContentView(R.layout.activity_main);
    }

    private int Add(int a,int b){
        return a+b;
    }


    public class TestSingleInstance{


        public  TestSingleInstance testInstance;

        public TestSingleInstance(){}
    }


    private void setData(){
        peekWallpaper();
        
    }




}
