package tpe.oo.metropolis;
public class Kapitalgesellschaft extends Unternehmen implements Koerperschaftsteuerpflichtig {

	protected Buerger[] gesellschafter;

	public int koerperschaftsteuer()
	{
		return 0;

	}

	@Override
	public int steuer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gewerbesteuer() {
		// TODO Auto-generated method stub
		return 0;
	}


}
