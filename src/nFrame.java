import javax.swing.*;
import java.awt.*;

public class nFrame extends JFrame {

    BorderLayout borderLayout1 = new BorderLayout();


    public nFrame(){

        this.getContentPane().setLayout(borderLayout1);
        this.setSize(new Dimension(400, 300));
        OwnListModel ownListModel = new OwnListModel();
        this.setTitle(ownListModel.getTitleDate());
        JList list1 = new JList(ownListModel);

//        list1.setModel(ownListModel);
//        list1.repaint();

        setResizable(false);
        this.getContentPane().add(new JScrollPane(list1), BorderLayout.CENTER);
    }
}
