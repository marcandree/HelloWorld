package nova.ch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //je fais référence au Textview qui a été crée dans le fichier layout
        TextView textView = (TextView) findViewById(R.id.textViewMessage);

        // je desire assigner un autre texte au textView
        textView.setText("Hello World");

    }


}


