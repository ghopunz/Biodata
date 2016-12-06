package id.co.dycode.ghopunz.biodata;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by ghopunz on 06/12/2016.
 */

public class CustomImageViewCircularShape extends ImageView {

    public float radius = 100;
    public CustomImageViewCircularShape(Context context){
        super(context);
    }

    public CustomImageViewCircularShape(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public CustomImageViewCircularShape(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {



        Path clipPath = new Path();
        RectF rect = new RectF(0, 0, this.getWidth(), this.getHeight());


        Paint paint = new Paint();
        paint.setColor(Color.GREEN);

        clipPath.addRoundRect(rect, radius, radius, Path.Direction.CW);

        canvas.clipPath(clipPath);
        canvas.drawCircle(this.getPivotX(), this.getPivotY(), 2 * radius, paint);

        super.onDraw(canvas);

    }
}
