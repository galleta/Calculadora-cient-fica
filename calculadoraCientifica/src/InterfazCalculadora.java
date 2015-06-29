
import javax.swing.JOptionPane;
import logicaCalculadora.Calculadora;
import logicaCalculadora.Pair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francis
 */
public class InterfazCalculadora extends javax.swing.JFrame 
{
    private final Calculadora cal;
    private boolean mostrartraza;
    
    /**
     * Creates new form InterfazCalculadora
     */
    public InterfazCalculadora() 
    {
        initComponents();
        cal = new Calculadora();
        mostrartraza = Boolean.FALSE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pResultados = new javax.swing.JPanel();
        pOperacion = new javax.swing.JPanel();
        tOperacion = new javax.swing.JTextField();
        pResultadoOPeracion = new javax.swing.JPanel();
        tResultado = new javax.swing.JTextField();
        pBotones = new javax.swing.JPanel();
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
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        menuAplicacion = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuTraza = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora científica");
        setResizable(false);

        pResultados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pResultados.setLayout(new java.awt.BorderLayout());

        pOperacion.setLayout(new java.awt.BorderLayout());

        tOperacion.setEditable(false);
        pOperacion.add(tOperacion, java.awt.BorderLayout.CENTER);

        pResultados.add(pOperacion, java.awt.BorderLayout.NORTH);

        pResultadoOPeracion.setLayout(new java.awt.BorderLayout());

        tResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tResultado.setText("0");
        pResultadoOPeracion.add(tResultado, java.awt.BorderLayout.CENTER);

        pResultados.add(pResultadoOPeracion, java.awt.BorderLayout.CENTER);

        getContentPane().add(pResultados, java.awt.BorderLayout.NORTH);

        pBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("AC");
        jButton1.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton1.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton1.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pBotones.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jButton2.setText("/");
        jButton2.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton2.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton2.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pBotones.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jButton3.setText("*");
        jButton3.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton3.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton3.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pBotones.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jButton4.setText("-");
        jButton4.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton4.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton4.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pBotones.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jButton5.setText("+");
        jButton5.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton5.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton5.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pBotones.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jButton6.setText("%");
        jButton6.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton6.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton6.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pBotones.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jButton7.setText("9");
        jButton7.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton7.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton7.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pBotones.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jButton8.setText("6");
        jButton8.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton8.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton8.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pBotones.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jButton9.setText("3");
        jButton9.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton9.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton9.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pBotones.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jButton10.setText("=");
        jButton10.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton10.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton10.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        pBotones.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jButton11.setText("(");
        jButton11.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton11.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton11.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        pBotones.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jButton12.setText(")");
        jButton12.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton12.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton12.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        pBotones.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jButton13.setText("7");
        jButton13.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton13.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton13.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        pBotones.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jButton14.setText("8");
        jButton14.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton14.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton14.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        pBotones.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jButton15.setText("4");
        jButton15.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton15.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton15.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        pBotones.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jButton16.setText("5");
        jButton16.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton16.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton16.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        pBotones.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jButton17.setText("1");
        jButton17.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton17.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton17.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        pBotones.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jButton18.setText("2");
        jButton18.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton18.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton18.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        pBotones.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jButton19.setText("0");
        jButton19.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton19.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton19.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        pBotones.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jButton20.setText(".");
        jButton20.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton20.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton20.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        pBotones.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jButton22.setText("x!");
        jButton22.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton22.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton22.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        pBotones.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jButton23.setText("sin");
        jButton23.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton23.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton23.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        pBotones.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jButton24.setText("Ln");
        jButton24.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton24.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton24.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        pBotones.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jButton25.setText("cos");
        jButton25.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton25.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton25.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        pBotones.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jButton26.setText("log");
        jButton26.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton26.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton26.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        pBotones.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jButton27.setText("tan");
        jButton27.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton27.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton27.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        pBotones.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jButton28.setText("√");
        jButton28.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton28.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton28.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        pBotones.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jButton29.setText("EXP");
        jButton29.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton29.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton29.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        pBotones.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jButton30.setText("x^y");
        jButton30.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton30.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton30.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        pBotones.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jButton31.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton31.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton31.setPreferredSize(new java.awt.Dimension(55, 55));
        pBotones.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jButton32.setText("π");
        jButton32.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton32.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton32.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        pBotones.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jButton33.setText("e");
        jButton33.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton33.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton33.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        pBotones.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jButton34.setText("ANS");
        jButton34.setMaximumSize(new java.awt.Dimension(55, 55));
        jButton34.setMinimumSize(new java.awt.Dimension(55, 55));
        jButton34.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        pBotones.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        getContentPane().add(pBotones, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Aplicación");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuTraza.setText("Mostrar traza");
        jMenuTraza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTrazaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuTraza);

        menuAplicacion.add(jMenu1);

        jMenu2.setText("Sobre");

        jMenuItem1.setText("Información");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        menuAplicacion.add(jMenu2);

        setJMenuBar(menuAplicacion);

        pack();
    }// </editor-fold>                        

    private void jMenuTrazaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        mostrartraza = !mostrartraza;
    }                                          

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        tResultado.setText(tResultado.getText() + "2");
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( !tResultado.getText().equals("0") || tResultado.getText().equals("0.0") && !tResultado.getText().equals("") )
            tResultado.setText(tResultado.getText() + "0");
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "1");
    }                                         

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "3");
    }                                        

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "4");
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "5");
    }                                         

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "6");
    }                                        

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "7");
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "8");
    }                                         

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "9");
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // ans = tResultado.getText();
        tOperacion.setText("");
        tResultado.setText("0");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        if( !tResultado.getText().equals("") )
        {
            String nuevo = tResultado.getText();
            nuevo += "/";
            tResultado.setText(nuevo);
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if( !tResultado.getText().equals("") )
        {
            String nuevo = tResultado.getText();
            nuevo += "*";
            tResultado.setText(nuevo);
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        if( !tResultado.getText().equals("") )
        {
            String nuevo = tResultado.getText();
            nuevo += "-";
            tResultado.setText(nuevo);
        }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if( !tResultado.getText().equals("") )
        {
            String nuevo = tResultado.getText();
            nuevo += "+";
            tResultado.setText(nuevo);
        }
    }                                        

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "pi");
    }                                         

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "e");
    }                                         

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if( !tResultado.getText().equals("") )
        {
            String nuevo = tResultado.getText();
            nuevo += "%";
            tResultado.setText(nuevo);
        }
    }                                        

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( !tResultado.getText().equals("") )
        {
            String nuevo = tResultado.getText();
            nuevo += "^";
            tResultado.setText(nuevo);
        }
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "(");
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + ")");
    }                                         

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "seno(");
    }                                         

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "coseno(");
    }                                         

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "tangente(");
    }                                         

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "factorial(");
    }                                         

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "LN(");
    }                                         

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "log10(");
    }                                         

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if( tResultado.getText().equals("0") || tResultado.getText().equals("0.0") )
            tResultado.setText("");
        tResultado.setText(tResultado.getText() + "sqrt(");
    }                                         

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        tOperacion.setText(tResultado.getText() + " = ");
        Pair<String, String> resultado = cal.resolverValorExpresion(tResultado.getText());
        tResultado.setText(resultado.getFirst());
        
        if( mostrartraza )
        {
            VentanaTraza vtraza = new VentanaTraza(resultado.getSecond());
            vtraza.setSize(500,500);
            vtraza.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vtraza.setResizable(false);
            vtraza.setVisible(true); 
        }
    }                                         

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JOptionPane.showMessageDialog(this,
            "<html>Autor: <b>Francisco Jesús Delgado Almirón</b></html>\n" +
            "<html>Año: <i>2014</i></html>\n" +
            "<html>Calculadora científica v1.0 (versión beta)</html>\n" +
            "<html><b>Licencia GPL v2</b></html>\n",
            "Acerca de 'Calculadora científica'",
            JOptionPane.INFORMATION_MESSAGE);
    }                                          

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        tResultado.setText(tResultado.getText() + ".");
    }                                         

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

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
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
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
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JCheckBoxMenuItem jMenuTraza;
    private javax.swing.JMenuBar menuAplicacion;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pOperacion;
    private javax.swing.JPanel pResultadoOPeracion;
    private javax.swing.JPanel pResultados;
    private javax.swing.JTextField tOperacion;
    private javax.swing.JTextField tResultado;
    // End of variables declaration                   
}
