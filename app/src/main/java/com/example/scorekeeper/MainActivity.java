package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.scorekeeper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    int team_a_points, team_b_points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.points3TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_a_points += 3;
                displayTeamAPoints(team_a_points);
            }
        });

        binding.points2TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_a_points += 2;
                displayTeamAPoints(team_a_points);
            }
        });

        binding.pointsFreeTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_a_points += 1;
                displayTeamAPoints(team_a_points);
            }
        });

        binding.points3TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_b_points += 3;
                displayTeamBPoints(team_b_points);
            }
        });

        binding.points2TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_b_points += 2;
                displayTeamBPoints(team_b_points);
            }
        });

        binding.pointsFreeTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_b_points += 1;
                displayTeamBPoints(team_b_points);
            }
        });

        binding.resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_a_points = 0;
                team_b_points = 0;
                displayTeamAPoints(team_a_points);
                displayTeamBPoints(team_b_points);
                Toast.makeText(MainActivity.this, "Score Reset", Toast.LENGTH_SHORT).show();
            }
        });

    }

    void displayTeamAPoints(int number) {
        binding.scoreTeamA.setText(""+number);
    }

    void displayTeamBPoints(int number) {
        binding.scoreTeamB.setText(""+number);
    }

}
