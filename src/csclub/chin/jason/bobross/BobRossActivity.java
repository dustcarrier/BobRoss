package csclub.chin.jason.bobross;

import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BobRossActivity extends ActionBarActivity {
	public static int bobRossCounter = 0;
	TextView textView1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bob_ross);
		textView1 = (TextView) findViewById(R.id.textCounter);
		//Intent intent = getIntent();
		textView1.setText(bobRossCounter+"");
		
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
	
	public void bobRossClicker(View view){
		bobRossCounter++;
		/*
		Intent intent = new Intent(this, BobRossActivity.class);
		intent.putExtra("counter", bobRossCounter);
		//startActivity(intent);
		 */
		textView1.setText(bobRossCounter+"");
	}
}
