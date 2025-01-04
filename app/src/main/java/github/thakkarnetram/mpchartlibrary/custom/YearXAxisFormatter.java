package github.thakkarnetram.mpchartlibrary.custom;

import github.thakkarnetram.chartlibrary.charting.components.AxisBase;
import github.thakkarnetram.chartlibrary.charting.formatter.IAxisValueFormatter;

/**
 * Created by Philipp Jahoda on 14/09/15.
 */
@SuppressWarnings("unused")
public class YearXAxisFormatter implements IAxisValueFormatter
{

    private final String[] mMonths = new String[]{
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"
    };

    public YearXAxisFormatter() {
        // take parameters to change behavior of formatter
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {

        float percent = value / axis.mAxisRange;
        return mMonths[(int) (mMonths.length * percent)];
    }
}
