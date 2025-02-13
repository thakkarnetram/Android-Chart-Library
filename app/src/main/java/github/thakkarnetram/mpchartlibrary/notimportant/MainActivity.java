
package github.thakkarnetram.mpchartlibrary.notimportant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import github.thakkarnetram.chartlibrary.charting.utils.Utils;
import github.thakkarnetram.mpchartlibrary.AnotherBarActivity;
import github.thakkarnetram.mpchartlibrary.BarChartActivity;
import github.thakkarnetram.mpchartlibrary.BarChartActivityMultiDataset;
import github.thakkarnetram.mpchartlibrary.BarChartActivitySinus;
import github.thakkarnetram.mpchartlibrary.BarChartPositiveNegative;
import github.thakkarnetram.mpchartlibrary.BubbleChartActivity;
import github.thakkarnetram.mpchartlibrary.CandleStickChartActivity;
import github.thakkarnetram.mpchartlibrary.CombinedChartActivity;
import github.thakkarnetram.mpchartlibrary.CubicLineChartActivity;
import github.thakkarnetram.mpchartlibrary.DynamicalAddingActivity;
import github.thakkarnetram.mpchartlibrary.FilledLineActivity;
import github.thakkarnetram.mpchartlibrary.HalfPieChartActivity;
import github.thakkarnetram.mpchartlibrary.HorizontalBarChartActivity;
import github.thakkarnetram.mpchartlibrary.HorizontalBarNegativeChartActivity;
import github.thakkarnetram.mpchartlibrary.InvertedLineChartActivity;
import github.thakkarnetram.mpchartlibrary.LineChartActivity1;
import github.thakkarnetram.mpchartlibrary.LineChartActivity2;
import github.thakkarnetram.mpchartlibrary.LineChartActivityColored;
import github.thakkarnetram.mpchartlibrary.LineChartTime;
import github.thakkarnetram.mpchartlibrary.ListViewBarChartActivity;
import github.thakkarnetram.mpchartlibrary.ListViewMultiChartActivity;
import github.thakkarnetram.mpchartlibrary.MultiLineChartActivity;
import github.thakkarnetram.mpchartlibrary.PerformanceLineChart;
import github.thakkarnetram.mpchartlibrary.PieChartActivity;
import github.thakkarnetram.mpchartlibrary.PiePolylineChartActivity;
import github.thakkarnetram.mpchartlibrary.R;
import github.thakkarnetram.mpchartlibrary.RadarChartActivity;
import github.thakkarnetram.mpchartlibrary.RealtimeLineChartActivity;
import github.thakkarnetram.mpchartlibrary.ScatterChartActivity;
import github.thakkarnetram.mpchartlibrary.ScrollViewActivity;
import github.thakkarnetram.mpchartlibrary.StackedBarActivity;
import github.thakkarnetram.mpchartlibrary.StackedBarActivityNegative;
import github.thakkarnetram.mpchartlibrary.fragments.SimpleChartDemo;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        setTitle("MPAndroidChart Example");

        // initialize the utilities
        Utils.init(this);

        ArrayList<ContentItem> objects = new ArrayList<>();

        ////
        objects.add(0, new ContentItem("Line Charts"));

        objects.add(1, new ContentItem("Basic", "Simple line chart."));
        objects.add(2, new ContentItem("Multiple", "Show multiple data sets."));
        objects.add(3, new ContentItem("Dual Axis", "Line chart with dual y-axes."));
        objects.add(4, new ContentItem("Inverted Axis", "Inverted y-axis."));
        objects.add(5, new ContentItem("Cubic", "Line chart with a cubic line shape."));
        objects.add(6, new ContentItem("Colorful", "Colorful line chart."));
        objects.add(7, new ContentItem("Performance", "Render 30.000 data points smoothly."));
        objects.add(8, new ContentItem("Filled", "Colored area between two lines."));

        ////
        objects.add(9, new ContentItem("Bar Charts"));

        objects.add(10, new ContentItem("Basic", "Simple bar chart."));
        objects.add(11, new ContentItem("Basic 2", "Variation of the simple bar chart."));
        objects.add(12, new ContentItem("Multiple", "Show multiple data sets."));
        objects.add(13, new ContentItem("Horizontal", "Render bar chart horizontally."));
        objects.add(14, new ContentItem("Stacked", "Stacked bar chart."));
        objects.add(15, new ContentItem("Negative", "Positive and negative values with unique colors."));
        objects.add(16, new ContentItem("Negative Horizontal", "demonstrates how to create a HorizontalBarChart with positive and negative values."));
        objects.add(17, new ContentItem("Stacked 2", "Stacked bar chart with negative values."));
        objects.add(18, new ContentItem("Sine", "Sine function in bar chart format."));

        ////
        objects.add(19, new ContentItem("Pie Charts"));

        objects.add(20, new ContentItem("Basic", "Simple pie chart."));
        objects.add(21, new ContentItem("Value Lines", "Stylish lines drawn outward from slices."));
        objects.add(22, new ContentItem("Half Pie", "180° (half) pie chart."));

        ////
        objects.add(23, new ContentItem("Other Charts"));

        objects.add(24, new ContentItem("Combined Chart", "Bar and line chart together."));
        objects.add(25, new ContentItem("Scatter Plot", "Simple scatter plot."));
        objects.add(26, new ContentItem("Bubble Chart", "Simple bubble chart."));
        objects.add(27, new ContentItem("Candlestick", "Simple financial chart."));
        objects.add(28, new ContentItem("Radar Chart", "Simple web chart."));

        ////
        objects.add(29, new ContentItem("Scrolling Charts"));

        objects.add(30, new ContentItem("Multiple", "Various types of charts as fragments."));
        objects.add(31, new ContentItem("View Pager", "Swipe through different charts."));
        objects.add(32, new ContentItem("Tall Bar Chart", "Bars bigger than your screen!"));
        objects.add(33, new ContentItem("Many Bar Charts", "More bars than your screen can handle!"));

        ////
        objects.add(34, new ContentItem("Even More Line Charts"));

        objects.add(35, new ContentItem("Dynamic", "Build a line chart by adding points and sets."));
        objects.add(36, new ContentItem("Realtime", "Add data points in realtime."));
        objects.add(37, new ContentItem("Hourly", "Uses the current time to add a data point for each hour."));
        //objects.add(38, new ContentItem("Realm.io Examples", "See more examples that use Realm.io mobile database."));

        MyAdapter adapter = new MyAdapter(this, objects);

        ListView lv = findViewById(R.id.listView1);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> av, View v, int pos, long arg3) {

        Intent i = null;

        switch (pos) {
            case 1:
                i = new Intent(this, LineChartActivity1.class);
                break;
            case 2:
                i = new Intent(this, MultiLineChartActivity.class);
                break;
            case 3:
                i = new Intent(this, LineChartActivity2.class);
                break;
            case 4:
                i = new Intent(this, InvertedLineChartActivity.class);
                break;
            case 5:
                i = new Intent(this, CubicLineChartActivity.class);
                break;
            case 6:
                i = new Intent(this, LineChartActivityColored.class);
                break;
            case 7:
                i = new Intent(this, PerformanceLineChart.class);
                break;
            case 8:
                i = new Intent(this, FilledLineActivity.class);
                break;
            case 10:
                i = new Intent(this, BarChartActivity.class);
                break;
            case 11:
                i = new Intent(this, AnotherBarActivity.class);
                break;
            case 12:
                i = new Intent(this, BarChartActivityMultiDataset.class);
                break;
            case 13:
                i = new Intent(this, HorizontalBarChartActivity.class);
                break;
            case 14:
                i = new Intent(this, StackedBarActivity.class);
                break;
            case 15:
                i = new Intent(this, BarChartPositiveNegative.class);
                break;
            case 16:
                i = new Intent(this, HorizontalBarNegativeChartActivity.class);
                break;
            case 17:
                i = new Intent(this, StackedBarActivityNegative.class);
                break;
            case 18:
                i = new Intent(this, BarChartActivitySinus.class);
                break;
            case 20:
                i = new Intent(this, PieChartActivity.class);
                break;
            case 21:
                i = new Intent(this, PiePolylineChartActivity.class);
                break;
            case 22:
                i = new Intent(this, HalfPieChartActivity.class);
                break;
            case 24:
                i = new Intent(this, CombinedChartActivity.class);
                break;
            case 25:
                i = new Intent(this, ScatterChartActivity.class);
                break;
            case 26:
                i = new Intent(this, BubbleChartActivity.class);
                break;
            case 27:
                i = new Intent(this, CandleStickChartActivity.class);
                break;
            case 28:
                i = new Intent(this, RadarChartActivity.class);
                break;
            case 30:
                i = new Intent(this, ListViewMultiChartActivity.class);
                break;
            case 31:
                i = new Intent(this, SimpleChartDemo.class);
                break;
            case 32:
                i = new Intent(this, ScrollViewActivity.class);
                break;
            case 33:
                i = new Intent(this, ListViewBarChartActivity.class);
                break;
            case 35:
                i = new Intent(this, DynamicalAddingActivity.class);
                break;
            case 36:
                i = new Intent(this, RealtimeLineChartActivity.class);
                break;
            case 37:
                i = new Intent(this, LineChartTime.class);
                break;
            /*case 38:
                i = new Intent(this, RealmMainActivity.class);
                break;*/
        }

        if (i != null) startActivity(i);

        overridePendingTransition(R.anim.move_right_in_activity, R.anim.move_left_out_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent i;

        switch (item.getItemId()) {
            case R.id.viewGithub:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/PhilJay/MPAndroidChart"));
                startActivity(i);
                break;
            case R.id.report:
                i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "philjay.librarysup@gmail.com", null));
                i.putExtra(Intent.EXTRA_SUBJECT, "MPAndroidChart Issue");
                i.putExtra(Intent.EXTRA_TEXT, "Your error report here...");
                startActivity(Intent.createChooser(i, "Report Problem"));
                break;
            case R.id.website:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://at.linkedin.com/in/philippjahoda"));
                startActivity(i);
                break;
        }

        return true;
    }
}
