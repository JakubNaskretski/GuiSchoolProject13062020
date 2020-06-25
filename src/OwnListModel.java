import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;

import static java.util.Calendar.DAY_OF_MONTH;

public class OwnListModel implements ListModel {

    private ArrayList<String> currentMonthDays;
    private YearMonth yearMonthObject;

    public OwnListModel() {
        currentMonthDays = new ArrayList();

        yearMonthObject = YearMonth.of(LocalDate.now().getYear(),LocalDate.now().getMonth());
        try {
        for (int i=1;i< yearMonthObject.lengthOfMonth()+1;i++){
            currentMonthDays.add(i +" - "+ new SimpleDateFormat("EEEE")
                    .format(new SimpleDateFormat("yyyy-M-d")
                            .parse(String.format("%d-%d-%d",
                                    LocalDate.now().getYear(),
                                    LocalDate.now().getMonthValue(), i))));
        }
            } catch (ParseException e){
            System.out.println("Couldn't make calendar");
        }
    }

    @Override
    public int getSize() {
        return currentMonthDays.size();
    }

    @Override
    public Object getElementAt(int index) {
        return currentMonthDays.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

    public void printAllElements() {
        for (int i=0; i<currentMonthDays.size();i++){
                    System.out.println(currentMonthDays.get(i));
        }
    }

}