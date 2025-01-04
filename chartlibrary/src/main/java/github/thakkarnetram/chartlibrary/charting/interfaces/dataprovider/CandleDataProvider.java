package github.thakkarnetram.chartlibrary.charting.interfaces.dataprovider;

import github.thakkarnetram.chartlibrary.charting.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
