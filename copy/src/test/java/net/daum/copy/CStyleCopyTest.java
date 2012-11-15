package net.daum.copy;

import java.io.IOException;
import java.io.InputStreamReader;

public class CStyleCopyTest {

    private int EOF = -1;

    private boolean GptFlag = false;
    private boolean GpunchFlag = false;
    // Remember to clear

    public void copy() {
		int c;
		while ((c = (GptFlag ? readPt() : readKeyboard())) != EOF) {
            if(GpunchFlag)
                writePunch(c);
            else
                writePrinter(c);
        }
	}

    private void writePunch(int c) {
        //To change body of created methods use File | Settings | File Templates.
    }

    private int readPt() {
        return 0;
    }

    private void writePrinter(int c) {
        System.out.print(c);
    }

    private int readKeyboard() {
        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            return reader.read();
        } catch (IOException e) {
            throw new CStyleCopyTest.ReadException(e);
        }
    }

    public class ReadException extends RuntimeException {
        public ReadException(Exception e) {
            super(e);
        }
    }
}
