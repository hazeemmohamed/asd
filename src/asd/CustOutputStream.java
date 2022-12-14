/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asd;

import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTextArea;

/**
 *
 * @author Hp
 */
public class CustOutputStream extends OutputStream {

    private JTextArea textarea;
    public CustOutputStream(JTextArea output) {
        
        this.textarea=output;
    }
    @Override
    public void write(int b) throws IOException {
        // redirects data to the text area
        textarea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
        textarea.setCaretPosition(textarea.getDocument().getLength());
    }
    
}
