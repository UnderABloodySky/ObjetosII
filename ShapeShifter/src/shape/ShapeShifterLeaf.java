package shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter {
	
	private int value;
	
		public ShapeShifterLeaf(int _value) {
			value = _value;
		}

		@Override
		public IShapeShifter compose(IShapeShifter _shape) {
			ShapeShifter composite = new ShapeShifter();
			composite.addNode(this);
			return composite;
		}
	
		@Override
		public int deepest() {
			return 0;
		}
	
		@Override
		public IShapeShifter flat() {
			return this;
		}
	
		@Override
		public List<Integer> values() {
			List<Integer> values = new ArrayList<Integer>();
			values.add(this.value);
			return null;
		}

}
