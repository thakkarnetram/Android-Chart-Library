package github.thakkarnetram.chartlibrary.charting.interfaces.dataprovider;

import github.thakkarnetram.chartlibrary.charting.components.YAxis;
import github.thakkarnetram.chartlibrary.charting.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
