# DinamicRadioGroup

* `XML` code:
```xml
<RadioGroup
    android:id="@+id/radioGrp"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

* `Activity` code:
```java
String[] websitesArray = {"Yahoo", "Hotmail", "Gmail", "Facebook", "Other"};

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
```

---

```
Copyright 2020 M. Fadli Zein
```