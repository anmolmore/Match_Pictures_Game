package com.example.match_game_with_intent;

import com.example.match_game_with_intent.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Matcher extends Activity implements OnClickListener {


	private static String first_click="";
	private static String second_click="";
	private static boolean matchFlag = false;
	private static Button prevClicked;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        
        Button button_1 = (Button)findViewById(R.id.button1);
        button_1.setOnClickListener(this);
        button_1.setBackgroundResource(R.drawable.blue_monster_angry_icon);
        Button button_2 = (Button)findViewById(R.id.button2);
        button_2.setOnClickListener(this);
        button_2.setBackgroundResource(R.drawable.green_monster_1_icon);
        Button button_3 = (Button)findViewById(R.id.button3);
        button_3.setOnClickListener(this);
        button_3.setBackgroundResource(R.drawable.fire_toy_icon);
        Button button_4 = (Button)findViewById(R.id.button4);
        button_4.setOnClickListener(this);
        button_4.setBackgroundResource(R.drawable.green_monster_1_icon);
        Button button_5 = (Button)findViewById(R.id.button5);
        button_5.setOnClickListener(this);
        button_5.setBackgroundResource(R.drawable.fire_toy_icon);
        Button button_6 = (Button)findViewById(R.id.button6);
        button_6.setOnClickListener(this);
        button_6.setBackgroundResource(R.drawable.green_monster_icon);
        Button button_7 = (Button)findViewById(R.id.button7);
        button_7.setOnClickListener(this);
        button_7.setBackgroundResource(R.drawable.blue_monster_angry_icon);
        Button button_8 = (Button)findViewById(R.id.button8);
        button_8.setOnClickListener(this);
        button_8.setBackgroundResource(R.drawable.blue_monster_angry_icon);
        Button button_9 = (Button)findViewById(R.id.button9);
        button_9.setOnClickListener(this);
        button_9.setBackgroundResource(R.drawable.green_monster_1_icon);
        Button button_10 = (Button)findViewById(R.id.button10);
        button_10.setOnClickListener(this);
        button_10.setBackgroundResource(R.drawable.green_monster_1_icon);
        Button button_11 = (Button)findViewById(R.id.button11);
        button_11.setOnClickListener(this);
        button_11.setBackgroundResource(R.drawable.green_monster_icon);
        Button button_12 = (Button)findViewById(R.id.button12);
        button_12.setOnClickListener(this);
        button_12.setBackgroundResource(R.drawable.blue_monster_angry_icon);
    }

    //Condition for check
	public void onClick(View v) {
		Button button = (Button)v;
		if(!matchFlag) {
			
			first_click = button.getText().toString();
			matchFlag = true;
			prevClicked = button;
			Log.d("First if Condition", "first_click - " + first_click + " matchFlag - " + matchFlag + " prevClicked - " + prevClicked.getText());
		}
		else if(matchFlag) {
			second_click = button.getText().toString();
			if(second_click.equals(first_click) && prevClicked.getId()!=button.getId())
			{
				Log.d("Matching text found", first_click + "  " + second_click);
				button.setClickable(false);
				button.setEnabled(false);
				prevClicked.setEnabled(false);
				prevClicked.setClickable(false);
				button.setBackgroundResource(R.drawable.ic_launcher);
				prevClicked.setBackgroundResource(R.drawable.ic_launcher);
				matchFlag = false;
				prevClicked = null;
				first_click = "";
				second_click = "";
			}
			else
			{
				first_click = button.getText().toString();
				matchFlag = true;
				prevClicked = button;
				second_click = "";
			}
			Log.d("else if Condition", "first_click - " + first_click + " matchFlag - " + matchFlag + " prevClicked - " + (prevClicked!=null?prevClicked.getText():"") );
		}			
	}
}
