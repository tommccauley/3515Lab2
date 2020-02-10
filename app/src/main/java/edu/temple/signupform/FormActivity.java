package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating variables for the EditTexts and button
        final EditText name = findViewById(R.id.name);
        final EditText email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);
        final EditText confirm = findViewById(R.id.confirm);
        Button button = findViewById(R.id.savebutton);

        View.OnClickListener x = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //variables to compare input text
                String strname = name.getText().toString();
                String stremail = email.getText().toString();
                String strpassword = password.getText().toString();
                String strconfirm = confirm.getText().toString();

                //checks for any empty text boxes. displays an error if one or more is empty
                if(strname.equals("") || stremail.equals("") || strpassword.equals("") || strconfirm.equals("")){
                    Toast empty = Toast.makeText(FormActivity.this, "Please fill out every field.", Toast.LENGTH_SHORT);
                    empty.show();
                }


            }
        };
        button.setOnClickListener(x);



    }

}
