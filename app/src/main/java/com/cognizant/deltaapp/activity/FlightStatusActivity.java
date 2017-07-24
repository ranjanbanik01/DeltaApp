package com.cognizant.deltaapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.cognizant.deltaapp.Builder.DeltaRequestBuilder;
import com.cognizant.deltaapp.Util.DeltaRequestSerializer;

public class FlightStatusActivity extends AppCompatActivity {

    private static final int FROM_LOCATION_CODE = 111;
    private static final int TO_LOCATION_CODE = 222;
    private EditText fromLocation, toLocation;
    private TextView fromLocationText, toLocationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.e("Serialization Test", DeltaRequestSerializer.getRequestInXML(DeltaRequestBuilder.buildStatusRequestByLeg()));

        fromLocationText = (TextView) findViewById(R.id.from_location_text);
        toLocationText = (TextView) findViewById(R.id.to_location_text);

        fromLocation = (EditText) findViewById(R.id.from_location);
        fromLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FlightStatusActivity.this, SearchLocationActivity.class);
                intent.putExtra("FROM_LOCATION", true);
                startActivityForResult(intent, FROM_LOCATION_CODE);
            }
        });

        toLocation = (EditText) findViewById(R.id.to_location);
        toLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FlightStatusActivity.this, SearchLocationActivity.class);
                intent.putExtra("FROM_LOCATION", false);
                startActivityForResult(intent, TO_LOCATION_CODE);
            }
        });

        Button viewStatus = (Button) findViewById(R.id.view_status);
        viewStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FlightStatusActivity.this, FlightsListActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } else if(id == R.id.action_share_link) {
            Intent i=new Intent(android.content.Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(android.content.Intent.EXTRA_SUBJECT,"Subject test");
            i.putExtra(android.content.Intent.EXTRA_TEXT, "extra text that you want to put");
            startActivity(Intent.createChooser(i,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == FROM_LOCATION_CODE) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("RESULT");
                fromLocation.setHint("");
                fromLocationText.setText(result);
            }
        } else if (requestCode == TO_LOCATION_CODE) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("RESULT");
                toLocation.setHint("");
                toLocationText.setText(result);
            }
        }
    }
}
