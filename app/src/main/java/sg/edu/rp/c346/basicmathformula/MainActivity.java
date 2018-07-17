package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import sg.edu.rp.c346.basicmathformula.CustomAdapter;
import sg.edu.rp.c346.basicmathformula.Mathitem;
import sg.edu.rp.c346.basicmathformula.R;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;
    ArrayList<Mathitem> alMathList;
    CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMath = findViewById(R.id.ListViewMath);

        alMathList = new ArrayList<>();

        Mathitem math1 = new Mathitem("Area of rectangle", "Length x Length");
        Mathitem math2 = new Mathitem("Area of triangle", "(Length of base x Length)/2");
        Mathitem math3 = new Mathitem("Volume of cube", "Length x Length x Length");
        alMathList.add(math1);
        alMathList.add(math2);
        alMathList.add(math3);

        caMath = new CustomAdapter(this, R.layout.math_item, alMathList);

        lvMath.setAdapter(caMath);
    }
}
