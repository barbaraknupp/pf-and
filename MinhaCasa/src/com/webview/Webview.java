package com.webview;

import com.minhacasa.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webview extends Activity {

 private WebView webView;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_webview);
       
      webView = (WebView) findViewById(R.id.webView1);
      IniciarWebView("http://192.168.0.108/");
   }

   private void IniciarWebView(String url) {
	  webView.setWebViewClient(new WebViewClient(){      
	    public boolean shouldOverrideUrlLoading(WebView view, String url) {              
	      view.loadUrl(url);
	      return true;
	    }                      
      }); 
		   
	  webView.getSettings().setJavaScriptEnabled(true);
      webView.loadUrl(url); 
	} 	     
}
