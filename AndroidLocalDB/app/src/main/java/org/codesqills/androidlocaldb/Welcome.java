package org.codesqills.androidlocaldb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by kamalshree on 8/31/2017.
 */

public class Welcome extends Activity {
    Context ctx;
    BackgroundTask bt =new BackgroundTask(ctx);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        TextView welcomemessage=(TextView)findViewById(R.id.welcome);

        Bundle bundle = getIntent().getExtras();
        String namevale = bundle.getString("nameval");

        welcomemessage.setText(namevale);
    }
}
