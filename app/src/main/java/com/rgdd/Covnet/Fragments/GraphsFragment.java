package com.rgdd.Covnet.Fragments;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;
import com.rgdd.Covnet.R;

public class GraphsFragment extends Fragment {
    LineGraphSeries<DataPoint> series;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_graphs, container, false);

        GraphView graph1 = view.findViewById(R.id.graph1);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 3),
                new DataPoint(1, 3),
                new DataPoint(2, 3),
                new DataPoint(3, 3),
                new DataPoint(4, 2),
                new DataPoint(5, 2),
                new DataPoint(6, 3),
                new DataPoint(7, 3),
                new DataPoint(8, 3),
                new DataPoint(9, 3),
                new DataPoint(10, 3),
                new DataPoint(11, 3),
                new DataPoint(12,3),
                new DataPoint(13, 2),
                new DataPoint(14, 2),
                new DataPoint(14, 2),
                new DataPoint(16, 2),
                new DataPoint(17, 2),
                new DataPoint(18, 2),
                new DataPoint(19, 4),
                new DataPoint(20, 4),
                new DataPoint(21, 4),
                new DataPoint(22, 4),
                new DataPoint(23, 4),
                new DataPoint(24, 5),
                new DataPoint(25, 4),
                new DataPoint(26, 3),
                new DataPoint(27, 2),
                new DataPoint(28, 2),
        });
        graph1.addSeries(series);
        graph1.getViewport().setScalableY(true);
        series.setThickness(10);
        series.setColor(Color.rgb(49, 34, 83));
        series.setAnimated(true);
        series.setDrawDataPoints(true);
        series.setDataPointsRadius(8);
        series.setBackgroundColor(Color.argb(80, 49, 34, 83));
        series.setDrawBackground(true);


        GraphView graph2 = view.findViewById(R.id.graph2);
        BarGraphSeries<DataPoint> series2 = new BarGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0),
                new DataPoint(1, 2),
                new DataPoint(2, 7),
                new DataPoint(3, 3),
                new DataPoint(4, 6),
                new DataPoint(5, 1),
                new DataPoint(6,0)
        });
        graph2.addSeries(series2);

// styling
        series2.setColor(Color.rgb(49, 34, 83));
        series2.setSpacing(1);
        graph2.getGridLabelRenderer().setGridStyle(GridLabelRenderer.GridStyle.HORIZONTAL);
        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graph2);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"", "ABZ", "GLA", "EDI", "DND", "INV",""});
        graph2.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

// draw values on top

        series2.setValuesOnTopSize(50);
        series2.setAnimated(true);
        series2.setDataWidth(0.1);
        series2.setDrawValuesOnTop(true);
        series2.setValuesOnTopColor(Color.DKGRAY);
        graph1.addSeries(series);
        graph2.addSeries(series2);

        return view;

    }
}
