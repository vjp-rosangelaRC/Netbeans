/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e26;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author rdlrosac01
 */
public class MiObjectOutputStream extends ObjectOutputStream {
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    
    public MiObjectOutputStream() throws IOException, SecurityException{
        super();
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // No hacer nada
    }
}
