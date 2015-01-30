package com.minhacasa;

import com.webview.Webview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaLogin extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_telalogin);
			
    final EditText login = (EditText) findViewById(R.id.editLogin);
    final EditText senha = (EditText) findViewById(R.id.editSenha);
    Button entrar = (Button) findViewById(R.id.btnEntrar);
    Button limpar = (Button) findViewById(R.id.btnLimpar);
		
	entrar.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View arg0) {
		
			String strLogin= login.getText().toString();
			String strSenha= senha.getText().toString();
				
			if((strLogin.equals("bknupp"))&&(strSenha.equals("12345"))){
				Intent i = new Intent ();
				i.setClass(TelaLogin.this, Webview.class);
				startActivity(i);
			}else{
				Toast.makeText(TelaLogin.this,"Login/Senha Incorretos :(",Toast.LENGTH_LONG).show();
			}
		}
	});
		
	limpar.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			login.setText("");
			senha.setText("");			
		}
	});		
 }	
}
