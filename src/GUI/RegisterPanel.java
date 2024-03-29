/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.RentCarSystem;
import Entities.Concrete.Customer;
import Entities.Concrete.Mail;
import Helper.HelperMethods;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Lian La-Fey
 */
public class RegisterPanel extends javax.swing.JFrame {
    
    private String imgPath;
    
    public RegisterPanel() {
        initComponents();
        pass_JPass.setEchoChar((char)'\u2022');
        rstPasswrdAns_JPass.setEchoChar((char)'\u2022');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGroup = new javax.swing.ButtonGroup();
        profPic_jFileChsr = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        registerPanelPic = new javax.swing.JLabel();
        closeLogin_JLabel = new javax.swing.JLabel();
        page_JLayeredPane = new javax.swing.JLayeredPane();
        firstPage = new javax.swing.JPanel();
        fullName_JLabel = new javax.swing.JLabel();
        fullName_JText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        gender_JLabel = new javax.swing.JLabel();
        female_JRadio = new javax.swing.JRadioButton();
        male_JRadio = new javax.swing.JRadioButton();
        gender_JLabel1 = new javax.swing.JLabel();
        age_JText = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        goNextPage_JLabel = new javax.swing.JLabel();
        chooseAvatar_JLabel = new javax.swing.JLabel();
        phoneNum_JText = new javax.swing.JTextField();
        phoneNum_JLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        profileAvatar_JLabel = new javax.swing.JLabel();
        lblHomeAdd = new javax.swing.JLabel();
        tbxHomeAddr = new javax.swing.JTextArea();
        secondPage = new javax.swing.JPanel();
        userName_JLabel = new javax.swing.JLabel();
        userName_JText = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        email_JLabel = new javax.swing.JLabel();
        email_JText = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        pass_JPass = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        password_JLabel = new javax.swing.JLabel();
        hideShowPass_Btn = new javax.swing.JToggleButton();
        rstPasswrdQue_JLabel = new javax.swing.JLabel();
        rstPasswrdQue_JText = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        password_JLabel2 = new javax.swing.JLabel();
        rstPasswrdAns_JPass = new javax.swing.JPasswordField();
        jSeparator11 = new javax.swing.JSeparator();
        hideShowPass_Btn2 = new javax.swing.JToggleButton();
        goPreviousPage_JLabel = new javax.swing.JLabel();
        emailWarning_JLabel = new javax.swing.JLabel();
        lblComplete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(250, 233, 60));

        registerPanelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N

        closeLogin_JLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        closeLogin_JLabel.setForeground(new java.awt.Color(37, 41, 88));
        closeLogin_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLogin_JLabel.setText("X");
        closeLogin_JLabel.setToolTipText("");
        closeLogin_JLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeLogin_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLogin_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLogin_JLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerPanelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(closeLogin_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeLogin_JLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registerPanelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        page_JLayeredPane.setLayout(new java.awt.CardLayout());

        firstPage.setBackground(new java.awt.Color(37, 41, 88));
        firstPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullName_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        fullName_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        fullName_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        fullName_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullName_JLabel.setText("Full Name");
        fullName_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstPage.add(fullName_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 6, 263, -1));

        fullName_JText.setBackground(new java.awt.Color(37, 41, 88));
        fullName_JText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fullName_JText.setForeground(new java.awt.Color(255, 255, 255));
        fullName_JText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullName_JText.setText("Leyla Yılmaz");
        fullName_JText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstPage.add(fullName_JText, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 27, 263, 35));

        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
        firstPage.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 62, 263, 10));

        gender_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        gender_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        gender_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        gender_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gender_JLabel.setText("Gender");
        gender_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstPage.add(gender_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 78, 263, -1));

        genderBtnGroup.add(female_JRadio);
        female_JRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        female_JRadio.setForeground(new java.awt.Color(255, 255, 255));
        female_JRadio.setSelected(true);
        female_JRadio.setText("Female");
        firstPage.add(female_JRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 105, 75, -1));

        genderBtnGroup.add(male_JRadio);
        male_JRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        male_JRadio.setForeground(new java.awt.Color(255, 255, 255));
        male_JRadio.setText("Male");
        firstPage.add(male_JRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 105, 75, -1));

        gender_JLabel1.setBackground(new java.awt.Color(255, 255, 255));
        gender_JLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        gender_JLabel1.setForeground(new java.awt.Color(250, 233, 60));
        gender_JLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gender_JLabel1.setText("Age");
        gender_JLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstPage.add(gender_JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 148, 263, -1));

        age_JText.setBackground(new java.awt.Color(37, 41, 88));
        age_JText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        age_JText.setForeground(new java.awt.Color(255, 255, 255));
        age_JText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        age_JText.setText("27");
        age_JText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        age_JText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                age_JTextKeyTyped(evt);
            }
        });
        firstPage.add(age_JText, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 169, 263, 35));

        jSeparator3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
        firstPage.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 204, 263, 10));

        jSeparator4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
        firstPage.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 138, 263, 10));

        goNextPage_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        goNextPage_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        goNextPage_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        goNextPage_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goNextPage_JLabel.setText("Go, Next Page");
        goNextPage_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        goNextPage_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goNextPage_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goNextPage_JLabelMouseClicked(evt);
            }
        });
        firstPage.add(goNextPage_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 270, -1));

        chooseAvatar_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        chooseAvatar_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chooseAvatar_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        chooseAvatar_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseAvatar_JLabel.setText("Choose");
        chooseAvatar_JLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 233, 60), 2, true));
        chooseAvatar_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseAvatar_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseAvatar_JLabelMouseClicked(evt);
            }
        });
        firstPage.add(chooseAvatar_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 253, 162, 30));

        phoneNum_JText.setBackground(new java.awt.Color(37, 41, 88));
        phoneNum_JText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phoneNum_JText.setForeground(new java.awt.Color(255, 255, 255));
        phoneNum_JText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneNum_JText.setText("544 426 1267");
        phoneNum_JText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        phoneNum_JText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNum_JTextKeyTyped(evt);
            }
        });
        firstPage.add(phoneNum_JText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 338, 263, 35));

        phoneNum_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        phoneNum_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        phoneNum_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        phoneNum_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneNum_JLabel.setText("Phone Number");
        phoneNum_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstPage.add(phoneNum_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 311, 263, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
        firstPage.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 379, 263, 10));

        jSeparator5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
        firstPage.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 295, 270, 10));

        profileAvatar_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        profileAvatar_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        profileAvatar_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        profileAvatar_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileAvatar_JLabel.setText("Select Profile Avatar");
        profileAvatar_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstPage.add(profileAvatar_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 220, 263, -1));

        lblHomeAdd.setBackground(new java.awt.Color(255, 255, 255));
        lblHomeAdd.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblHomeAdd.setForeground(new java.awt.Color(250, 233, 60));
        lblHomeAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHomeAdd.setText("Home Address");
        lblHomeAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstPage.add(lblHomeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 395, 263, -1));

        tbxHomeAddr.setBackground(new java.awt.Color(46, 50, 72));
        tbxHomeAddr.setColumns(20);
        tbxHomeAddr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbxHomeAddr.setForeground(new java.awt.Color(255, 255, 255));
        tbxHomeAddr.setLineWrap(true);
        tbxHomeAddr.setRows(5);
        tbxHomeAddr.setText("Ayvalı Mah. Şehit Teğmen Kalmaz Cad. No:2 / 301, Altındağ / Ankara, Türkiye");
        tbxHomeAddr.setWrapStyleWord(true);
        tbxHomeAddr.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createEmptyBorder(3, 6, 3, 6)));
        firstPage.add(tbxHomeAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 422, 270, 90));

        page_JLayeredPane.add(firstPage, "card2");

        secondPage.setBackground(new java.awt.Color(37, 41, 88));
        secondPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userName_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        userName_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        userName_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        userName_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName_JLabel.setText("User Name");
        userName_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondPage.add(userName_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 6, 263, -1));

        userName_JText.setBackground(new java.awt.Color(37, 41, 88));
        userName_JText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userName_JText.setForeground(new java.awt.Color(255, 255, 255));
        userName_JText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userName_JText.setText("Lian La-Fey");
        userName_JText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondPage.add(userName_JText, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 30, 263, 35));

        jSeparator6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
        secondPage.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 68, 263, 10));

        email_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        email_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        email_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        email_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email_JLabel.setText("Email");
        email_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondPage.add(email_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 81, 80, -1));

        email_JText.setBackground(new java.awt.Color(37, 41, 88));
        email_JText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email_JText.setForeground(new java.awt.Color(255, 255, 255));
        email_JText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email_JText.setText("ibr.glmz19@gmail.com");
        email_JText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        email_JText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                email_JTextKeyReleased(evt);
            }
        });
        secondPage.add(email_JText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 105, 265, 35));

        jSeparator7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
        secondPage.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 143, 265, 10));

        pass_JPass.setBackground(new java.awt.Color(37, 41, 88));
        pass_JPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pass_JPass.setForeground(new java.awt.Color(255, 255, 255));
        pass_JPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_JPass.setText("123456");
        pass_JPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7));
        secondPage.add(pass_JPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 181, 190, 35));
        secondPage.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 219, 265, 10));

        password_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        password_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        password_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        password_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password_JLabel.setText("Password");
        password_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondPage.add(password_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 157, 265, -1));

        hideShowPass_Btn.setBackground(new java.awt.Color(37, 41, 88));
        hideShowPass_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeEye2.png"))); // NOI18N
        hideShowPass_Btn.setBorder(null);
        hideShowPass_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hideShowPass_Btn.setOpaque(true);
        hideShowPass_Btn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hideShowPass_BtnİtemStateChanged(evt);
            }
        });
        secondPage.add(hideShowPass_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 181, 35, 35));

        rstPasswrdQue_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        rstPasswrdQue_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        rstPasswrdQue_JLabel.setForeground(new java.awt.Color(250, 233, 60));
        rstPasswrdQue_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rstPasswrdQue_JLabel.setText("Reset Password Question");
        rstPasswrdQue_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondPage.add(rstPasswrdQue_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 231, 263, -1));

        rstPasswrdQue_JText.setBackground(new java.awt.Color(37, 41, 88));
        rstPasswrdQue_JText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rstPasswrdQue_JText.setForeground(new java.awt.Color(255, 255, 255));
        rstPasswrdQue_JText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rstPasswrdQue_JText.setText("Your Father's Name?");
        rstPasswrdQue_JText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondPage.add(rstPasswrdQue_JText, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 258, 263, 35));

        jSeparator9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
        secondPage.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 299, 263, 10));

        password_JLabel2.setBackground(new java.awt.Color(255, 255, 255));
        password_JLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        password_JLabel2.setForeground(new java.awt.Color(250, 233, 60));
        password_JLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password_JLabel2.setText("Reset Password Question");
        password_JLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondPage.add(password_JLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 315, 265, -1));

        rstPasswrdAns_JPass.setBackground(new java.awt.Color(37, 41, 88));
        rstPasswrdAns_JPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rstPasswrdAns_JPass.setForeground(new java.awt.Color(255, 255, 255));
        rstPasswrdAns_JPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rstPasswrdAns_JPass.setText("Metin Yılmaz");
        rstPasswrdAns_JPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7));
        secondPage.add(rstPasswrdAns_JPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 342, 190, 35));
        secondPage.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 383, 265, 10));

        hideShowPass_Btn2.setBackground(new java.awt.Color(37, 41, 88));
        hideShowPass_Btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeEye2.png"))); // NOI18N
        hideShowPass_Btn2.setBorder(null);
        hideShowPass_Btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hideShowPass_Btn2.setOpaque(true);
        hideShowPass_Btn2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hideShowPass_Btn2İtemStateChanged(evt);
            }
        });
        secondPage.add(hideShowPass_Btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 342, 35, 35));

        goPreviousPage_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        goPreviousPage_JLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        goPreviousPage_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        goPreviousPage_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goPreviousPage_JLabel.setText("Go, Previous Page");
        goPreviousPage_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        goPreviousPage_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goPreviousPage_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goPreviousPage_JLabelMouseClicked(evt);
            }
        });
        secondPage.add(goPreviousPage_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 411, 263, -1));

        emailWarning_JLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailWarning_JLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emailWarning_JLabel.setForeground(new java.awt.Color(255, 0, 0));
        emailWarning_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emailWarning_JLabel.setText("    ");
        emailWarning_JLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondPage.add(emailWarning_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 81, 86, 21));

        lblComplete.setBackground(new java.awt.Color(255, 255, 255));
        lblComplete.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblComplete.setForeground(new java.awt.Color(255, 255, 255));
        lblComplete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComplete.setText("Complete");
        lblComplete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 233, 60), 2, true));
        lblComplete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompleteMouseClicked(evt);
            }
        });
        secondPage.add(lblComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 484, 160, 40));

        page_JLayeredPane.add(secondPage, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(page_JLayeredPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(page_JLayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeLogin_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLogin_JLabelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeLogin_JLabelMouseClicked

    private void chooseAvatar_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseAvatar_JLabelMouseClicked
        // TODO add your handling code here:
        try {
            JFileChooser chooser = new JFileChooser( new File("").getAbsolutePath() + "\\src\\images\\" );
            chooser.showOpenDialog( null );
            File f = chooser.getSelectedFile();
            imgPath = f.getName();
            imgPath = "/images/" + imgPath;
            System.out.println(imgPath);
        } catch( NullPointerException ex ) {
            HelperMethods.showErrorMessage("You didn't choose a picture", "Not Selected Picture");
        }
    }//GEN-LAST:event_chooseAvatar_JLabelMouseClicked

    private void phoneNum_JTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNum_JTextKeyTyped
        // TODO add your handling code here:
        if ( (evt.getKeyChar() >= '0' &&  evt.getKeyChar() <= '9') || evt.getKeyChar() == ' ' ) {
            
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_phoneNum_JTextKeyTyped

    private void goNextPage_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goNextPage_JLabelMouseClicked
        HelperMethods.changePage(secondPage, page_JLayeredPane);
    }//GEN-LAST:event_goNextPage_JLabelMouseClicked

    private void email_JTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_JTextKeyReleased
        // TODO add your handling code here:
        if ( !HelperMethods.checkEmailWriting( email_JText.getText() ) ) {
            emailWarning_JLabel.setText("Invalid email!");
        } else {
            emailWarning_JLabel.setText("              ");
        }
    }//GEN-LAST:event_email_JTextKeyReleased

    private void hideShowPass_BtnİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hideShowPass_BtnİtemStateChanged
        // TODO add your handling code here:
        HelperMethods.hideShowPass(evt, hideShowPass_Btn, pass_JPass);
    }//GEN-LAST:event_hideShowPass_BtnİtemStateChanged

    private void hideShowPass_Btn2İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hideShowPass_Btn2İtemStateChanged
        // TODO add your handling code here:
        HelperMethods.hideShowPass(evt, hideShowPass_Btn2, rstPasswrdAns_JPass);
    }//GEN-LAST:event_hideShowPass_Btn2İtemStateChanged

    private void goPreviousPage_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goPreviousPage_JLabelMouseClicked
        // TODO add your handling code here:
        HelperMethods.changePage(firstPage, page_JLayeredPane);
    }//GEN-LAST:event_goPreviousPage_JLabelMouseClicked

    private void lblCompleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompleteMouseClicked
        // TODO add your handling code here:
        boolean isSuccesful = false;
        
        try {
            if ( RentCarSystem.isMailUsedAnyOtherUser( RentCarSystem.getMailByName(email_JText.getText()).getMail_id(), new Customer() ) ) {
                throw new Exception("This mail is already in use");
            } else if( !HelperMethods.controlPhoneNum( phoneNum_JText.getText(), userName_JText.getText() ) ) {
                throw new Exception("This phone number is already in use");
            } else if( RentCarSystem.isUserName_inUse( userName_JText.getText() ) ) {
                throw new Exception("This user name is already in use");
            } else if( imgPath == null ) {
                throw new Exception("You didn't choose an image");
            } else if( !HelperMethods.checkHomeAddress( tbxHomeAddr.getText() ) ) {
                throw new Exception("The home address must innclude just one \", \" regex");
            } else {
                
                String fullName = fullName_JText.getText();
                String gender = getGender();
                double totalCash = (int)(Math.random() * 500) + 100;
                int age = Integer.parseInt( age_JText.getText() );
                
                if ( age < 18 )
                    age = 18;
                
                String phoneNum = phoneNum_JText.getText();
                
                Mail mail = RentCarSystem.getMailByName( email_JText.getText() );
                
                if ( mail == null )
                    throw new NullPointerException("We couldn't found your Email Address...");
                
                String userName = userName_JText.getText();
                String homeAddress = tbxHomeAddr.getText();
                String password = String.valueOf(pass_JPass.getPassword());
                String resetPassQue = rstPasswrdQue_JText.getText();
                String resetPassAns = String.valueOf(rstPasswrdAns_JPass.getPassword());
                
                Customer customer = new Customer(fullName, gender, age, imgPath, phoneNum, mail, userName, homeAddress, password, resetPassQue, resetPassAns, totalCash);
                isSuccesful = RentCarSystem.addUserToDatabase( customer );
            }
            
            if ( isSuccesful )
                dispose();
            else
                HelperMethods.showErrorMessage("We couldn't include you our database", "Unexpected Error");
            
        } catch (NumberFormatException ex) {
            HelperMethods.showErrorMessage("One of the field you didn't enter a number", "Not Number");
        } catch (Exception ex) {
            HelperMethods.showErrorMessage(ex.getMessage(), "Register Error");
        }
        
        
    }//GEN-LAST:event_lblCompleteMouseClicked

    private void age_JTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_age_JTextKeyTyped
        // TODO add your handling code here:
        if ( (evt.getKeyChar() >= '0' &&  evt.getKeyChar() <= '9') ) {
            
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_age_JTextKeyTyped

    private String getGender() {
        String gender = "";
        if ( female_JRadio.isSelected() ) {
            gender = female_JRadio.getText();
        }else {
            gender = male_JRadio.getText();
        }
        
        return gender;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_JText;
    private javax.swing.JLabel chooseAvatar_JLabel;
    private javax.swing.JLabel closeLogin_JLabel;
    private javax.swing.JLabel emailWarning_JLabel;
    private javax.swing.JLabel email_JLabel;
    private javax.swing.JTextField email_JText;
    private javax.swing.JRadioButton female_JRadio;
    private javax.swing.JPanel firstPage;
    private javax.swing.JLabel fullName_JLabel;
    private javax.swing.JTextField fullName_JText;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel gender_JLabel;
    private javax.swing.JLabel gender_JLabel1;
    private javax.swing.JLabel goNextPage_JLabel;
    private javax.swing.JLabel goPreviousPage_JLabel;
    private javax.swing.JToggleButton hideShowPass_Btn;
    private javax.swing.JToggleButton hideShowPass_Btn2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblComplete;
    private javax.swing.JLabel lblHomeAdd;
    private javax.swing.JRadioButton male_JRadio;
    private javax.swing.JLayeredPane page_JLayeredPane;
    private javax.swing.JPasswordField pass_JPass;
    private javax.swing.JLabel password_JLabel;
    private javax.swing.JLabel password_JLabel2;
    private javax.swing.JLabel phoneNum_JLabel;
    private javax.swing.JTextField phoneNum_JText;
    private javax.swing.JFileChooser profPic_jFileChsr;
    private javax.swing.JLabel profileAvatar_JLabel;
    private javax.swing.JLabel registerPanelPic;
    private javax.swing.JPasswordField rstPasswrdAns_JPass;
    private javax.swing.JLabel rstPasswrdQue_JLabel;
    private javax.swing.JTextField rstPasswrdQue_JText;
    private javax.swing.JPanel secondPage;
    private javax.swing.JTextArea tbxHomeAddr;
    private javax.swing.JLabel userName_JLabel;
    private javax.swing.JTextField userName_JText;
    // End of variables declaration//GEN-END:variables
}
