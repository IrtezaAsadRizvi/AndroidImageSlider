package asad.irteza.slider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class product extends AppCompatActivity {
    ViewPager viewPager;
    slider adapter;
    Button cartbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        viewPager = (ViewPager)findViewById(R.id.slider);
        adapter = new slider(this);
        cartbtn = (Button)findViewById(R.id.orderbtn);

        viewPager.setAdapter( adapter );
        cartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(product.this, "Added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
