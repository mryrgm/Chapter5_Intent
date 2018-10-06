package v.com.chapter5_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        Toast.makeText(this, "RUN!! Ean is coming!!!", Toast.LENGTH_LONG).show();
        if (v.getId() == R.id.btnEmail){
            i = new Intent(Intent.ACTION_SEND);
            i.setData(Uri.parse("para kay: "));
            String[] to = {"mrrargame@gmail.com"};
            i.putExtra(Intent.EXTRA_EMAIL, to);
            i.putExtra(Intent.EXTRA_SUBJECT, "Annyeeeeong!!");
            i.putExtra(Intent.EXTRA_TEXT, "E X O KO KO BAP!!!");
            i.setType("message/rfce22");
            startActivity(i);
        }
}


}