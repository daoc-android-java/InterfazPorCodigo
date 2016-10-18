package com.example.testfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout layout = new LinearLayout(this);
		
		TextView tv = new TextView(this);
		tv.setText("Hola Mundo");
		
		Button b = new Button(this);
		b.setText("Aplasteme");
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Fui creado por codigo", Toast.LENGTH_SHORT).show();
			}
		});
		
		layout.addView(tv);
		layout.addView(b);
		
		setContentView(layout);
		
	}

}
