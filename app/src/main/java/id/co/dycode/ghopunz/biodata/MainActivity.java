package id.co.dycode.ghopunz.biodata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final int RC_CHANGE_INPUT = 1;
    @BindView(R.id.label_name)
    TextView labelName;
    @BindView(R.id.edit_profile)
    Button editProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.edit_profile)
    public void onClick() {

        Intent intent = new Intent(this, EditProfileActivity.class);
        String data = labelName.getText().toString();

        intent.putExtra("name", data);
        startActivityForResult(intent, RC_CHANGE_INPUT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RC_CHANGE_INPUT && resultCode == RESULT_OK){
            String result = data.getExtras().getString("result");
            labelName.setText(result);
        }

    }
}
