package tpe.oo.metropolis;
public class Syndikat implements Koerperschaftsteuerpflichtig{

	protected String name;
	protected Schurke[] schurken;

	public int koerpersteuer()
	{
		return 0;
	}

	@Override
	public int steuer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int koerperschaftsteuer() {
		// TODO Auto-generated method stub
		return 0;
	}

}
