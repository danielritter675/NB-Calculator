/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package daniel.ritter.calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;

/**
 *
 * @author danie
 */
public class Calculator extends javax.swing.JFrame implements KeyListener {

    /**
     * Creates new form Calculator
     */
    public Calculator() {

        initComponents();
        addKeyListener(this);
        setFocusable(true);
        setLocationRelativeTo(null);
        customizeUI();

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_0:
            case KeyEvent.VK_NUMPAD0:
                calcButton0.doClick();
                break;
            case KeyEvent.VK_1:
            case KeyEvent.VK_NUMPAD1:
                calcButton1.doClick();
                break;
            case KeyEvent.VK_2:
            case KeyEvent.VK_NUMPAD2:
                calcButton2.doClick();
                break;
            case KeyEvent.VK_3:
            case KeyEvent.VK_NUMPAD3:
                calcButton3.doClick();
                break;
            case KeyEvent.VK_4:
            case KeyEvent.VK_NUMPAD4:
                calcButton4.doClick();
                break;
            case KeyEvent.VK_5:
            case KeyEvent.VK_NUMPAD5:
                calcButton5.doClick();
                break;
            case KeyEvent.VK_6:
            case KeyEvent.VK_NUMPAD6:
                calcButton6.doClick();
                break;
            case KeyEvent.VK_7:
            case KeyEvent.VK_NUMPAD7:
                calcButton7.doClick();
                break;
            case KeyEvent.VK_8:
            case KeyEvent.VK_NUMPAD8:
                calcButton8.doClick();
                break;
            case KeyEvent.VK_9:
            case KeyEvent.VK_NUMPAD9:
                calcButton9.doClick();
                break;
            case KeyEvent.VK_ADD:
            case KeyEvent.VK_PLUS:
                if (!isLastCharacterOperator()) {
                    calcButtonAdd.doClick();
                }
                break;
            case KeyEvent.VK_SUBTRACT:
            case KeyEvent.VK_MINUS:
                if (!isLastCharacterOperator()) {
                    calcButtonSubtract.doClick();
                }
                break;
            case KeyEvent.VK_MULTIPLY:
            case KeyEvent.VK_ASTERISK:
                if (!isLastCharacterOperator()) {
                    calcButtonMultiply.doClick();
                }
                break;
            case KeyEvent.VK_DIVIDE:
            case KeyEvent.VK_SLASH:
                if (!isLastCharacterOperator()) {
                    calcButtonDivide.doClick();
                }
                break;
            case KeyEvent.VK_EQUALS:
            case KeyEvent.VK_ENTER:
                calcButtonEquals.doClick();
                break;
            case KeyEvent.VK_PERIOD:
            case KeyEvent.VK_DECIMAL:
            case KeyEvent.VK_COMMA:
                calcButtonComma.doClick();
                break;
            case KeyEvent.VK_BACK_SPACE:
                calcButtonClear.doClick();
                break;
            case KeyEvent.VK_ESCAPE:
                calcButtonAllClear.doClick();
                break;
            default:
                // Check for the '%' character
                if (e.getKeyChar() == '%') {
                    if (!isLastCharacterOperator()) {
                        calcButtonPercentage.doClick();
                    }
                }
                break;
        }
    }

    private void customizeUI() {
        getContentPane().setBackground(new java.awt.Color(59, 65, 76)); // Hauptfenster Hintergrundfarbe

        // Hintergrundfarbe der Buttons setzen
        setButtonColor(calcButtonAllClear, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButtonClear, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButtonPercentage, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButtonDivide, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButtonMultiply, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButtonSubtract, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButtonAdd, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButtonEquals, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButtonComma, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButtonNegate, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton0, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton1, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton2, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton3, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton4, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton5, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton6, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton7, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton8, new java.awt.Color(100, 100, 100));
        setButtonColor(calcButton9, new java.awt.Color(100, 100, 100));
    }

    private void setButtonColor(JButton button, Color color) {
        button.setBackground(color);
        button.setOpaque(true);
        button.setBorderPainted(false);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcTextFieldOutputEquation = new javax.swing.JTextField();
        calcTextFieldOutputResult = new javax.swing.JTextField();
        calcButtonAllClear = new javax.swing.JButton();
        calcButtonClear = new javax.swing.JButton();
        calcButtonPercentage = new javax.swing.JButton();
        calcButtonDivide = new javax.swing.JButton();
        calcButtonMultiply = new javax.swing.JButton();
        calcButtonSubtract = new javax.swing.JButton();
        calcButtonAdd = new javax.swing.JButton();
        calcButtonEquals = new javax.swing.JButton();
        calcButtonComma = new javax.swing.JButton();
        calcButtonNegate = new javax.swing.JButton();
        calcButton0 = new javax.swing.JButton();
        calcButton1 = new javax.swing.JButton();
        calcButton2 = new javax.swing.JButton();
        calcButton3 = new javax.swing.JButton();
        calcButton4 = new javax.swing.JButton();
        calcButton5 = new javax.swing.JButton();
        calcButton6 = new javax.swing.JButton();
        calcButton7 = new javax.swing.JButton();
        calcButton8 = new javax.swing.JButton();
        calcButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(59, 65, 76));
        setResizable(false);

        calcTextFieldOutputEquation.setEditable(false);
        calcTextFieldOutputEquation.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcTextFieldOutputEquation.setToolTipText("");
        calcTextFieldOutputEquation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        calcTextFieldOutputEquation.setFocusable(false);
        calcTextFieldOutputEquation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTextFieldOutputEquationActionPerformed(evt);
            }
        });

        calcTextFieldOutputResult.setEditable(false);
        calcTextFieldOutputResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcTextFieldOutputResult.setFocusable(false);
        calcTextFieldOutputResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTextFieldOutputResultActionPerformed(evt);
            }
        });

        calcButtonAllClear.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonAllClear.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonAllClear.setText("AC");
        calcButtonAllClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonAllClearActionPerformed(evt);
            }
        });

        calcButtonClear.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonClear.setText("C");
        calcButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonClearActionPerformed(evt);
            }
        });

        calcButtonPercentage.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonPercentage.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonPercentage.setText("%");
        calcButtonPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonPercentageActionPerformed(evt);
            }
        });

        calcButtonDivide.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonDivide.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonDivide.setText("÷");
        calcButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonDivideActionPerformed(evt);
            }
        });

        calcButtonMultiply.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonMultiply.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonMultiply.setText("*");
        calcButtonMultiply.setToolTipText("");
        calcButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonMultiplyActionPerformed(evt);
            }
        });

        calcButtonSubtract.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonSubtract.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonSubtract.setText("-");
        calcButtonSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonSubtractActionPerformed(evt);
            }
        });

        calcButtonAdd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonAdd.setText("+");
        calcButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonAddActionPerformed(evt);
            }
        });

        calcButtonEquals.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonEquals.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonEquals.setText("=");
        calcButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonEqualsActionPerformed(evt);
            }
        });

        calcButtonComma.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonComma.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonComma.setText(",");
        calcButtonComma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonCommaActionPerformed(evt);
            }
        });

        calcButtonNegate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButtonNegate.setForeground(new java.awt.Color(255, 255, 255));
        calcButtonNegate.setText("±");
        calcButtonNegate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonNegateActionPerformed(evt);
            }
        });

        calcButton0.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton0.setForeground(new java.awt.Color(255, 255, 255));
        calcButton0.setText("0");
        calcButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton0ActionPerformed(evt);
            }
        });

        calcButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton1.setForeground(new java.awt.Color(255, 255, 255));
        calcButton1.setText("1");
        calcButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton1ActionPerformed(evt);
            }
        });

        calcButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton2.setForeground(new java.awt.Color(255, 255, 255));
        calcButton2.setText("2");
        calcButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton2ActionPerformed(evt);
            }
        });

        calcButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton3.setForeground(new java.awt.Color(255, 255, 255));
        calcButton3.setText("3");
        calcButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton3ActionPerformed(evt);
            }
        });

        calcButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton4.setForeground(new java.awt.Color(255, 255, 255));
        calcButton4.setText("4");
        calcButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton4ActionPerformed(evt);
            }
        });

        calcButton5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton5.setForeground(new java.awt.Color(255, 255, 255));
        calcButton5.setText("5");
        calcButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton5ActionPerformed(evt);
            }
        });

        calcButton6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton6.setForeground(new java.awt.Color(255, 255, 255));
        calcButton6.setText("6");
        calcButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton6ActionPerformed(evt);
            }
        });

        calcButton7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton7.setForeground(new java.awt.Color(255, 255, 255));
        calcButton7.setText("7");
        calcButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton7ActionPerformed(evt);
            }
        });

        calcButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton8.setForeground(new java.awt.Color(255, 255, 255));
        calcButton8.setText("8");
        calcButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton8ActionPerformed(evt);
            }
        });

        calcButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        calcButton9.setForeground(new java.awt.Color(255, 255, 255));
        calcButton9.setText("9");
        calcButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calcTextFieldOutputEquation)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calcButtonNegate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calcButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calcButtonComma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calcButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calcButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calcButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calcButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButtonSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calcButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calcButtonAllClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcButtonPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcButtonDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(calcTextFieldOutputResult))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(calcTextFieldOutputEquation, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcTextFieldOutputResult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calcButtonPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calcButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calcButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calcButtonAllClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calcButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calcButtonSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calcButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calcButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calcButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calcButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButtonComma, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calcButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcButtonNegate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String operator = "";
    private double result = 0;

    private void calcTextFieldOutputEquationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTextFieldOutputEquationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcTextFieldOutputEquationActionPerformed

    private void calcTextFieldOutputResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTextFieldOutputResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcTextFieldOutputResultActionPerformed

    private void calcButtonAllClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonAllClearActionPerformed
        calcTextFieldOutputEquation.setText("");
        calcTextFieldOutputResult.setText("");
    }//GEN-LAST:event_calcButtonAllClearActionPerformed

    private void calcButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonClearActionPerformed
        // Get text from OutputEquation TextField
        String currentText = calcTextFieldOutputEquation.getText();

        // Check if text !empty --> delete last character
        if (currentText.length() > 0) {
            String newText = currentText.substring(0, currentText.length() - 1);

            // Set new output text
            calcTextFieldOutputEquation.setText(newText);
        }
    }//GEN-LAST:event_calcButtonClearActionPerformed

    private void calcButtonPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonPercentageActionPerformed
        if (!isLastCharacterOperator()) {
            calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + " % ");
            operator = "%";
        }
    }//GEN-LAST:event_calcButtonPercentageActionPerformed

    private void calcButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonDivideActionPerformed
        if (!isLastCharacterOperator()) {
            calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + " / ");
            operator = "/";
        }
    }//GEN-LAST:event_calcButtonDivideActionPerformed

    private void calcButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonMultiplyActionPerformed
        if (!isLastCharacterOperator()) {
            calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + " * ");
            operator = "*";
        }
    }//GEN-LAST:event_calcButtonMultiplyActionPerformed

    private void calcButtonSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonSubtractActionPerformed
        if (!isLastCharacterOperator()) {
            calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + " - ");
            operator = "-";
        }
    }//GEN-LAST:event_calcButtonSubtractActionPerformed

    private void calcButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonAddActionPerformed
        if (!isLastCharacterOperator()) {
            calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + " + ");
            operator = "+";
        }
    }//GEN-LAST:event_calcButtonAddActionPerformed

    private void calcButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonEqualsActionPerformed
        try {
            String equation = calcTextFieldOutputEquation.getText().replace(',', '.');
            double result = evaluateExpression(equation);
            calcTextFieldOutputResult.setText(Double.toString(result).replace('.', ','));
        } catch (NumberFormatException e) {
            calcTextFieldOutputResult.setText("Error: Ungültiges Format!");
        }
    }//GEN-LAST:event_calcButtonEqualsActionPerformed

    private void calcButtonCommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonCommaActionPerformed
        String currentText = calcTextFieldOutputEquation.getText();
        if (!currentText.contains(",")) {
            calcTextFieldOutputEquation.setText(currentText + ",");
        }
    }//GEN-LAST:event_calcButtonCommaActionPerformed

    private void calcButtonNegateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonNegateActionPerformed
        try {
            double currentValue = Double.parseDouble(calcTextFieldOutputEquation.getText().replace(',', '.'));
            currentValue = -currentValue;
            calcTextFieldOutputEquation.setText(Double.toString(currentValue).replace('.', ','));
        } catch (NumberFormatException e) {
            calcTextFieldOutputResult.setText("Error: Ungültiges Format!");
        }
    }//GEN-LAST:event_calcButtonNegateActionPerformed

    private void calcButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton0ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "0");
    }//GEN-LAST:event_calcButton0ActionPerformed

    private void calcButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton1ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "1");
    }//GEN-LAST:event_calcButton1ActionPerformed

    private void calcButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton2ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "2");
    }//GEN-LAST:event_calcButton2ActionPerformed

    private void calcButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton3ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "3");
    }//GEN-LAST:event_calcButton3ActionPerformed

    private void calcButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton4ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "4");
    }//GEN-LAST:event_calcButton4ActionPerformed

    private void calcButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton5ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "5");
    }//GEN-LAST:event_calcButton5ActionPerformed

    private void calcButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton6ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "6");
    }//GEN-LAST:event_calcButton6ActionPerformed

    private void calcButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton7ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "7");
    }//GEN-LAST:event_calcButton7ActionPerformed

    private void calcButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton8ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "8");
    }//GEN-LAST:event_calcButton8ActionPerformed

    private void calcButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButton9ActionPerformed
        calcTextFieldOutputEquation.setText(calcTextFieldOutputEquation.getText() + "9");
    }//GEN-LAST:event_calcButton9ActionPerformed

    private double evaluateExpression(String equation) {
        // Basic implementation of expression evaluation
        // This function needs to be robust for all possible inputs
        String[] tokens = equation.split(" ");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double secondNumber = Double.parseDouble(tokens[i + 1]);
            switch (operator) {
                case "+":
                    result += secondNumber;
                    break;
                case "-":
                    result -= secondNumber;
                    break;
                case "*":
                    result *= secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result /= secondNumber;
                    } else {
                        throw new NumberFormatException("Division durch Null!");
                    }
                    break;
                case "%":
                    result %= secondNumber;
                    break;
                default:
                    throw new NumberFormatException("Ungültiger Operator!");
            }
        }
        return result;
    }

    private boolean isLastCharacterOperator() {
        String text = calcTextFieldOutputEquation.getText();
        if (text.isEmpty()) {
            return false;
        }
        char lastChar = text.charAt(text.length() - 1);
        return lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%';
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
    private javax.swing.JButton calcButton0;
    private javax.swing.JButton calcButton1;
    private javax.swing.JButton calcButton2;
    private javax.swing.JButton calcButton3;
    private javax.swing.JButton calcButton4;
    private javax.swing.JButton calcButton5;
    private javax.swing.JButton calcButton6;
    private javax.swing.JButton calcButton7;
    private javax.swing.JButton calcButton8;
    private javax.swing.JButton calcButton9;
    private javax.swing.JButton calcButtonAdd;
    private javax.swing.JButton calcButtonAllClear;
    private javax.swing.JButton calcButtonClear;
    private javax.swing.JButton calcButtonComma;
    private javax.swing.JButton calcButtonDivide;
    private javax.swing.JButton calcButtonEquals;
    private javax.swing.JButton calcButtonMultiply;
    private javax.swing.JButton calcButtonNegate;
    private javax.swing.JButton calcButtonPercentage;
    private javax.swing.JButton calcButtonSubtract;
    private javax.swing.JTextField calcTextFieldOutputEquation;
    private javax.swing.JTextField calcTextFieldOutputResult;
    // End of variables declaration//GEN-END:variables
}
