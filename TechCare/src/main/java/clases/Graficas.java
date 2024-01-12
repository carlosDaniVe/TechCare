package clases;

import java.awt.Color;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Graficas {

    public static JFreeChart graficarBarras(List<Integer> datos,
            List<String> nombres, String titulo) {

        DefaultCategoryDataset datosGraficos = new DefaultCategoryDataset();

        for (int i = 0; i < datos.size(); i++) {
            datosGraficos.setValue(datos.get(i),
                    nombres.get(i), nombres.get(i));
        }
        JFreeChart grafico = ChartFactory.createBarChart(
                titulo,
                "Valores",
                "Cantidades",
                datosGraficos);

        BarRenderer renderer = (BarRenderer) grafico.getCategoryPlot()
                .getRenderer();

        renderer.setShadowVisible(false);
        renderer.setBarPainter(new StandardBarPainter());
        renderer.setItemMargin(0.0);
        renderer.setMaximumBarWidth(1.0);

        grafico.getPlot().setBackgroundPaint(Color.WHITE);
        grafico.getCategoryPlot().setRangeGridlinePaint(new Color(150, 150, 150));
        grafico.getCategoryPlot().setDomainGridlinePaint(new Color(150, 150, 150));

        NumberAxis rangeAxis = (NumberAxis) grafico.getCategoryPlot().getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        return grafico;
    }

    public static JFreeChart graficaCircular(List<Integer> datos, List<String> nombres) {
        DefaultPieDataset dato = new DefaultPieDataset();

        for (int i = 0; i < datos.size(); i++) {
            dato.setValue(nombres.get(i), datos.get(i));
        }

        JFreeChart grafico = ChartFactory.createPieChart("Grafica de Tipos",
                dato, true, true, false);
        grafico.getPlot().setBackgroundPaint(Color.WHITE);

        PiePlot plot = (PiePlot) grafico.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} = {1} ({2})"));

        return grafico;

       
    }
}
