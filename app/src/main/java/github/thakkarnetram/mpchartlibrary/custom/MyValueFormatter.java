package github.thakkarnetram.mpchartlibrary.custom;

import github.thakkarnetram.chartlibrary.charting.data.Entry;
import github.thakkarnetram.chartlibrary.charting.formatter.IValueFormatter;
import github.thakkarnetram.chartlibrary.charting.utils.ViewPortHandler;

import java.text.DecimalFormat;

public class MyValueFormatter implements IValueFormatter
{

    private final DecimalFormat mFormat;

    public MyValueFormatter() {
        mFormat = new DecimalFormat("###,###,###,##0.0");
    }

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return mFormat.format(value) + " $";
    }
}
