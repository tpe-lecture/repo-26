package tpe.oo.metropolis;
public interface Einkommensteuerpflichtig extends Steuerpflichtig {

	public static final int STEUERSATZ1 = 0;
	public static final int STEUERSATZ2 = 0;
	public static final int STEUERSATZ3 = 0;

	public abstract int einkommensteuer();

}
