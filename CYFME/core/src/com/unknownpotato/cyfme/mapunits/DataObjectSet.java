package com.unknownpotato.cyfme.mapunits;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DataObjectSet implements Set<DataObject> {
	
	private Set<DataObject> dataset;
	
	public DataObjectSet(){
		this.dataset = new HashSet<DataObject>();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.dataset.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.dataset.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return this.dataset.contains(o);
	}

	@Override
	public Iterator<DataObject> iterator() {
		// TODO Auto-generated method stub
		return this.dataset.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return this.dataset.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return this.dataset.toArray(a);
	}

	@Override
	public boolean add(DataObject e) {
		// TODO Auto-generated method stub
		return this.dataset.add(e);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return this.dataset.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return this.dataset.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends DataObject> c) {
		// TODO Auto-generated method stub
		return this.dataset.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return this.dataset.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return this.dataset.removeAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.dataset.clear();
		
	}

}
