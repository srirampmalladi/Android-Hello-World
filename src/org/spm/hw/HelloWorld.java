package org.spm.hw;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloWorld extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        System.out.println();
        
        Button b = (Button) findViewById(R.id.exit_button);
        b.setOnClickListener(this);
    }

	private void showDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("I will exit now")
               .setCancelable(false)
               .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                        HelloWorld.this.finish();
                   }
               })
               .setNegativeButton("Nooooooooooooooooooooo", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                   }
               });
        AlertDialog alert = builder.create();
        alert.show();
	}

	@Override
	public void onClick(View v) {
		showDialog();
	}
}