package shape;

import java.util.List;

public interface IShapeShifter{
	
	public IShapeShifter compose(IShapeShifter _shape);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();

}
