package shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifter implements IShapeShifter{
	
	private List<IShapeShifter> nodes;
		
		public ShapeShifter() {
			nodes = new ArrayList<IShapeShifter>();
		}

			@Override
			public IShapeShifter compose(IShapeShifter _shape) {
				this.addNode(_shape);
				return this;
			}
		
			@Override
			public int deepest() {
				return nodes.size();
			}
		
			@Override
			public IShapeShifter flat() {
				return null;
			}
		
			@Override
			public List<Integer> values() {
				List<Integer> total = new ArrayList<Integer>();
					
					for(IShapeShifter _shape : nodes) {
						total.addAll(_shape.values());
					}
				
					return total;
			}
			
			public void addNode(IShapeShifter _shape) {
				nodes.add(_shape);
			}
}
