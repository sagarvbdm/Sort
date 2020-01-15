package com.example.sort;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int Num;
    static double totalTime;
    String[] names = {"Select Algorithm","Selection Sort","Bubble Sort","Insertion Sort"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ed = (EditText)findViewById(R.id.limit);

        Spinner sp = (Spinner)findViewById(R.id.sp1);
        adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,names);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int ii, long id) {

                switch(ii)
                {
                    case 0:
                        break;
                    case 1:
                        Random rd = new Random();
                        int[] arr = new int[Num];
                        for (int i = 0; i < arr.length; i++) {
                            arr[i] = rd.nextInt();
                        }

                        double startTime = System.nanoTime();
                        for (int i = 0; i < arr.length; i++)
                        {
                            int min_idx = i;
                            for (int j = i+1; j < arr.length; j++)
                                if (arr[j] < arr[min_idx]) {
                                    min_idx = j;
                                }
                            int temp = arr[min_idx];
                            arr[min_idx] = arr[i];
                            arr[i] = temp;
                        }
                        double endTime   = System.nanoTime();

                        double totalTime = endTime - startTime;
                        double milliseconds = totalTime / 1000000.0;
                        TextView tx = (TextView) findViewById(R.id.st);
                        tx.setText(""+(milliseconds));

                        double ssws= (double) Double.parseDouble(String.valueOf(ed.getText()));
                        double ans = ssws*ssws;
                        TextView txx = (TextView) findViewById(R.id.wc);
                        txx.setText(""+(ans)+"      O(n*n)");

                        double ssas= (double) Double.parseDouble(String.valueOf(ed.getText()));
                        double ans1 = ssas*ssas;
                        TextView txy = (TextView) findViewById(R.id.ac);
                        txy.setText(""+(ans1)+"      O(n*n)");

                        double ssbs= (double) Double.parseDouble(String.valueOf(ed.getText()));
                        double ans2 = ssbs*ssbs;
                        TextView txz = (TextView) findViewById(R.id.bc);
                        txz.setText(""+(ans2)+"      O(n*n)");

                        break;
                    case 2:
                        Random rd1 = new Random();
                        int[] arr1 = new int[Num];
                        for (int i = 0; i < arr1.length; i++) {
                            arr1[i] = rd1.nextInt();
                        }

                        double startTime1 = System.nanoTime();
                        for (int i = 0; i < arr1.length-1; i++)
                            for (int j = 0; j < arr1.length-i-1; j++)
                                if (arr1[j] > arr1[j+1])
                                {
                                    int temp = arr1[j];
                                    arr1[j] = arr1[j+1];
                                    arr1[j+1] = temp;
                                }
                        double endTime1   = System.nanoTime();

                        double totalTime1 = endTime1 - startTime1 ;
                        double milliseconds1 = totalTime1 / 1000000.0;
                        TextView tx1 = (TextView) findViewById(R.id.st);
                        tx1.setText(""+(milliseconds1));

                        double ssws1= (double) Double.parseDouble(String.valueOf(ed.getText()));
                        double ans01 = ssws1*ssws1;
                        TextView txx1 = (TextView) findViewById(R.id.wc);
                        txx1.setText(""+(ans01)+"      O(n*n)");

                        double ssas1= (double) Double.parseDouble(String.valueOf(ed.getText()));
                        double ans11 = ssas1*ssas1;
                        TextView txy1 = (TextView) findViewById(R.id.ac);
                        txy1.setText(""+(ans11)+"      O(n*n)");

                        double ssbs1= (double) Double.parseDouble(String.valueOf(ed.getText()));
                        double ans21 = ssbs1;
                        TextView txz1 = (TextView) findViewById(R.id.bc);
                        txz1.setText(""+(ans21)+"      O(n)");

                        break;
                    case 3:

                        Random rd11 = new Random();
                        int[] arr11 = new int[Num];
                        for (int i = 0; i < arr11.length; i++) {
                            arr11[i] = rd11.nextInt();
                        }

                        for (int i=1; i<arr11.length; ++i)
                        {
                            int key = arr11[i];
                            int j = i-1;

                            while (j>=0 && arr11[j] > key)
                            {
                                arr11[j+1] = arr11[j];
                                j = j-1;
                            }
                            arr11[j+1] = key;
                        }

                        double ssws11= (double) Double.parseDouble(String.valueOf(ed.getText()));
                        double ans011 = ssws11*ssws11;
                        TextView txx11 = (TextView) findViewById(R.id.wc);
                        txx11.setText(""+(ans011)+"      O(n*n)");

                        double ssas11= (double) Double.parseDouble(String.valueOf(ed.getText()));
                        double ans111 = ssas11*ssas11;
                        TextView txy11 = (TextView) findViewById(R.id.ac);
                        txy11.setText(""+(ans111)+"      O(n*n)");

                        double ssbs11= (double) Double.parseDouble(String.valueOf(ed.getText()));
                        double ans211 = ssbs11;
                        TextView txz11 = (TextView) findViewById(R.id.bc);
                        txz11.setText(""+(ans211)+"      O(n)");

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

}