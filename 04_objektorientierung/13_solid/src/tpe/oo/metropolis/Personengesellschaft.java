package tpe.oo.metropolis;
public class Personengesellschaft extends Unternehmen implements Einkommensteuerpflichtig{

	protected Buerger[] inhaber;


	public int einkommensteuer()
	{
		 return 0;
	}
	@Override
	public int gewerbesteuer() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int steuer() {
		// TODO Auto-generated method stub
		return 0;
	}

}
