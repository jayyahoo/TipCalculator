
/* Author: Jay Jayakumaran
 * Introduction to Android Class 
 * Assignment 1- Tip Calculator
 */


package com.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculator extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
       //Getting the Button Ids and EditText Ids
        
        Button tenbtn = (Button)findViewById(R.id.ten);
        Button fifteenbtn = (Button)findViewById(R.id.fifteen);
        Button twentybtn = (Button)findViewById(R.id.twenty);
        final EditText totalAmount = (EditText)findViewById(R.id.totalAmount);
        
       final TextView result = (TextView)findViewById(R.id.result);
    
       
    
       // implementing the onclick event listeners for 10, 15, and 20% buttons to calculate the correct tip
       
       tenbtn.setOnClickListener(new OnClickListener()
        {
                 
                  

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
				double d=Double.parseDouble(totalAmount.getText().toString());
				double tipValue=d*.10;
				
				result.setText(getResult(tipValue));
				}
            });
       
       
       fifteenbtn.setOnClickListener(new OnClickListener()
       {
                
                 

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
			
					double d=Double.parseDouble(totalAmount.getText().toString());
				double tipValue=d*.15;
				
				result.setText(getResult(tipValue));
					
				}
           });
       
       twentybtn.setOnClickListener(new OnClickListener()
       {
                
                 

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					double d=Double.parseDouble(totalAmount.getText().toString());
				double tipValue=d*.20;
				
				result.setText(getResult(tipValue));
				}
           });
    }
    

     public String getResult(Double d){
    	 
    return 	 String.valueOf(d+ " $");
    	 
     }
     
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculator, menu);
        return true;
    }
    
}
