
package github.thakkarnetram.mpchartlibrary.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;

import github.thakkarnetram.chartlibrary.charting.components.MarkerView;
import github.thakkarnetram.chartlibrary.charting.data.CandleEntry;
import github.thakkarnetram.chartlibrary.charting.data.Entry;
import github.thakkarnetram.chartlibrary.charting.highlight.Highlight;
import github.thakkarnetram.chartlibrary.charting.utils.MPPointF;
import github.thakkarnetram.chartlibrary.charting.utils.Utils;
import github.thakkarnetram.mpchartlibrary.R;

/**
 * Custom implementation of the MarkerView.
 *
 * @author Philipp Jahoda
 */
@SuppressLint("ViewConstructor")
public class MyMarkerView extends MarkerView {

    private final TextView tvContent;

    public MyMarkerView(Context context, int layoutResource) {
        super(context, layoutResource);

        tvContent = findViewById(R.id.tvContent);
    }

    // runs every time the MarkerView is redrawn, can be used to update the
    // content (user-interface)
    @Override
    public void refreshContent(Entry e, Highlight highlight) {

        if (e instanceof CandleEntry) {

            CandleEntry ce = (CandleEntry) e;

            tvContent.setText(Utils.formatNumber(ce.getHigh(), 0, true));
        } else {

            tvContent.setText(Utils.formatNumber(e.getY(), 0, true));
        }

        super.refreshContent(e, highlight);
    }

    @Override
    public MPPointF getOffset() {
        return new MPPointF(-(getWidth() / 2), -getHeight());
    }
}
