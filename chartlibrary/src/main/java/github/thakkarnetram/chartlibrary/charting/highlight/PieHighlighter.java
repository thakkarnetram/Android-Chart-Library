package github.thakkarnetram.chartlibrary.charting.highlight;

import github.thakkarnetram.chartlibrary.charting.charts.PieChart;
import github.thakkarnetram.chartlibrary.charting.data.Entry;
import github.thakkarnetram.chartlibrary.charting.interfaces.datasets.IPieDataSet;

/**
 * Created by philipp on 12/06/16.
 */
public class PieHighlighter extends PieRadarHighlighter<PieChart> {

    public PieHighlighter(PieChart chart) {
        super(chart);
    }

    @Override
    protected Highlight getClosestHighlight(int index, float x, float y) {

        IPieDataSet set = mChart.getData().getDataSet();

        final Entry entry = set.getEntryForIndex(index);

        return new Highlight(index, entry.getY(), x, y, 0, set.getAxisDependency());
    }
}
