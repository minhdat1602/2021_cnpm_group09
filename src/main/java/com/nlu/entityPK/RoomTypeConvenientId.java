package com.nlu.entityPK;

import java.io.Serializable;

public class RoomTypeConvenientId implements Serializable {
	private long roomTypeId;
	private long convientId;

	public long getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(long roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public long getConvientId() {
		return convientId;
	}

	public void setConvientId(long convientId) {
		this.convientId = convientId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (convientId ^ (convientId >>> 32));
		result = prime * result + (int) (roomTypeId ^ (roomTypeId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomTypeConvenientId other = (RoomTypeConvenientId) obj;
		if (convientId != other.convientId)
			return false;
		if (roomTypeId != other.roomTypeId)
			return false;
		return true;
	}

}
