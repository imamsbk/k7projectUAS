package projectuas;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;

public class chart {
	 public static void main(String[] args) throws UnsupportedLookAndFeelException {
		DefaultPieDataset data=new DefaultPieDataset();
		
		data.setValue("20 thn",100);
		data.setValue("40 thn",50);
		data.setValue("10 thn",10);
		
		JFreeChart chart=ChartFactory.createPieChart("DKI JAKARTA",data,true,true,false);
		ChartFrame frame=new ChartFrame("",chart);

		frame.setSize(450,300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
}