package net.daum.copy;

import org.junit.Test;

public class OOPStyleCopyTest {
    private int EOF = -1;

    @Test

    public interface Reader {
        int getChar();
    }

    public interface Writer {
        void putChar(int c);
    }

    public void copy(Reader reader, Writer writer) {
        int c;
        while ((c = reader.getChar()) != EOF)
            writer.putChar(c);
    }

    public class Keyboard implements Reader {
        @Override
        public int getChar() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public class Printer implements Writer {
        @Override
        public void putChar(int c) {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }



    private void putChar(int c) {
        //To change body of created methods use File | Settings | File Templates.
    }

    private int getChar() {
        return 0;  //To change body of created methods use File | Settings | File Templates.
    }
}
