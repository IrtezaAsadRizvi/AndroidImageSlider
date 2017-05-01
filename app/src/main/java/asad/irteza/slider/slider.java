package asad.irteza.slider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Irteza on 01-May-17.
 */

public class slider extends PagerAdapter {
    private int[] images = {
            R.drawable.product_view1,
            R.drawable.product_view2,
            R.drawable.product_view3
    };
    private Context ctx;
    private LayoutInflater layoutInflater;
    public slider(Context ctx){
        this.ctx = ctx;
    }

    public int getCount(){
        return images.length;
    }
    public boolean isViewFromObject(View view,Object object){
        return (view == (LinearLayout)object);
    }
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.product_slider,container,false);

        ImageView img_slider = (ImageView)item_view.findViewById(R.id.slide_img);

        img_slider.setImageResource(images[position]);
        container.addView(item_view);

        return item_view;
    }

    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView((LinearLayout)object);
    }
}
