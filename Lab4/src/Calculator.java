public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        allClear();
        updateDisplay();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        quit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setEditable(false);
        display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setMargin(new java.awt.Insets(15, 15, 15, 15));
        getContentPane().add(display, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setText("5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setText("6");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setText("7");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setText("8");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton11.setText("9");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton12.setText("x");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton13.setText(".");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton14.setText("0");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton15.setText("±");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton16.setText("÷");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton16);

        jButton17.setText("√");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton17);

        jButton18.setText("C");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton18);

        jButton19.setText("AC");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton19);

        jButton20.setText("=");
        jButton20.setToolTipText("");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonPressed(evt);
            }
        });
        jPanel1.add(jButton20);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        jMenu1.add(quit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu2.add(about);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "Jack Mahedy, 2022, This was made by Jack Mahedy");
    }//GEN-LAST:event_aboutActionPerformed

    private void calculatorButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorButtonPressed
        onButtonPressed((javax.swing.JButton)evt.getSource());
    }//GEN-LAST:event_calculatorButtonPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JTextField display;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem quit;
    // End of variables declaration//GEN-END:variables

    private double result ;
    private char operation ;
    private boolean error ;
    private int displayLen ;
    private String disp ;
    public static final int MAX_DISPLAY_LEN = 10;
    public static final double MAX_VALUE_EXCLUSIVE = 10000000000.0;
    private void allClear (){
        result = 0.0;
        operation = '+';
        error = false ;
        displayLen = 0;
        disp = " " ;
    }
    
    private String toDisplayString ( double d ){
        String asStr = String . format ( "%." + ( MAX_DISPLAY_LEN ) + "f" , d);
        int maxLen = MAX_DISPLAY_LEN ;
        
        if( asStr . charAt (0) == '-'){
            maxLen += 1;
        }
        asStr = asStr . substring (0 , maxLen );
        return asStr ;
    }
    
    private void updateDisplay (){
        if ( error ){
            display . setText ( " Err " ) ;
        }
        else if( displayLen > 0){
            display . setText ( disp ) ;
        }
        else{
            display . setText ( toDisplayString ( result ) ) ;
        }
    }
    
    private void exec ( double immediateValue ){
        System . out . println ( result ) ;
        System . out . println ( operation ) ;
        System . out . println ( immediateValue ) ;
        switch ( operation ){
            case '=':
                result = immediateValue ;
                break ;
            case '+':
                result += immediateValue ;
                break ;
            case '-':
                result -= immediateValue ;
                break ;
            case 'x':
                result *= immediateValue ;
                break ;
            case '÷':
                result /= immediateValue ;
                break ;
            case ' ':
                if ( immediateValue == 0){
                    error = true ;
                }
                else{
                    result /= immediateValue ;
                }
                break ;
        }
        System . out . println ( " := > " + result ) ;
        double check = Math . abs ( result ) ;
        if ( check >= MAX_VALUE_EXCLUSIVE ){
            error = true ;
        }
        
        displayLen = 0;
        disp = " " ;
    }
    
    private void handlePress ( char code ){
        if ( code == 'A'){
            allClear () ;
            return ;
        }
        if( error ){
            return ;
        }
    
        if( code == 'C'){
            disp = " " ;
            displayLen = 0;
        }
    
        else if( code >= '0' && code <= '9' || code == '.' ) {
            if( code == '.' && disp . indexOf ('.') != -1){
            // Just ignore the button press ; can 't have more than one '.'
            // This is sometimes called " eating " user input .
            }
            else if ( displayLen < MAX_DISPLAY_LEN + ( code == '.' ? 1 : 0) ){
                // special case - if disp is "0" , just overwrite it.
                if ( " 0 " . equals ( disp ) && code != '.'){
                    disp = " " + code ;
                }
                else{
                    disp += code ;
                    displayLen += 1;
                }
            }
        }
        else if ( code == 'r' || code == '±'){
            double value = displayLen == 0 ? result : Double . valueOf ( disp ) ;
            final double intermediate ;
            if( code == 'r'){
                if( value < 0){
                    error = true ;
                    return ;
                }
                intermediate = Math . sqrt ( value ) ;
            }
            else{
                intermediate = - value ;
            }
            disp = toDisplayString ( intermediate ) ;
            displayLen = disp . length () ;
        }
        else{
            double value = displayLen == 0 ? result : Double . valueOf ( disp ) ;
            exec ( value ) ;
            operation = code ;
        }
    }
        
    private void onButtonPressed ( javax . swing . JButton which ){
        // Step 1 - Turn `which ` into a letter
        String buttonText = which . getText () ;
        final char letter ;
        if( " < html >& radic ; </ html > " . equals ( buttonText ) || "√" . equals ( buttonText ) ){
            letter = 'r';
        }
        else{
            letter = buttonText . charAt (0) ;
        }
        
        // Step 2 - Apply the effect of that button ( see the " Background "
        // section in the handout ).
        handlePress ( letter ) ;
        
        // Step 3 - change what 's shown in the `display ` JTextField .
        updateDisplay () ;
    }
}