package com.example.finalcal;




import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    
public String str ="";
Character op = ' ';
int i,num,numtemp;
   EditText showResult;
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
     
       showResult = (EditText)findViewById(R.id.result_id);        
   }
   public void onClick(View arg0) 
   {
       //Editable str =  showResult.getText();
       switch(arg0.getId())
       {
       case R.id.Btn0_id:
       insert(0); 
       break;
       
       case R.id.Btn1_id:
       insert(1); 
       break;
       
       case R.id.Btn2_id:
       insert(2);
       break;
       
       case R.id.Btn3_id:
       insert(3);
       break;
       
       case R.id.Btn4_id:
       insert(4);
       break;
       
       case R.id.Btn5_id:
       insert(5);
       break;
       
       case R.id.Btn6_id:
       insert(6);
       break;
       
       case R.id.Btn7_id:
       insert(7);
       break;
       
       case R.id.Btn8_id:
       insert(8);
       break;
       
       case R.id.Btn9_id:
       insert(9);
       break;
       
       case R.id.Btnplus_id:
       perform();
       op = '+';
       break;
       
       case R.id.Btnminus_id:
       perform();
       op = '-';
       break;
       
       case R.id.Btndivide_id:
       perform();
       op = '/';
       break;
       
       case R.id.Btnmulti_id:
       perform();
       op = '*';
       break;
       
       case R.id.Btnequal_id:
       calculate();
       break;
       
       case R.id.Btnclear_id:
       reset();
       break;
     }
   }
     private void reset() 
     {
 // TODO Auto-generated method stub
    	 str ="";
    	 op =' ';
    	 num = 0;
    	 numtemp = 0;
    	 showResult.setText("");
     }
     
     private void insert(int j) 
	{
      str = str+Integer.toString(j);
      num = Integer.valueOf(str).intValue();
      showResult.setText(str);
    }
     private void perform() 
     {
     str = "";
     numtemp = num;
     }
     private void calculate() {
   // TODO Auto-generated method stub
   if(op == '+')
    num = numtemp+num;
   else if(op == '-')
    num = numtemp-num;
   else if(op == '/')
    num = numtemp/num;
   else if(op == '*')
    num = numtemp*num;
   showResult.setText(""+num);
  }
}
