package github.thakkarnetram.chartlibrary.charting.interfaces.dataprovider;

import github.thakkarnetram.chartlibrary.charting.components.YAxis.AxisDependency;
import github.thakkarnetram.chartlibrary.charting.data.BarLineScatterCandleBubbleData;
import github.thakkarnetram.chartlibrary.charting.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
