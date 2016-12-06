package id.co.dycode.ghopunz.biodata;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ghopunz on 06/12/2016.
 */

public class EditProfileActivity extends AppCompatActivity {

    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.btn_edit_ok)
    Button btnEditOk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        ButterKnife.bind(this);

        String data = getIntent().getExtras().getString("name");
        editText.setText(data);
    }

    @OnClick(R.id.btn_edit_ok)
    public void onClick() {

//        Pattern ps = Pattern.compile("^[a-zA-Z ]+$");

        if(editText.getText().length() <= 0){
            Toast.makeText(this, "Cannot Empty", Toast.LENGTH_SHORT).show();
        }else{
            Intent resultIntent = new Intent();

            resultIntent.putExtra("result", editText.getText().toString());
            setResult(RESULT_OK, resultIntent);

            finish();
        }

    }
}
