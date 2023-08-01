package jp.suntech.s22023.myintent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText addressEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        addressEditText = findViewById(R.id.addressEditText);
    }

    public void displayGreeting(View view) {
        String name = nameEditText.getText().toString();
        String address = addressEditText.getText().toString();
        String greeting = name.isEmpty() ? "お客様" : name;

        if (!address.isEmpty()) {
            greeting += "にお住いの" + address + "さん、こんにちは！";
        }

        Toast.makeText(this, greeting, Toast.LENGTH_SHORT).show();
    }

    public void clearName(View view) {
        nameEditText.setText("");
    }

    public void clearAddress(View view) {
        addressEditText.setText("");
    }
}