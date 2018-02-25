package solution.b_still.co.b_still;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

import static com.jjoe64.graphview.GridLabelRenderer.GridStyle.HORIZONTAL;

public class Graph extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        GraphView graph = (GraphView) findViewById(R.id.graph);

        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graph);
        staticLabelsFormatter.setHorizontalLabels(new String[]{"Oct", "Nov", "Dec", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"});
        staticLabelsFormatter.setVerticalLabels(new String[]{"20%", "40%", "60%", "80%", "100%"});
        graph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 2),
                new DataPoint(1, 1),
                new DataPoint(2, 3),
                new DataPoint(3, 4),
                new DataPoint(4, 3),
                new DataPoint(5, 2),
                new DataPoint(6, 4),
                new DataPoint(7, 5),
                new DataPoint(8, 6),
                new DataPoint(9, 4),
                new DataPoint(10, 7)
        });
/*        graph.setTitle("Historical data");
        graph.setTitleTextSize(56);*/
        graph.setPadding(16, 16, 16, 16);
        graph.getGridLabelRenderer().setNumHorizontalLabels(5);
        graph.getGridLabelRenderer().setGridStyle(HORIZONTAL);
        graph.getGridLabelRenderer().setVerticalAxisTitle("% Stress");
        graph.getGridLabelRenderer().setHorizontalAxisTitle("Time");
/*        graph.getViewport().setScalable(true);*/
        graph.addSeries(series);


    }

}
