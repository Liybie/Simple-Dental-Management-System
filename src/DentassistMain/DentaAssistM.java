
package DentassistMain;

public class DentaAssistM {


    public static void main(String[] args) {
        
    SplashScreen splash = new SplashScreen();
    splash.setVisible(true);
    try {
        Thread.sleep(3000); 
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
     splash.dispose();

        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        
    }
    
    
}
