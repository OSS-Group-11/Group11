package com.example.finalcal2;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
 
public class MainActivity extends Activity implements  OnClickListener
{
 Button zero,one,two,three,four,five,six,seven,eight,nine,add,sub,mul,div,clear,equal;	
 public String str ="";
 Character op = ' ';
 char i;
 int num,tempnum;
    EditText showResult;
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = (EditText)findViewById(R.id.editText1);
        
          seven = (Button) findViewById(R.id.button1);
          eight = (Button) findViewById(R.id.button2);
          nine = (Button) findViewById(R.id.button3);
          div = (Button) findViewById(R.id.button4);
          four = (Button) findViewById(R.id.button5);
          five = (Button) findViewById(R.id.button6);
    	  six = (Button) findViewById(R.id.button7);
    	  mul = (Button) findViewById(R.id.button8);
    	  one = (Button) findViewById(R.id.button9);
    	  two = (Button) findViewById(R.id.button10);
    	  three = (Button) findViewById(R.id.button11);
    	  sub = (Button) findViewById(R.id.button12);
    	  clear = (Button) findViewById(R.id.button13);
    	  zero = (Button) findViewById(R.id.button14);
    	  equal = (Button) findViewById(R.id.button15);
    	  add = (Button) findViewById(R.id.button16);
    	  try
    	    {
    		  one.setOnClickListener(this);
    		  one.setOnClickListener(this);
    		  two.setOnClickListener(this);
    		  three.setOnClickListener(this);
    		  four.setOnClickListener(this);
    		  five.setOnClickListener(this);
    		  six.setOnClickListener(this);
    		  seven.setOnClickListener(this);
    		  eight.setOnClickListener(this);
    		  nine.setOnClickListener(this);
    		  add.setOnClickListener(this);
    		  sub.setOnClickListener(this);
    		  mul.setOnClickListener(this);
    		  div.setOnClickListener(this);
    		  equal.setOnClickListener(this);
    		  clear.setOnClickListener(this);

    	    }
    	  	catch(Exception e)
    	  	{
    	
    	  	}
    }
    public void onClick(View arg)
    {
    	switch(arg.getId())
    	{
    	case R.id.button1:
            insert(7); 
            break;
        case R.id.button2:
             insert(8); 
             break;
        case R.id.button3:
            insert(9); 
            break;
        case R.id.button4:
        	perform();
            op = '/';
            break;
        case R.id.button5:
            insert(4); 
            break;
        case R.id.button6:
            insert(5); 
            break;
        case R.id.button7:
            insert(6); 
            break;
        case R.id.button8:
        	perform();
            op = '*';
            break;
        case R.id.button9:
            insert(1); 
            break;
        case R.id.button10:
            insert(2); 
            break;
        case R.id.button11:
            insert(3); 
            break;
        case R.id.button12:
        	perform();
            op = '-'; 
            break;
        case R.id.button13:
        	str ="";
            op =' ';
            num = 0;
            tempnum = 0;
            showResult.setText("");
            break;
        case R.id.button14:
            insert(0); 
            break;
        case R.id.button15:
        	calculate();   
            break;
        case R.id.button16:
        	perform();
            op = '+';
            break;
    	}
       
    }
      private void insert(int j) 
      {
       str = Integer.toString(j)+str;
       num= Integer.valueOf(str).intValue();
       showResult.setText(str);
      }
      private void perform() 
      {
      str = "";
      tempnum = num;
      }
      private void calculate() 
      {
    	  if(op == '+')
    	  num = tempnum+num;
          else if(op == '-')
          num = tempnum-num;
          else if(op == '/')
          num = tempnum/num;
          else if(op == '*')
          num = tempnum*num;
          showResult.setText(""+num);
       }
     
}


