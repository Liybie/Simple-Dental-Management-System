/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DentassistMain;

import com.mindfusion.common.DateTime;
import com.mindfusion.scheduling.*;
import java.awt.BorderLayout;
import java.time.LocalDate;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.SwingUtilities;


/**
 *
 * @author golem
 */
public class Schedule extends JFrame {

    private static Calendar calendar; // static to keep data while program runs Angas noh
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Schedule window = new Schedule();
                window.setVisible(true);
            }
        });
    }

    protected Schedule() {
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(1000, 500);
    setTitle("Dr. Cherry S. Torres-Pagayatan DMD");
    setLocationRelativeTo(null);
    
    if (calendar == null) {
        calendar = new Calendar();
        calendar.beginInit();
        calendar.setTheme(ThemeType.Light);
        calendar.setCurrentView(CalendarView.SingleMonth);
        calendar.getMonthSettings().getDaySettings().setShowToday(true);

        // Makes the CALENDAY DYNAMIK AWESOMe
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int lastDay = now.lengthOfMonth();

        calendar.setDate(new DateTime(year, month, 1));
        calendar.setEndDate(new DateTime(year, month, lastDay));

        calendar.setEnableDragCreate(true);
        calendar.endInit();
    }

    getContentPane().removeAll();
    getContentPane().add(calendar, BorderLayout.CENTER);
    getContentPane().revalidate();
    getContentPane().repaint();
}
}