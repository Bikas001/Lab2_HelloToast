package np.com.cbikas.lab2hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvCount;
    Button btntost,btncounter;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCount=findViewById(R.id.tvcounter);
        btncounter=findViewById(R.id.btncounter);
        btntost=findViewById(R.id.btntoast);
//        btncounter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                count++;
//                tvCount.setText(""+count);
//            }
//        });
//
//        btntost.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"TOAST",Toast.LENGTH_SHORT).show();
//            }
//        });
    }
    public void toastMassage(View view){
        Toast.makeText(MainActivity.this,"TOAST",Toast.LENGTH_SHORT).show();
    }
    public void counter(View view){
        count++;
        tvCount.setText(""+count);

    }
}
