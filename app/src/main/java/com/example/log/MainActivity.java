package com.example.log;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = "MeuApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Mensagem de INFO");
        Log.d(TAG, "mensagem de DEBUG");
        Log.w(TAG, "mensagem de WARN");
        Log.e(TAG, "mensagem de ERRO");
        Log.v(TAG, "mensagem de VERBOSE");

    }
}
