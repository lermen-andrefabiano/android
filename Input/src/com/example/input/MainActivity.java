package com.example.input;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final MainActivity self = this;
		
		final EditText edtNome = (EditText) findViewById(R.id.edtNome);

		Button btnNome = (Button) findViewById(R.id.btnNome);

		btnNome.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				showMessage("valor digitado", edtNome.getText().toString(), true);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			showMessage("R.id.action_settings", "R.id.action_settings", false);
			return true;
		} else if (id == R.id.action_login) {
			showMessage("R.id.action_login", "R.id.action_login", false);
		}

		return super.onOptionsItemSelected(item);
	}

	public void showMessage(String title, String message, boolean cancelable) {
		Builder builder = new Builder(this);
		builder.setCancelable(cancelable);
		builder.setTitle(title);
		builder.setMessage(message);
		builder.show();
	}

}
