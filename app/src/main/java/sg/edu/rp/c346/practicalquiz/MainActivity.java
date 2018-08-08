package sg.edu.rp.c346.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spin1;
    WebView wvWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin1 = findViewById(R.id.spinner);
        wvWeb = findViewById(R.id.webView);

        wvWeb.setWebViewClient(new WebViewClient());

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String url = "";
                if(position==0){
                    url = "http://www.facebook.com";
                }
                else if (position==1){
                    url="https://twitter.com";
                }
                //Toast to check the url
                /*Toast toast = Toast.makeText(MainActivity.this, url, Toast.LENGTH_LONG);
                toast.show();*/
                wvWeb.getSettings().setJavaScriptEnabled(true);
                wvWeb.loadUrl(url);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
