import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class nFrame extends JFrame {

    BorderLayout borderLayout1;
    OwnListModel ownListModel;

    JList jList;


    public nFrame(){

        super(LocalDate.now().getMonthValue()+"."+LocalDate.now().getYear());
        addComponentsToPane();



        setPreferredSize(new Dimension(250, 350));


        setResizable(false);

    }

    private void addComponentsToPane() {
        ownListModel = new OwnListModel();

        borderLayout1 = new BorderLayout();

        getContentPane().setLayout(borderLayout1);

        jList = new JList(ownListModel);
        jList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jList.setFont(new Font(Font.DIALOG, Font.BOLD,  15));

       add(new JScrollPane(jList), BorderLayout.CENTER);

    }


}
