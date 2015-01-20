package com.example.sample;
	
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		final EditText targetEditText = (EditText)findViewById(R.id.editText1);

		targetEditText.addTextChangedListener(new TextWatcher() {
	    	  public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {}

		  public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {}

		  @SuppressLint("NewApi")
		public void afterTextChanged(Editable arg0) {
		    String str = targetEditText.getText().toString();
		    if (str.isEmpty()) return;
		    String str2 = PerfectDecimal(str, 4, 2);

		    if (!str2.equals(str)) {
		        targetEditText.setText(str2);
		        int pos = targetEditText.getText().length();
		        targetEditText.setSelection(pos);
		    }
		  }
		});
		
	}

	public String PerfectDecimal(String str, int MAX_BEFORE_POINT, int MAX_DECIMAL){
		  if(str.charAt(0) == '.') str = "0"+str;
		  int max = str.length();

		  String rFinal = "";
		  boolean after = false;
		  int i = 0, up = 0, decimal = 0; char t;
		  while(i < max){
		    t = str.charAt(i);
		    if(t != '.' && after == false){
		        up++;
		        if(up > MAX_BEFORE_POINT) return rFinal;
		    }else if(t == '.'){
		        after = true;
		    }else{
		        decimal++;
		        if(decimal > MAX_DECIMAL)
		            return rFinal;
		    }
		    rFinal = rFinal + t;
		    i++;
		  }return rFinal;
		}
	
	public String PerfectDecimal5(String str, int MAX_BEFORE_POINT, int MAX_DECIMAL){
		  if(str.charAt(0) == '.') str = "0"+str;
		  int max = str.length();

		  String rFinal = "";
		  boolean after = false;
		  int i = 0, up = 0, decimal = 0; char t;
		  while(i < max){
		    t = str.charAt(i);
		    if(t != '.' && after == false){
		        up++;
		        if(up > MAX_BEFORE_POINT) return rFinal;
		    }else if(t == '.'){
		        after = true;
		    }else{
		        decimal++;
		        if(decimal > MAX_DECIMAL)
		            return rFinal;
		    }
		    rFinal = rFinal + t;
		    i++;
		  }return rFinal;
		}
	
	
	public String PerfectDecimal7(String str, int MAX_BEFORE_POINT, int MAX_DECIMAL){
		  if(str.charAt(0) == '.') str = "0"+str;
		  int max = str.length();

		  String rFinal = "";
		  boolean after = false;
		  int i = 0, up = 0, decimal = 0; char t;
		  while(i < max){
		    t = str.charAt(i);
		    if(t != '.' && after == false){
		        up++;
		        if(up > MAX_BEFORE_POINT) return rFinal;
		    }else if(t == '.'){
		        after = true;
		    }else{
		        decimal++;
		        if(decimal > MAX_DECIMAL)
		            return rFinal;
		    }
		    rFinal = rFinal + t;
		    i++;
		  }return rFinal;
		}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sample, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
