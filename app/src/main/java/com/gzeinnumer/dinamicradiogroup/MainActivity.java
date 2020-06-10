package com.gzeinnumer.dinamicradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRadioButton();
    }

    private void initRadioButton() {
        final RadioGroup radioGrp = findViewById(R.id.rg);

        //get string array from source
        String[] websitesArray = getResources().getStringArray(R.array.websites_array);

        //create radio buttons
        for (int i = 0; i < websitesArray.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(websitesArray[i]);
            radioButton.setId(i);
            radioGrp.addView(radioButton);
        }

        //set listener to radio button group
        radioGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int checkedRadioButtonId = radioGrp.getCheckedRadioButtonId();
                RadioButton radioBtn = findViewById(checkedRadioButtonId);
                Toast.makeText(getApplicationContext(), radioBtn.getText() +"_"+radioBtn.getId(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}