package com.example.weathervibe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weathervibe.Models.Response;
import com.example.weathervibe.api.OpenWeatherService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView weatherText, cityText, tempText;
    ProgressBar progressBar;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherText = findViewById(R.id.weather);
        cityText = findViewById(R.id.city);
        tempText = findViewById(R.id.temp);

        progressBar = findViewById(R.id.progress);
        linearLayout = findViewById(R.id.layout);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        OpenWeatherService service = retrofit.create(OpenWeatherService.class);

        Call<Response> responseCall = service.getData("uyo","bbff854894e696b3b57a7f8bcc5cac58");

        responseCall.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Log.e("my response",response.toString());
                cityText.setText(response.body().getName());
                tempText.setText(String.valueOf(response.body().getMain().getTemp()));
                weatherText.setText(response.body().getWeather().get(0).getMain());
                progressBar.setVisibility(View.GONE);
                linearLayout.setVisibility(View.VISIBLE);
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.e("Error on app",t.toString());
                progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(),"An error occured while fetching data",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
