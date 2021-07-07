package sahab.singh.scms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import sahab.singh.scms.LoginActivity.LoginActivityAdmin;
import sahab.singh.scms.LoginActivity.LoginActivityStudent;
import sahab.singh.scms.LoginActivity.LoginActivityTeacher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //adding all three imageView to mainactivity
        ImageView ivStudent = findViewById(R.id.student_icon);
        ImageView ivTeacher = findViewById(R.id.teachers_icon);
        ImageView ivAdmin = findViewById(R.id.admin_icon);

        //setting on click listener on student_icon image
        ivStudent.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivityStudent.class);
            startActivity(intent);
            finish();//to finish the activity so that when we back pressed we exit app

        });

        //setting on click listener on teachers_icon image
        ivTeacher.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivityTeacher.class);
            startActivity(intent);
            finish();//to finish the activity so that when we back pressed we exit app
        });
        //setting on click listener on admin_icon image
        ivAdmin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivityAdmin.class);
            startActivity(intent);
            finish();//to finish the activity so that when we back pressed we exit app
        });


    }
}