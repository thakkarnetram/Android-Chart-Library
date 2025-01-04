package github.thakkarnetram.mpchartlibrary.custom;

import github.thakkarnetram.chartlibrary.charting.formatter.IFillFormatter;
import github.thakkarnetram.chartlibrary.charting.interfaces.dataprovider.LineDataProvider;
import github.thakkarnetram.chartlibrary.charting.interfaces.datasets.ILineDataSet;

/**
 * Created by Philipp Jahoda on 12/09/15.
 */
@SuppressWarnings("unused")
public class MyFillFormatter implements IFillFormatter
{

    private float fillPos;

    public MyFillFormatter(float fillPos) {
        this.fillPos = fillPos;
    }

    @Override
    public float getFillLinePosition(ILineDataSet dataSet, LineDataProvider dataProvider) {
        // your logic could be here
        return fillPos;
    }
}
