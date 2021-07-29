package ca.bc.gov.ag.courts.ccd.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataSource;

/**
 * 
 * Helper class for InputSTream to DS conversion. 
 * 
 * @author smillar
 * 
 */
public class InputStreamDataSource implements DataSource {
    
	private InputStream inputStream;

    public InputStreamDataSource(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public InputStream getInputStream() throws IOException {
        return inputStream;
    }

    public OutputStream getOutputStream() throws IOException {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String getContentType() {
        return "*/*";
    }

    public String getName() {
        return "InputStreamDataSource";
    }
}
