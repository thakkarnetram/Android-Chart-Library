package github.thakkarnetram.chartlibrary.charting.interfaces.dataprovider;

import github.thakkarnetram.chartlibrary.charting.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
