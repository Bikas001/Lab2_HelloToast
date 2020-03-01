package np.com.cbikas.lab2hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ToastHello extends AppCompatActivity {
    Button btntoast,btnzero,btncount;
    TextView tvcount;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        btncount=findViewById(R.id.btncounter);
        btntoast=findViewById(R.id.btntoast);
        btnzero=findViewById(R.id.btnzero);

        btncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                tvcount.setText(""+count);
            }
        });

        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count =0;
                tvcount.setText(""+count);
            }
        });

        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ToastHello.this,"TOAST", android.widget.Toast.LENGTH_SHORT).show();
            }
        });
    }
}
