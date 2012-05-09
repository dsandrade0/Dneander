package machine;

public abstract class AInstructions {

	//define as instruções
	public abstract void nop();
	public abstract void d_load(short op);
	public abstract void d_store(short op);
	public abstract void d_add(short op);
	public abstract void d_or(short op);
	public abstract void d_and(short op);
	public abstract void d_not();
	public abstract void d_jump(short op);
	public abstract void d_jump_on_zero(short op);
	public abstract void d_jump_on_negative(short op);
	public abstract void d_subtraction(short op);
	public abstract void d_exclusive_or(short op);
	public abstract void d_shift_left(short op);
	public abstract void d_shift_right(short op);
	public abstract void d_memory_dump();
	public abstract void d_halt();
}
