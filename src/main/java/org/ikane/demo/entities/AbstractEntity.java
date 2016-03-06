package org.ikane.demo.entities;

import javax.persistence.Id;

public abstract class AbstractEntity<ID  extends Comparable<ID>> {
	
	
	public ID id;

	public abstract ID getId();
	
	@Id
	public abstract void setId(ID id);
}
