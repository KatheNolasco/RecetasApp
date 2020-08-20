package com.example.recetario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    public EditText Email,Password;
    public Button Button;

    private FirebaseAuth mAuth;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crearreceta);

        mAuth = FirebaseAuth.getInstance();


        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        Button = findViewById(R.id.button);


        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
              startActivity(new Intent(createPackageContext(MainActivity.this,CrearReceta.class)));
              mAuth.signInWithEmailAndPassword(Email.getText().toString(),Password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                  @Override
                  public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(view.getContext(),"Logueado Correctamente",Toast.LENGTH_LONG).show();

                    }
                  }
              });

            }
        });






    }

    private Intent createPackageContext(MainActivity mainActivity, Class<CrearReceta> crearRecetaClass) {
        return null;
    }


}