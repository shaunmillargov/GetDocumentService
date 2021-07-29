package ca.bc.gov.ag.courts.ccd.testingutils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Base64;

/**
 * This class is for testing purposes only and not part of the greater
 * application.
 * 
 * args[0] must be the full path to the base64 encoded input file minus the extension, for example: 
 * 
 * 	"D:\home\shaun\git_projects\getDocumentService\testfiles\10854"
 * 
 * @author 176899
 *
 */
public class Base64DecoderUtil {

	public static void main(String args[]) {

		try {
			
			@SuppressWarnings("resource")
			FileOutputStream fos = new FileOutputStream(args[0] + ".pdf");

			Base64.Decoder dec1 = Base64.getDecoder();
			InputStream is = dec1.wrap(new FileInputStream(args[0] + ".dat"));

			int _byte;
			while ((_byte = is.read()) != -1)
				fos.write(_byte);

			is.close();

		} catch (Exception ex) {
			System.out.println("Error caught: " + ex.getMessage());
		} finally {
			System.out.println("file " + args[0] + " decoded. See input folder."); 
		}
	}

}
