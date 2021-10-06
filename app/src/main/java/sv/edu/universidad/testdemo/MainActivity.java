package sv.edu.universidad.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this,"Prueba de cambios en Github",Toast.LENGTH_LONG).show();

        //Toast.makeText(this,"Nuevamente haciendo cambios " +
        //        "desde Android Studio hacia Github",Toast.LENGTH_LONG).show();

        Toast.makeText(this,"Un usuario mas probando",Toast.LENGTH_LONG).show();

    }
}