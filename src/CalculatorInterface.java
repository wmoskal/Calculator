import javax.swing.*;
import java.awt.*;

public class CalculatorInterface
{
    private static final int width = 600;
    private static final int height = 800;
    private JFrame master;
    public CalculatorInterface()
    {
        initialize();
    }

    public void initialize()
    {
        master = new JFrame("Calculator Pro");
        master.setSize(width, height);

        JPanel origin = new JPanel(new GridLayout(8,1));
        master.add(origin);

        JTextField screenArea = new JTextField("0");
        screenArea.setHorizontalAlignment(SwingConstants.RIGHT);
        screenArea.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 70));
        screenArea.setEditable(false);
        screenArea.setSize(500, 100);
        origin.add(screenArea);





        master.setVisible(true);
    }

}
