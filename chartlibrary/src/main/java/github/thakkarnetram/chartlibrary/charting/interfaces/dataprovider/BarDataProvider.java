package github.thakkarnetram.chartlibrary.charting.interfaces.dataprovider;

import github.thakkarnetram.chartlibrary.charting.data.BarData;

public interface BarDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BarData getBarData();
    boolean isDrawBarShadowEnabled();
    boolean isDrawValueAboveBarEnabled();
    boolean isHighlightFullBarEnabled();
}
