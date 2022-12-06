package com.example.reactiongame;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.List;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyIntentService extends IntentService {


    public static final String ACTION_RESPONSE = BuildConfig.APPLICATION_ID + ".RESPONSE";
    public static final String EXTRA_POINTS = "EXTRA_POINTS";

    final String FILENAME = "intentFile.json";

    private final String TAG = "IntentServiceLogs";

    String[][] points;

    public MyIntentService() {
        super(MyIntentService.class.getName());
    }

    public void onCreate() {
        super.onCreate();
        Log.d("IntentServiceLogs", "onCreate");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("IntentService", "Start");

        assert intent != null;
        String action = intent.getAction();

//        if (ACTION_RESPONSE.equals(action)) {
//
//            JSONObject json = new JSONObject();
//            try {
//                json.put("name", "loadJSONFromAsset()");
//                json.put("employees", 140000);
//                json.put("offices", "Mountain View Los Angeles New York");
//                // Convert JsonObject to String Format
//                String userString = json.toString();
//                // Define the File Path and its Name
//                File file = new File(FILENAME);
//                FileWriter fileWriter = null;
//                try {
//                    System.out.println(this.getFilesDir().getPath().toString()+"++++++++++");
//                    fileWriter = new FileWriter(Context.MODE_PRIVATE);
//                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                    System.out.println(userString+"-------------------");
//                    bufferedWriter.write(userString);
//                    bufferedWriter.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//
//        }

    }

//    public String loadJSONFromAsset() {
//        String json;
//        try {
//            InputStream is = getApplicationContext().getAssets().open("intentFile.json");
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//            json = new String(buffer, StandardCharsets.UTF_8);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            return null;
//        }
//        return json;
//    }

    public void writeInIntentFile(String s) {

//        try {
        //File file = new File(FILENAME);
        //FileWriter out = new FileWriter(file);
//            String out = json.toString();
//            File file = new File(FILENAME);
//            FileOutputStream fileWriter = new FileOutputStream(file);

//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getFilesDir() + FILENAME));
//            bufferedWriter.write(out);
//            bufferedWriter.close();
//            out = new BufferedWriter(new FileWriter(file));
//
//            out.write(json.toString());
//            out.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
