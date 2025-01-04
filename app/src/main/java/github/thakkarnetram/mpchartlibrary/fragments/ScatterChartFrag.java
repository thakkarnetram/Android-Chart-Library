package github.thakkarnetram.mpchartlibrary.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import github.thakkarnetram.chartlibrary.charting.charts.ScatterChart;
import github.thakkarnetram.chartlibrary.charting.components.Legend;
import github.thakkarnetram.chartlibrary.charting.components.XAxis;
import github.thakkarnetram.chartlibrary.charting.components.XAxis.XAxisPosition;
import github.thakkarnetram.chartlibrary.charting.components.YAxis;
import github.thakkarnetram.mpchartlibrary.R;
import github.thakkarnetram.mpchartlibrary.custom.MyMarkerView;


public class ScatterChartFrag extends SimpleFragment {

    @NonNull
    public static Fragment newInstance() {
        return new ScatterChartFrag();
    }

    @SuppressWarnings("FieldCanBeLocal")
    private ScatterChart chart;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_simple_scatter, container, false);

        chart = v.findViewById(R.id.scatterChart1);
        chart.getDescription().setEnabled(false);

        Typeface tf = Typeface.createFromAsset(context.getAssets(), "OpenSans-Light.ttf");

        MyMarkerView mv = new MyMarkerView(getActivity(), R.layout.custom_marker_view);
        mv.setChartView(chart); // For bounds control
        chart.setMarker(mv);

        chart.setDrawGridBackground(false);
        chart.setData(generateScatterData(6, 10000, 200));

        XAxis xAxis = chart.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setPosition(XAxisPosition.BOTTOM);

        YAxis leftAxis = chart.getAxisLeft();
        leftAxis.setTypeface(tf);

        YAxis rightAxis = chart.getAxisRight();
        rightAxis.setTypeface(tf);
        rightAxis.setDrawGridLines(false);

        Legend l = chart.getLegend();
        l.setWordWrapEnabled(true);
        l.setTypeface(tf);
        l.setFormSize(14f);
        l.setTextSize(9f);

        // increase the space between legend & bottom and legend & content
        l.setYOffset(13f);
        chart.setExtraBottomOffset(16f);

        return v;
    }
}
