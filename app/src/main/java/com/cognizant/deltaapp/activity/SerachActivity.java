package com.cognizant.deltaapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class SerachActivity extends AppCompatActivity {

    private static final String[] FROM_LOCATIONS = new String[]{"Atlanta, GA (ATL)", "Knoxville, TN (TYS)", "Chattanooga, TN (CHA)"};
    private static final String[] TO_LOCATIONS = new String[]{"Orange Country, CA (SNA)"};
    private String[] displayLocation = FROM_LOCATIONS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serach);

        boolean fromLocation = getIntent().getBooleanExtra("FROM_LOCATION", false);
        displayLocation = ( fromLocation == true ) ? FROM_LOCATIONS : TO_LOCATIONS;

        TextView searchText = (TextView) findViewById(R.id.search_text);
        searchText.setText(( fromLocation == true ) ? getString(R.string.current_location) : getString(R.string.matching_cities));

        final EditText editSerachBox = (EditText) findViewById(R.id.edit_serach_box);
        ListView locationsList = (ListView) findViewById(R.id.locations_list);
        locationsList.setTextFilterEnabled(true);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, displayLocation);
        locationsList.setAdapter(adapter);

        editSerachBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        locationsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                editSerachBox.setText(((TextView) view).getText());
//                editSerachBox.setSelection(editSerachBox.getText().length());
                String selectionText = (String) (((TextView) view).getText());
                Intent intent = new Intent();
                intent.putExtra("RESULT", selectionText);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        editSerachBox.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int DRAWABLE_RIGHT = 2;
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    if(event.getRawX() >= (editSerachBox.getRight() - editSerachBox.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        editSerachBox.setText("");
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
