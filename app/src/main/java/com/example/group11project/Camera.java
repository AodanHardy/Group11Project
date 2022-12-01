package com.example.group11project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Camera extends AppCompatActivity {

    private static final int PERMISSION_CODE = 1234;
    private static final int CAPTURE_CODE = 1001;
    Button takePicture;
    Button confirmPicture;
    ImageView cameraView;
    Uri image_uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        confirmPicture = (Button) findViewById(R.id.btn_confirmImg);

        confirmPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Camera.this, SubmissionConfirmed.class);
                startActivity(i);
            }
        });

        takePicture = findViewById(R.id.captureImage);
        cameraView = findViewById(R.id.imageView);

        takePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CAMERA) ==
                            PackageManager.PERMISSION_DENIED ||
                            checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                                    PackageManager.PERMISSION_DENIED ) {

                        String[] permission =  {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission, PERMISSION_CODE);
                    } else {
                        openCamera();
                    }
                } else {
                    openCamera();
                }
            }
        });

    }

    private void openCamera() {
        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.TITLE,"new image");
        values.put(MediaStore.Images.Media.DESCRIPTION, "FROM CAMERA");
        image_uri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

        Intent camIntent  = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        camIntent.putExtra(MediaStore.EXTRA_OUTPUT, image_uri);
        startActivityForResult(camIntent, CAPTURE_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch(requestCode) {
            case PERMISSION_CODE:
                if(grantResults.length > 0 && grantResults[0] ==
                    PackageManager.PERMISSION_GRANTED) {
                        openCamera();

                } else {
                    Toast.makeText(this, "Permissions Denied!", Toast.LENGTH_SHORT).show();
                }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(resultCode == RESULT_OK) {
            cameraView.setImageURI(image_uri);
        }
    }
}