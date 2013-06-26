package hello;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.TableItem;

public class HelloMIDlet extends MIDlet implements CommandListener 
{
    private boolean midletPaused = false;
    double ans=0,result=0,temp=0;
    int selec;
    
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command Borrar;
    private Command Igual;
    private Command Calcular;
    private Form form;
    private ChoiceGroup cg;
    private TextField tf;
    private StringItem resSi;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() 
    { }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the
     * <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The
     * <code>display</code> instance is taken from
     * <code>getDisplay</code> method. This method is used by all actions in the
     * design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then
     * <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|42-preAction
            if (command == Calcular) {//GEN-END:|7-commandAction|1|42-preAction
                selec = cg.getSelectedIndex();
                
                switch(selec)
                {
                    case 0: // suma
                        temp=Double.parseDouble(tf.getString());
                        tf.setString("");
                        result= Double.parseDouble(resSi.getText()) + temp ;
                        resSi.setText(result+"");
                        
                        break;
                    case 1: //resta
                        temp=Double.parseDouble(tf.getString());
                        tf.setString("");
                        result = Double.parseDouble(resSi.getText()) - temp;
                        resSi.setText(result+"");
                        break;
                    case 2: // multiplicacion
                        temp=Double.parseDouble(tf.getString());
                        tf.setString("");
                        result = Double.parseDouble(resSi.getText()) * temp;
                        resSi.setText(result+"");
                        break;
                    case 3: // division
                        temp=Double.parseDouble(tf.getString());
                        tf.setString("");
                        result = Double.parseDouble(resSi.getText()) / temp;
                        resSi.setText(result+"");
                        break;
                    case 4: // potencia
                        temp=Double.parseDouble(tf.getString());
                        tf.setString("");
                        double tres = Double.parseDouble(resSi.getText());
                        if(temp==0){result=1;}
                        else
                        {    
                            for (int i = 1 ; i < (int)(temp) ; i++) 
                            { result = result*tres; }
                        }
                        resSi.setText(result+"");
                        break;
                    case 5: // raiz
                        
                        
                        if(!"".equals(tf.getString()))
                        {
                            temp = Double.parseDouble(tf.getString());
                            tf.setString("");
                            result = Math.sqrt(temp);
                        }
                        else
                        {
                            result = Math.sqrt(Double.parseDouble(resSi.getText()));
                        }
                        
                        resSi.setText(result+"");
                        break;
                    case 6: //sen
                        
                        
                        if(!"".equals(tf.getString()))
                        {
                            temp=Double.parseDouble(tf.getString());
                            tf.setString("");
                            result = (Math.sin(Math.toRadians(temp)));
                        }
                        else
                        { result = (Math.sin(Math.toRadians(Double.parseDouble(resSi.getText())))); }
                        
                        resSi.setText(result+"");
                        
                        break;
                    case 7: // cos
                        
                        if(!"".equals(tf.getString()) )
                        {
                            temp=Double.parseDouble(tf.getString());
                            tf.setString("");
                            result = (Math.cos(Math.toRadians(temp)));
                        }
                        else
                        { result = (Math.cos(Math.toRadians(Double.parseDouble(resSi.getText())))); }
                        
                        resSi.setText(result+"");
                        break;
                    case 8: //tan
                        
                        if(!"".equals(tf.getString()))
                        {
                            temp=Double.parseDouble(tf.getString());
                            tf.setString("");
                            result = (Math.tan(Math.toRadians(temp)));
                        }
                        else
                        { result = (Math.tan(Math.toRadians(Double.parseDouble(resSi.getText())))); }
                        
                        resSi.setText(result+"");
                        
                        break;
                    case 9: // e
                        temp = Math.E;
                        tf.setString(temp+"");
                        break;
                    case 10://PI
                        temp = Math.PI;
                        tf.setString(temp+"");
                        break;
                    case 11: //AC
                        tf.setString("");
                        resSi.setText(0.0+"");
                        break;
                    default:
                        break;
                }
                
                
                
//GEN-LINE:|7-commandAction|2|42-postAction
                // write post-action user code here
            } else if (command == exitCommand) {//GEN-LINE:|7-commandAction|3|19-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|4|19-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|7-postCommandAction
        }//GEN-END:|7-commandAction|5|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|6|
//</editor-fold>//GEN-END:|7-commandAction|6|




//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            form = new Form("Calculadora Cientifica", new Item[]{getTf(), getCg(), getResSi()});//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getExitCommand());
            form.addCommand(getCalcular());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|14-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tf ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initialized instance of tf component.
     *
     * @return the initialized component instance
     */
    public TextField getTf() {
        if (tf == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            tf = new TextField("Introduzca numero", "", 32, TextField.ANY);//GEN-LINE:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return tf;
    }
//</editor-fold>//GEN-END:|24-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cg ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initialized instance of cg component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getCg() {
        if (cg == null) {//GEN-END:|25-getter|0|25-preInit
            // write pre-init user code here
            cg = new ChoiceGroup("Operadores", Choice.EXCLUSIVE);//GEN-BEGIN:|25-getter|1|25-postInit
            cg.append("Suma (+)", null);
            cg.append("Resta (-)", null);
            cg.append("Multiplicaci\u00F3n (*)", null);
            cg.append("Divisi\u00F3n (/)", null);
            cg.append("Potencia (^)", null);
            cg.append("Ra\u00EDz", null);
            cg.append("Sen()", null);
            cg.append("Cos()", null);
            cg.append("Tan()", null);
            cg.append("e", null);
            cg.append("Pi", null);
            cg.append("AC", null);
            cg.setSelectedFlags(new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false});//GEN-END:|25-getter|1|25-postInit
            // write post-init user code here
        }//GEN-BEGIN:|25-getter|2|
        return cg;
    }
//</editor-fold>//GEN-END:|25-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Igual ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initialized instance of Igual component.
     *
     * @return the initialized component instance
     */
    public Command getIgual() {
        if (Igual == null) {//GEN-END:|33-getter|0|33-preInit
            // write pre-init user code here
            Igual = new Command("=", Command.OK, 0);//GEN-LINE:|33-getter|1|33-postInit
            // write post-init user code here
        }//GEN-BEGIN:|33-getter|2|
        return Igual;
    }
//</editor-fold>//GEN-END:|33-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Borrar ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initialized instance of Borrar component.
     *
     * @return the initialized component instance
     */
    public Command getBorrar() {
        if (Borrar == null) {//GEN-END:|35-getter|0|35-preInit
            // write pre-init user code here
            Borrar = new Command("Back", Command.BACK, 0);//GEN-LINE:|35-getter|1|35-postInit
            // write post-init user code here
        }//GEN-BEGIN:|35-getter|2|
        return Borrar;
    }
//</editor-fold>//GEN-END:|35-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Calcular ">//GEN-BEGIN:|41-getter|0|41-preInit
    /**
     * Returns an initialized instance of Calcular component.
     *
     * @return the initialized component instance
     */
    public Command getCalcular() {
        if (Calcular == null) {//GEN-END:|41-getter|0|41-preInit
            // write pre-init user code here
            Calcular = new Command("Operar", Command.ITEM, 0);//GEN-LINE:|41-getter|1|41-postInit
            // write post-init user code here
        }//GEN-BEGIN:|41-getter|2|
        return Calcular;
    }
//</editor-fold>//GEN-END:|41-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: resSi ">//GEN-BEGIN:|48-getter|0|48-preInit
    /**
     * Returns an initialized instance of resSi component.
     *
     * @return the initialized component instance
     */
    public StringItem getResSi() {
        if (resSi == null) {//GEN-END:|48-getter|0|48-preInit
            // write pre-init user code here
            resSi = new StringItem("Resultado", "0", Item.PLAIN);//GEN-BEGIN:|48-getter|1|48-postInit
            resSi.setLayout(ImageItem.LAYOUT_DEFAULT);//GEN-END:|48-getter|1|48-postInit
            // write post-init user code here
        }//GEN-BEGIN:|48-getter|2|
        return resSi;
    }
//</editor-fold>//GEN-END:|48-getter|2|



    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() { 
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() 
    {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    
    public void startApp() 
    {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    public void pauseApp() { 
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) { }
}
