package machine;

import java.util.Hashtable;
import java.util.Map;

public class Instructions {

	public Map <String, Byte> op = new Hashtable<String, Byte>();
	
	public void iniciaOperacoes(){
		
		op.put( "nop", (byte) 0x01);
		op.put( "loa", (byte) 0x02);
		op.put( "sto", (byte) 0x03);
		op.put( "add", (byte) 0x04);
		op.put( "or" , (byte) 0x05);
		op.put( "and", (byte) 0x06);
		op.put( "not", (byte) 0x07);
		op.put( "jmp", (byte) 0x08);
		op.put( "jpz", (byte) 0x09);
		op.put( "jpn", (byte) 0x0A);
		op.put( "sub", (byte) 0x0B);
		op.put( "xor", (byte) 0x0C);
		op.put( "shl", (byte) 0x0D);
		op.put( "shr", (byte) 0x0E);
		op.put( "dum", (byte) 0x0F);
		op.put( "hal", (byte) 0x10);
	}
	
	public Byte getCode(String upcode) {
		return op.get(upcode);
	}
}
