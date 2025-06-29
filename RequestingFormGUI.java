/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package requestingform.gui;

/**
 *
 * @author JREscert
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
public class RequestingFormGUI extends JFrame{
    //panels
    private JPanel infoPnl;
    private JPanel contactPnl;
    private JPanel cellphonePnl;
    private JPanel tellphonePnl;
    private JPanel hometellPnl;
    private JPanel emailPnl;
    private JPanel verifyemailPnl;
    private JPanel residencePnl;
    private JPanel ressdescriptionPnl;
    private JPanel applyressPnl;
    private JPanel disabilityPnl;
    private JPanel disabilitydescPnl;
    private JPanel checkdisabilityPnl;
    private JPanel backPnl;
    private JPanel savePnl;
    private JPanel contactCombinedPnl;
    private JPanel residenceCombinedPnl;
    private JPanel disabilityCombinedPnl;
    private JPanel buttonCombinedPnl;
    private JPanel mainPnl;
    
    
    //labels
    private JLabel infoLbl;
    private JLabel contactLbl;
    private JLabel cellphoneLbl;
    private JLabel tellphoneLbl;
    private JLabel hometellLbl;
    private JLabel emailLbl;
    private JLabel verifyemailLbl;
    private JLabel resapplyLbl;
    private JLabel ressdescriptionLbl;
    private JLabel disabilityLbl2;
    private JLabel checkdisabilityLbl;
    
    
    //textfields
    private JTextField telephoneTxtFld;
    private JTextField hometelephoneTxtFld;
    private JTextField emailTxtFld;
    private JTextField verifyemailTxtFld;
   
    //combobox
    private JComboBox cellphoneBox;
    private JComboBox residenceBox;
    
    //checkbox
    private JCheckBox disabilityCheck;
    
    //buttons
    private JButton backBtn;
    private JButton saveBtn;
    
    public RequestingFormGUI(){
        //configure the GUI
    setTitle("RequestingForm");
    setSize(500,550);
    
    //create panels 
    contactPnl = new JPanel(new GridLayout(6,1,1,1));
    contactPnl.setBorder(new TitledBorder(new LineBorder(null,0),"Contact Information"));
    TitledBorder border = (TitledBorder)contactPnl.getBorder();
    contactPnl.getBorder();
    border.setTitleColor(Color.BLUE);
    
    
    infoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    cellphonePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    tellphonePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    hometellPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    emailPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    verifyemailPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    residencePnl = new JPanel(new GridLayout(2,1,1,1));
    residencePnl.setBorder(new TitledBorder(new LineBorder(null,0),"Residence Information"));
    TitledBorder border2 = (TitledBorder)residencePnl.getBorder();
    residencePnl.getBorder();
    border2.setTitleColor(Color.BLUE);
    ressdescriptionPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    applyressPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
   
    
    //disability Panels 
    disabilityPnl = new JPanel(new GridLayout(3,1,1,1));
    disabilityPnl.setBorder(new TitledBorder(new LineBorder(null,0),"Disability Information"));
    TitledBorder border3 = (TitledBorder)disabilityPnl.getBorder();
    disabilityPnl.getBorder();
    border3.setTitleColor(Color.BLUE);
    
    checkdisabilityPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    disabilitydescPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    buttonCombinedPnl = new JPanel(new GridLayout(1,0,0,0));
    
//    residenceCombinedPnl = new JPanel(new BorderLayout());
//    disabilityCombinedPnl = new JPanel(new BorderLayout());
//    contactCombinedPnl = new JPanel(new BorderLayout());
    
    backPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    savePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    mainPnl = new JPanel(new BorderLayout());
  
    
    //labels 
    infoLbl = new JLabel("Please enter your contact information");
    
    cellphoneLbl = new JLabel("Do you have a South African Cell Number?");
    cellphoneLbl.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
    tellphoneLbl = new JLabel("Work Telephone Number:  ");
    tellphoneLbl.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
    hometellLbl = new JLabel("Home Telephone Number: ");
    hometellLbl.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
    emailLbl = new JLabel("Email:           ");
    emailLbl.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
    verifyemailLbl = new JLabel("Verify Email: ");
    verifyemailLbl.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
    ressdescriptionLbl = new JLabel("Please select whether you want to apply for residence");
    resapplyLbl = new JLabel("Do you want to apply for residence?");
    resapplyLbl.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
    disabilityLbl2 = new JLabel("Please indicate whether you have any disabilities");
    checkdisabilityLbl = new JLabel("Do you have a disability?");
    checkdisabilityLbl.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
    
    //combo boxes
    cellphoneBox = new JComboBox();
    cellphoneBox.addItem("--Please select--");
    cellphoneBox.addItem("Yes");
    cellphoneBox.addItem("No");

    
    residenceBox= new JComboBox();
    residenceBox.addItem("--Please select--");
    residenceBox.addItem("Yes");
    residenceBox.addItem("No");
    
    //checkBox
    disabilityCheck = new JCheckBox();
    
    //textFields
    hometelephoneTxtFld = new JTextField(12);
    hometelephoneTxtFld.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    emailTxtFld = new JTextField(25);
    emailTxtFld.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    telephoneTxtFld = new JTextField(12);
    telephoneTxtFld.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    verifyemailTxtFld = new JTextField(25);
    verifyemailTxtFld.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    
    //buttons 
    backBtn = new JButton("Back");
    saveBtn = new JButton("next");
    
    //addcomponents to their respective panels 
    infoPnl.add(infoLbl);
    
    cellphonePnl.add(cellphoneLbl);
    cellphonePnl.add(cellphoneBox);
    
    tellphonePnl.add(tellphoneLbl);
    tellphonePnl.add(telephoneTxtFld);
    
    hometellPnl.add(hometellLbl);
    hometellPnl.add(hometelephoneTxtFld);
    emailPnl.add(emailLbl);
    emailPnl.add(emailTxtFld);
    
    verifyemailPnl.add(verifyemailLbl);
    verifyemailPnl.add(verifyemailTxtFld);
    
    //contact combined panel
    contactPnl.add(infoPnl);
    contactPnl.add(cellphonePnl);
    contactPnl.add(tellphonePnl);
    contactPnl.add(hometellPnl);
    contactPnl.add(emailPnl);
    contactPnl.add(verifyemailPnl);
    
    //residence panels
    ressdescriptionPnl.add(ressdescriptionLbl);
    applyressPnl.add(resapplyLbl);
    applyressPnl.add(residenceBox);
    residencePnl.add(ressdescriptionPnl);
    residencePnl.add(applyressPnl);
   
    //disabilityPanels
    disabilitydescPnl.add(disabilityLbl2);
    checkdisabilityPnl.add(checkdisabilityLbl);
    checkdisabilityPnl.add(disabilityCheck);
    disabilityPnl.add(disabilitydescPnl);
    disabilityPnl.add(checkdisabilityPnl);
    
    //button panels
    backPnl.add(backBtn);
    savePnl.add(saveBtn);
    buttonCombinedPnl.add(backPnl);
    buttonCombinedPnl.add(savePnl);
    disabilityPnl.add(buttonCombinedPnl);
    
    //main panel
    mainPnl.add(contactPnl,BorderLayout.NORTH);
    mainPnl.add(residencePnl,BorderLayout.CENTER);
    mainPnl.add(disabilityPnl,BorderLayout.SOUTH);
   
    //Add the main Panel
    add(mainPnl);
    pack();
    setVisible(true);
    }
    
    
}
