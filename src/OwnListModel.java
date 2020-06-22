import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;

import static java.util.Calendar.DAY_OF_MONTH;

public class OwnListModel extends AbstractListModel {

    ArrayList<String> rowsList = new ArrayList<>();

    Calendar calendar = Calendar.getInstance();

    private int year;
    private int month;
    private int day;

    public OwnListModel() {
        this.year = Calendar.YEAR;
        this.month = Calendar.MONTH;
        this.day = DAY_OF_MONTH;
        addDayToList();
    }

    private void addDayToList() {
        for (int i = 0; i <= calendar.getActualMaximum(DAY_OF_MONTH); i++){
            rowsList.add(i+" "+"-"+" "+"to bedzie dzien");
        }
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Object getElementAt( int index ) {
        return null;
    }

    public String getTitleDate() {
        return (calendar.get(Calendar.MONTH)+"."+calendar.get(Calendar.YEAR));
    }
}
