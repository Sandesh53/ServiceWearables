package com.e.servicewearables;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnnotification1,btnnotification2;
    NotificationManagerCompat notificationManagerCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnotification1 = findViewById(R.id.btnNotification1);
        btnnotification2 = findViewById(R.id.btnNotification2);
        notificationManagerCompat = NotificationManagerCompat.from(this);


        btnnotification1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();

            }
        });
        btnnotification2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification2();
            }
        });
    }
        private void DisplayNotification() {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "Channel1")
                    .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                    .setContentTitle("First Message")
                    .setContentText("This is my first Message")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setCategory(NotificationCompat.CATEGORY_MESSAGE);

            notificationManagerCompat.notify(1, builder.build());
        }




        private void DisplayNotification2 () {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "Channel2")
                    .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                    .setContentTitle("Second Message")
                    .setContentText("This is my second Message")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setCategory(NotificationCompat.CATEGORY_MESSAGE);

            notificationManagerCompat.notify(2, builder.build());
        }

    }




