package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_zero, btn_dot,
            multiply, division, percent, plus, minus, equal, bracket, clear, btn_delete;
    TextView input;
    String one;
    EditText textView;
    boolean checkBracket = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));


        btn1 = findViewById(R.id.btn1);
        textView = findViewById(R.id.tvInput);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn_zero = findViewById(R.id.btnZero);
        btn_dot = findViewById(R.id.btnDot);
        multiply = findViewById(R.id.btnMultiply);
        division = findViewById(R.id.btnDivision);
        plus = findViewById(R.id.btnPLus);
        minus = findViewById(R.id.btnMinus);
        clear = findViewById(R.id.btnClear);
        percent = findViewById(R.id.btnPercent);
        bracket = findViewById(R.id.btnBracket);
        equal = findViewById(R.id.btnEqual);
        input = findViewById(R.id.tvOutput);
        btn_delete = findViewById(R.id.btn_delete);
        textView.setShowSoftInputOnFocus(false);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                input.setText("");
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                one = textView.getText().toString();
//                SharedPreferences shard = getSharedPreferences("demo",MODE_PRIVATE);
//                SharedPreferences.Editor editor =shard.edit();
//                editor.putString("str1",one+"1");
//                editor.apply();
                int cu = textView.getSelectionStart();
                textView.setText(one + "1");
                textView.setSelection(cu + 1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SharedPreferences shard = getSharedPreferences("demo",MODE_PRIVATE);
//                SharedPreferences.Editor editor =shard.edit();
//                editor.putString("str1",one+"2    ");
//                editor.apply();
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "2");
                textView.setSelection(cu + 1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "3");
                textView.setSelection(cu + 1);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "4");
                textView.setSelection(cu + 1);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "5");
                textView.setSelection(cu + 1);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "6");
                textView.setSelection(cu + 1);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "7");
                textView.setSelection(cu + 1);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "8");
                textView.setSelection(cu + 1);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "9");
                textView.setSelection(cu + 1);
            }
        });
        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "0");
                textView.setSelection(cu + 1);
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + ".");
                textView.setSelection(cu + 1);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "+");
                textView.setSelection(cu + 1);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "-");
                textView.setSelection(cu + 1);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "×");
                textView.setSelection(cu + 1);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "÷");
                textView.setSelection(cu + 1);
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                int cu = textView.getSelectionStart();
                textView.setText(one + "%");
                textView.setSelection(cu + 1);
            }
        });

        bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBracket) {
                    one = textView.getText().toString();
                    int cu = textView.getSelectionStart();
                    textView.setText(one + ")");
                    textView.setSelection(cu + 1);
                    checkBracket = false;
                } else {

                    one = textView.getText().toString();
                    int cu = textView.getSelectionStart();
                    textView.setText(one + "(");
                    textView.setSelection(cu + 1);
                    checkBracket = true;
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = textView.getText().toString();
                one = one.replace("×", "*");
                one = one.replace("%", "/100");
                one = one.replace("÷", "/");
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult = "";
                try {
                    Scriptable scriptable = rhino.initSafeStandardObjects();
                    finalResult = rhino.evaluateString(scriptable, one, "javascript", 1, null).toString();

                } catch (Exception e) {
                    finalResult = "Error";


                }
                input.setText(finalResult);

            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = textView.getSelectionStart();
                int textLen = textView.getText().length();
                if (cursorPos != 0 && textLen != 0) {
                    SpannableStringBuilder selection = (SpannableStringBuilder) textView.getText();
                    selection.replace(cursorPos - 1, cursorPos, "");
                    textView.setText(selection);
                    textView.setSelection(cursorPos - 1);
                }
            }
        });
//        SharedPreferences getShared= getSharedPreferences("demo",MODE_PRIVATE);
//        String value = getShared.getString("str1","");
//        textView.setText(value);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_1:
                Intent intent =new Intent(getApplicationContext(),history.class);
                startActivity(intent);
                Toast.makeText(this, "Click History", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item_2:
                Toast.makeText(this, " Click Settings", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item_3:
                Toast.makeText(this, " Click More", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}